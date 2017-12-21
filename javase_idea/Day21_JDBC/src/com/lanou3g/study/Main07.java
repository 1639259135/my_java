package com.lanou3g.study;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main07 {
    public static void main(String[] args) {
        /**
         * 事物的四个特性:
         *      原子性
         *      一致性
         *      隔离性
         *      持久性
         *
         *     叫做 ACID
         */

        JdbcUtil.execute(coon -> {
            //设置为false,表示的后动提交
            //也就是开启了事物
            //默认是子动提交
            PreparedStatement pstate = null;
            try {
                coon.setAutoCommit(false);
                 pstate = coon.prepareStatement(
                        "DELETE FROM  hw_user WHERE uname = ?");
                pstate.setString(1,"张三");
                pstate.execute();
//                Class.forName("");

                pstate.setString(1,"李四");
                pstate.execute();

                //提交事物
                coon.commit();
//                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                //回滚,取消操作
                try {
                    coon.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            return pstate;
        });

    }
}
