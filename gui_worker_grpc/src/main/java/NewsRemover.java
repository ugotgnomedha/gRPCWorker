import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NewsRemover {
    public static ExecutorService executorService = Executors.newFixedThreadPool(6);

    public static void remove(String task, Integer timeWait) throws SQLException {
        // Connect to database.
        DBConnect.connectDB();
        Statement statement = DBConnect.connection.createStatement();
        DatabaseMetaData dbm = DBConnect.connection.getMetaData();
        ResultSet table = dbm.getTables(null, null, "screener_tickers_deleted", null);
        if (!table.next()) {
            statement.executeUpdate("CREATE TABLE screener_tickers_deleted(id SERIAL, ticker VARCHAR PRIMARY KEY, news_from VARCHAR, upload_date DATE DEFAULT CURRENT_TIMESTAMP)");
        }
        statement.close();
        // Close connection.
        try {
            DBConnect.connection.close();
        } catch (SQLException ignored) {
        }

        final Runnable removeBenzinga = () -> {  // Task one.
            try {
                DBConnect.connectDB();
                Statement statementOne  = DBConnect.connection.createStatement();
                Thread.sleep(timeWait * 1000);
                for (int i = 0; i < NewsReceiver.tickers_remove_benz_save.size(); i++) {
                    statementOne.executeUpdate("DELETE FROM screener_tickers WHERE ticker ='" + NewsReceiver.tickers_remove_benz_save.get(i) + "'");
                    statementOne.executeUpdate("INSERT INTO screener_tickers_deleted(ticker, news_from) VALUES('" + NewsReceiver.tickers_remove_benz_save.get(i) + "', 'Benzinga') ON CONFLICT (ticker) DO NOTHING");
                }
                statementOne.close();
                // Close connection.
                try {
                    DBConnect.connection.close();
                } catch (SQLException ignored) {
                }
            } catch (SQLException | InterruptedException ignored) {
            }
        };

        final Runnable removeThefly = () -> {  // Task one.
            try {
                DBConnect.connectDB();
                Statement statementTwo  = DBConnect.connection.createStatement();
                Thread.sleep(timeWait * 1000);
                for (int i = 0; i < NewsReceiver.tickers_remove_thefly_save.size(); i++) {
                    statementTwo.executeUpdate("DELETE FROM screener_tickers WHERE ticker ='" + NewsReceiver.tickers_remove_thefly_save.get(i) + "'");
                    statementTwo.executeUpdate("INSERT INTO screener_tickers_deleted(ticker, news_from) VALUES('" + NewsReceiver.tickers_remove_thefly_save.get(i) + "', 'TheFly') ON CONFLICT (ticker) DO NOTHING");
                }
                statementTwo.close();
                // Close connection.
                try {
                    DBConnect.connection.close();
                } catch (SQLException ignored) {
                }
            } catch (SQLException | InterruptedException ignored) {
            }
        };

        if (task.equals("benz")) {
            executorService.submit(removeBenzinga);
        } else if (task.equals("thefly")) {
            executorService.submit(removeThefly);
        }

    }
}