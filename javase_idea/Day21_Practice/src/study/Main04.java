package study;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main04 {
    public static void main(String[] args) {
        JdbcUtil.execute(new ExecuteInter() {
            @Override
            public Statement execute(Connection conn) throws SQLException {
                Statement state = conn.createStatement();
                String sql = "select * from hw_stu";
                ResultSet rs = state.executeQuery(sql);
                JdbcUtil.showRs(rs);
                return state;
            }
        });






    }
}
