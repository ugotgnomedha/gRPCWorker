import com.google.protobuf.Empty;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.ProtocolStringList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class NewsReceiver extends Thread {
    static ProtocolStringList tickers_remove_thefly = new LazyStringArrayList();
    static ProtocolStringList tickers_remove_thefly_save = new LazyStringArrayList();
    static ProtocolStringList tickers_remove_benz = new LazyStringArrayList();
    static ProtocolStringList tickers_remove_benz_save = new LazyStringArrayList();
    static String link_remove_thefly = "";
    static Boolean work = false;
    public static Integer newsRemoveTime = 0;

    public void run() {
        while (true) {
            try {
                if (newsRemoveTime > 0 & work) {
                    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

                    benzinga_notifyGrpc.benzinga_notifyBlockingStub clientStub_benz = benzinga_notifyGrpc.newBlockingStub(channel);

                    Empty empty = Empty.newBuilder().build();

                    Iterator<NewsBenzinga.benzinga_news> news_benz = clientStub_benz.newsBenzinga(empty);

                    fly_notifyGrpc.fly_notifyBlockingStub clientStub_thefly = fly_notifyGrpc.newBlockingStub(channel);

                    Iterator<NewsThefly.fly_news> news_fly = clientStub_thefly.newsThefly(empty);
                    Iterator<NewsThefly.fly_news> news_fly_ = clientStub_thefly.newsThefly(empty);
                    tickers_remove_benz = news_benz.next().getTickersBenzingaList();

                    tickers_remove_thefly = news_fly.next().getTickersFlyList();

                    if (!tickers_remove_thefly_save.equals(tickers_remove_thefly)) {
                        link_remove_thefly = news_fly_.next().getLinksFly(0);
                        tickers_remove_thefly_save = tickers_remove_thefly;
                        NewsRemover.remove("thefly", newsRemoveTime);
                    }

                    if (!tickers_remove_benz_save.equals(tickers_remove_benz)) {
                        tickers_remove_benz_save = tickers_remove_benz;
                        NewsRemover.remove("benz", newsRemoveTime);
                    }
                    channel.shutdown();
                    TimeUnit.MILLISECONDS.sleep(500);
                }

            } catch (SQLException | InterruptedException ignored) {
            }
        }
    }
}
