package study;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main07 {
    public static void main(String[] args) {

        JdbcUtil.execute(conn -> {
            try {
                conn.setAutoCommit(false);
                PreparedStatement pstate = conn.prepareStatement(
                        "DELETE FROM hw_user WHERE uname=?");
                pstate.setString(1,"SB");
                pstate.execute();

                Class.forName("");

                pstate.setString(1,"DSB");
                pstate.execute();

                //提交事物
                conn.commit();
                return pstate;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();

                //回滚,取消操作
                conn.rollback();
            }
            return null;
        });








    }



}
