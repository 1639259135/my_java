package com.lanou3g.study;

import java.sql.*;

public class Main05 {
    public static void main(String[] args) {
        /**
         * 1, PreparedStatement可以使用动态参数
         *      Statement只能执行静态的sql语句
         *
         * 2, 防止sql注入
         *      什么是sql注入:
         *      select * from user
         */
        String user = "张三";
        String password = "123";
        String sql = "select * from user where username=" + user + "and password=" + password;


        JdbcUtil.execute(coon -> {
            try {
                PreparedStatement pstate = coon.prepareStatement(
                        "SELECT * FROM hw_user WHERE loc=? AND age>?");
                pstate.setString(1,"北京");
                pstate.setInt(2,20);

                ResultSet rs = pstate.executeQuery();

                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null;
        });




    }





}
