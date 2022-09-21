import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;

public class GRPCserver extends Thread {
    private static final Logger logger = Logger.getLogger(GRPCserver.class);

    @Override
    public void run() {

        //setting up a server.
        Server server = ServerBuilder.forPort(9090).addService(new YahooTickerNewsSettingsService()).addService(new SpbExTickerService()).addService(new UploadTickersService()).build();

        //starting server.
        try {
            server.start();
            logger.info("Server started at 9090 port!");
            server.awaitTermination();
        } catch (InterruptedException | IOException ex) {
            logger.error("Cannot start a server.", ex);
        }
    }

}