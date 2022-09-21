import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String url_db;
    public static String user_db;
    public static String password_db;

    public static void configRead(String configPath) {
        try {
            FileInputStream fis = new FileInputStream(configPath);
            Properties prop = new Properties();
            prop.load(fis);
            ////
            url_db = prop.getProperty("url_db");
            user_db = prop.getProperty("user_db");
            password_db = prop.getProperty("password_db");
            ////
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
