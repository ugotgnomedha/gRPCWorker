import io.grpc.stub.StreamObserver;
import org.apache.log4j.Logger;

import java.sql.SQLException;

public class YahooTickerNewsSettingsService extends YahooTickerGiverGrpc.YahooTickerGiverImplBase {
    private static final Logger logger = Logger.getLogger(YahooTickerNewsSettingsService.class);
    public static String newsType = "";
    @Override
    public void yahoo(SettingsReceiver.settingsRequestYahoo request, StreamObserver<SettingsReceiver.workerReplyYahoo> responseObserver) {
        SettingsReceiver.workerReplyYahoo.Builder response = SettingsReceiver.workerReplyYahoo.newBuilder();

        // Connecting to database.
        DBConnect.connectDB();

        // Get tickers from yahoo table.
        if (DBConnect.connection != null) {
            TickerGetterYahoo.tickersFromYahoo(request.getDividentBefore(), request.getDividentAfter(), request.getStatisticsBefore(),
                    request.getCapitalizationLowest(), request.getCurrency());
        }

        try {
            //Work with news.
            newsType = request.getNewsType();
            NewsReceiver.newsRemoveTime = request.getNewsRemoveTime();
            if (request.getNewsIgnore() == 1) {
                NewsReceiver.work = true;
            } else if (request.getNewsIgnore() == 0) {
                NewsReceiver.work = false;
            }
        } catch (Exception ignored) {
        }

        // Put tickers from TickerGetter arraylist in response.
        response.addAllYahooTickers(TickerGetterYahoo.tickers_yahoo);
        response.addAllYahooUploadDate(TickerGetterYahoo.upload_date_yahoo);
        response.addAllYahooMarketCap(TickerGetterYahoo.cap_yahoo);
        response.addAllYahooDividendDate(TickerGetterYahoo.dividend_yahoo);

        //wrap up and send response.
        responseObserver.onNext(response.build());
        logger.info("Yahoo tickers sent.");
        responseObserver.onCompleted();
        try {
            DBConnect.connection.close();
        } catch (SQLException e) {
            logger.error("Error occurred while closing a connection with db.");
        }

    }
}
