import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final Logger logger = Logger.getLogger(DBConnect.class);
    static Connection connection;
    public static void connectDB(){
        try {
            connection  = DriverManager.getConnection(ConfigReader.url_db, ConfigReader.user_db, ConfigReader.password_db);
        } catch (SQLException e) {
            logger.error("Could not connect to database.");
        }
    }
}
