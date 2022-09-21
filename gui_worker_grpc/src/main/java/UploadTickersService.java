import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class UploadTickersService extends UploadTickersGrpc.UploadTickersImplBase {
    private static final Logger logger = Logger.getLogger(UploadTickersService.class);
    public static ArrayList<String> tickers_to_upload = new ArrayList<>();

    @Override
    public void upload(UploadTickersToDB.screenerTickers request, StreamObserver<Empty> responce) {
        logger.info("Received tickers to upload.");
        for (int i = 0; i < request.getTickersList().size(); i++) {
            tickers_to_upload.add(request.getTickers(i));
        }

        // Upload tickers to database.
        TickersUploadDB.upload();

        //release request.
        responce.onNext(null);
        responce.onCompleted();
    }
}
