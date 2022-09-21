import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

// select * from screener_tickers where (id, ticker) = (43, 'CB') and upload_date > '2022-01-10'

public class TickerGetterYahoo {
    private static final Logger logger = Logger.getLogger(TickerGetterYahoo.class);
    static ArrayList<String> tickers_yahoo = new ArrayList<>();
    static ArrayList<String> upload_date_yahoo = new ArrayList<>();
    static ArrayList<String> cap_yahoo = new ArrayList<>();
    static ArrayList<String> dividend_yahoo = new ArrayList<>();
    static Statement statement;

    public static void tickersFromYahoo(Integer dividend_before, Integer dividend_after, Integer stats_days, Long capitalization_lowest, String currency) {
        tickers_yahoo.clear();
        upload_date_yahoo.clear();
        cap_yahoo.clear();
        dividend_yahoo.clear();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        String sql_request = "SELECT ticker, upload_date, market_cap_intraday, dividend_date_three_ FROM yahoo_parser WHERE currency = '" + currency + "' AND market_cap_intraday > '" + capitalization_lowest + "' AND upload_date > '" + dtf.format(now) + "'::date - '" + stats_days + " day'::interval AND dividend_date_three_ <= '" + dtf.format(now) + "'::date - '" + dividend_before + " day'::interval";
        String sql_request_ = "SELECT ticker, upload_date, market_cap_intraday, dividend_date_three_ FROM yahoo_parser WHERE currency = '" + currency + "' AND market_cap_intraday > '" + capitalization_lowest + "' AND upload_date > '" + dtf.format(now) + "'::date - '" + stats_days + " day'::interval AND dividend_date_three_ >= '" + dtf.format(now) + "'::date + '" + dividend_before + " day'::interval";

        try {
            statement = DBConnect.connection.createStatement();
        } catch (SQLException ignored) {
        }

        if (currency.equals("") & capitalization_lowest == 0 & stats_days == 0 & dividend_after == 0 & dividend_after == 0) {
            sql_request = "SELECT ticker, upload_date, market_cap_intraday, dividend_date_three_ FROM yahoo_parser";
            try {
                ResultSet rs = statement.executeQuery(sql_request);
                while (rs.next()) {
                    tickers_yahoo.add(rs.getString(1));
                    upload_date_yahoo.add(rs.getString(2));
                    if (null == rs.getString(3)){
                        cap_yahoo.add("---");
                    } else {
                        cap_yahoo.add(rs.getString(3));
                    }
                    if (null == rs.getString(4)){
                        dividend_yahoo.add("---");
                    } else {
                        dividend_yahoo.add(rs.getString(4));
                    }
                }
                rs.close();
            } catch (SQLException ignored) {
            }
        } else {
            if (currency.equals("")) {
                sql_request = sql_request.replaceAll("currency = '" + currency + "' AND ", "");
                sql_request_ = sql_request_.replaceAll("currency = '" + currency + "' AND ", "");
            }
            if (capitalization_lowest == 0) {
                sql_request = sql_request.replaceAll("market_cap_intraday > '" + capitalization_lowest + "' AND ", "");
                sql_request_ = sql_request_.replaceAll("market_cap_intraday > '" + capitalization_lowest + "' AND ", "");
            }
            if (stats_days == 0) {
                sql_request = sql_request.replaceAll("upload_date > '" + dtf.format(now) + "'::date - '" + stats_days + " day'::interval AND ", "");
                sql_request_ = sql_request_.replaceAll("upload_date > '" + dtf.format(now) + "'::date - '" + stats_days + " day'::interval AND ", "");
            }
            if (dividend_after == 0 || dividend_after == 0) {
                sql_request = sql_request.replaceAll("AND dividend_date_three_ <= '" + dtf.format(now) + "'::date - '" + dividend_before + " day'::interval", "");
                sql_request_ = sql_request_.replaceAll("AND dividend_date_three_ >= '" + dtf.format(now) + "'::date \\+ '" + dividend_after + " day'::interval", "");
            }

            try {
                dataGetter(sql_request);
                dataGetter(sql_request_);
            } catch (SQLException ignored) {
            }

            try {
                statement.close();
            } catch (SQLException ignored) {
                logger.error("Could not get data from given settings.");
            }
        }
    }

    private static void dataGetter(String sql_request_) throws SQLException {
        ResultSet rs_ = statement.executeQuery(sql_request_);
        while (rs_.next()) {
            tickers_yahoo.add(rs_.getString(1));
            upload_date_yahoo.add(rs_.getString(2));
            if (null == rs_.getString(3)){
                cap_yahoo.add("---");
            } else {
                cap_yahoo.add(rs_.getString(3));
            }
            if (null == rs_.getString(4)){
                dividend_yahoo.add("---");
            } else {
                dividend_yahoo.add(rs_.getString(4));
            }
        }
        rs_.close();
    }
}
