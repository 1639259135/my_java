package com.lanou3g.study;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main04 {
    public static void main(String[] args) {

        /*
            调用JdbcUtil类时,该类会加载并进入内存
            也就会执行静态代码块,获得配置文件中的数据

            执行静态方法execute
            传入的是ExecuteInter接口的一个匿名实现类对象
            这里和我们学习线程的时候很类似

            传进去的对象,我们先叫他e
            在execute方法中(可以点进去看)
                第一步:根据配置文件中的数据建立连接
                第二步:调用e的execute方法,将连接传入
                    这里就会回来执行这个匿名实现类的execute方法
                    在这个方法中我们获得statement,执行sql语句
                    并且将statement作为值返回
                第三步:将e.execute()得到的返回值关闭
                第四步:关闭连接

         */


        //这种写法叫做接口回调
        JdbcUtil.execute(new ExecuteInter() {
            @Override
            public Statement execute(Connection coon) throws SQLException{

                    Statement statement = coon.createStatement();
                    String sql = "select * from hw_user";
                    ResultSet rs = statement.executeQuery(sql);
                    JdbcUtil.showRs(rs);
                    return statement;
            }
        });


    }
}
