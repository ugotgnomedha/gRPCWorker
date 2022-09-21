import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.apache.log4j.Logger;

import java.sql.SQLException;

public class SpbExTickerService extends SPBexTickerGiverGrpc.SPBexTickerGiverImplBase {
    private static final Logger logger = Logger.getLogger(SpbExTickerService.class);

    @Override
    public void spbexchange(Empty request, StreamObserver<SPBexchangeTickers.workerReplySpb> responseObserver) {
        SPBexchangeTickers.workerReplySpb.Builder response = SPBexchangeTickers.workerReplySpb.newBuilder();

        // Connecting to database.
        DBConnect.connectDB();

        // Get tickers from spbexchange table.
        if (DBConnect.connection != null) {
            TickerGetterSpbEx.tickersFromSpbex();
        }

        // Put tickers from TickerGetter arraylist in response.
        response.addAllSpbexchangeTickers(TickerGetterSpbEx.tickers_spbex);
        response.addAllSpbexchangeUploadDate(TickerGetterSpbEx.upload_date_spbex);
        response.addAllSpbexchangeMarketCap(TickerGetterSpbEx.cap_spbex);
        response.addAllSpbexchangeDividendDate(TickerGetterSpbEx.dividend_spbex);

        // wrap up and send response.
        responseObserver.onNext(response.build());
        logger.info("SpbExchange tickers sent.");
        responseObserver.onCompleted();
        try {
            DBConnect.connection.close();
        } catch (SQLException e) {
            logger.error("Error occurred while closing a connection with db.");
        }

    }
}