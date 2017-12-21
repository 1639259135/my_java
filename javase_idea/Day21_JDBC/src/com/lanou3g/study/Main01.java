package com.lanou3g.study;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main01 {
    /*
        JDBC, 全称:
            Java Database Connection
            java对数据库的连接规范

            mysql-connector-java-5.1.18-bin.jar
            这个包我们叫它驱动

            JDBC是规范,那么不同的数据库厂商可以对该规范有不同的实现

            所以使用不同的数据库的时候,
            只需要换不同的jar包(也就是驱动)即可
     */
    public static void main(String[] args) throws SQLException {
        //使用JDBC
        //1,注册驱动:
        DriverManager.registerDriver(new Driver());  //DriverManager: 驱动类

        //2,获得连接:
        Connection connection = DriverManager.getConnection(    //Connection是一个接口
                "jdbc:mysql://localhost:3306/day20", "root", "123");    //url: 统一资源定位符

        System.out.println(connection.getClass().getName());

        //3, 找个对象给我们干活
        //statement
        //这个接口,用来声明要执行的mysql语句
        String sql = "select * from hw_user";

        Statement statement = connection.createStatement();

        //4, 让这个对象去执行sql语句
        //执行查询语句时,得到的返回值类型为ResultSet
        //也就是我们常说的结果集
        ResultSet rs = statement.executeQuery(sql);

        //5,从resultSet中取出数据
        JdbcUtil.showRs(rs);

        //6, 关闭资源
        rs.close();
        statement.close();
        connection.close();



    }





}
