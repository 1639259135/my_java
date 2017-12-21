package study;

import java.sql.PreparedStatement;

public class Main06 {
    public static void main(String[] args) {

        JdbcUtil.execute(conn -> {
            PreparedStatement pstate = conn.prepareStatement(
                    "INSERT INTO hw_user VALUES (NULL ,'王麻子',25,'日本')");
            pstate.addBatch();
            pstate.addBatch(
                    "INSERT INTO hw_user VALUES (NULL ,'SB',999,'anywhere')");
            pstate.addBatch(
                    "INSERT INTO hw_user VALUES (NULL ,'DSB',9999,'anywhere')");
            pstate.executeBatch();

            return pstate;
        });
    }
}
