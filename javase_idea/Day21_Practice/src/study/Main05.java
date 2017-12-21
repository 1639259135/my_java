package study;

import java.sql.*;

public class Main05 {
    public static void main(String[] args) {

        JdbcUtil.execute(conn -> {
            PreparedStatement pstate = null;
            try {
                pstate = conn.prepareStatement(
                        "SELECT * FROM hw_user WHERE loc=? AND age>?");
                pstate.setString(1, "武汉");
                pstate.setInt(2, 25);
//            pstate.setString(2,"50");
                ResultSet rs = pstate.executeQuery();
                return pstate;
            } catch (SQLException e) {

            }
            return null;
        });
    }



}
