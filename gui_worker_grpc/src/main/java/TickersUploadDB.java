import org.apache.log4j.Logger;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TickersUploadDB {
    private static final Logger logger = Logger.getLogger(TickersUploadDB.class);

    public static void upload() {
        // Connect to database.
        DBConnect.connectDB();

        try {
            Statement statement = DBConnect.connection.createStatement();
            DatabaseMetaData dbm = DBConnect.connection.getMetaData();
            ResultSet table = dbm.getTables(null, null, "screener_tickers", null);
            if (!table.next()) {
                statement.executeUpdate("CREATE TABLE screener_tickers(id SERIAL, ticker VARCHAR PRIMARY KEY, upload_date DATE DEFAULT CURRENT_TIMESTAMP)");
            }

            // Clear table for new tickers.
            statement.executeUpdate("DELETE FROM screener_tickers");

            for (int i = 0; i < UploadTickersService.tickers_to_upload.size(); i++) {
                statement.executeUpdate("INSERT INTO screener_tickers(ticker) VALUES('" + UploadTickersService.tickers_to_upload.get(i) + "') ON CONFLICT (ticker) DO NOTHING");
            }
            statement.close();
            // Close connection.
            try {
                DBConnect.connection.close();
            } catch (SQLException e) {
                logger.error("Error occurred while closing a connection with db.");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
