import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        //String configPath = "/Users/darthvader/Documents/code/config_files/guiworkergrpc.properties";
        String configPath = System.getProperty("gui_worker_grpc_config");

        //Get configs.
        logger.info("config file - " + configPath + "");

        //Getting configs.
        ConfigReader.configRead(configPath);

        //Start news thread.
        NewsReceiver newsReceiver = new NewsReceiver();
        newsReceiver.start();

        //Starting the server.
        GRPCserver server = new GRPCserver();
        try {
            server.start();
        } catch (Exception e) {
            logger.error("Could not start a server.");
        }
    }
}
