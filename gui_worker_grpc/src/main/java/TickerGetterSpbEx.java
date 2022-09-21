import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TickerGetterSpbEx {
    private static final Logger logger = Logger.getLogger(TickerGetterSpbEx.class);
    static ArrayList<String> tickers_spbex = new ArrayList<>();
    static ArrayList<String> cap_spbex = new ArrayList<>();
    static ArrayList<String> dividend_spbex = new ArrayList<>();
    static ArrayList<String> upload_date_spbex = new ArrayList<>();

    public static void tickersFromSpbex() {
        tickers_spbex.clear();
        upload_date_spbex.clear();
        dividend_spbex.clear();
        cap_spbex.clear();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        try {
            Statement statement = DBConnect.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT ticker FROM spbexchange_parser WHERE upload_date = '" + dtf.format(now) + "'");
            while (rs.next()) {
                tickers_spbex.add(rs.getString(1));
            }
            rs.close();
            ResultSet rs_ = statement.executeQuery("SELECT upload_date, market_cap_intraday, dividend_date_three_ FROM yahoo_parser WHERE upload_date = '" + dtf.format(now) + "'");
            while (rs_.next()) {
                if (null == rs_.getString(1)){
                    upload_date_spbex.add("---");
                } else {
                    upload_date_spbex.add(rs_.getString(1));
                }
                if (null == rs_.getString(2)) {
                    cap_spbex.add("---");
                } else {
                    cap_spbex.add(rs_.getString(2));
                }
                if (null == rs_.getString(3)) {
                    dividend_spbex.add("---");
                } else {
                    dividend_spbex.add(rs_.getString(3));
                }
            }
            statement.close();
        } catch (SQLException e) {
            logger.error("An error occured while getting tickers from spbexchange table.");
        }

    }
}
