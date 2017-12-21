package study;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main01 {
    public static void main(String[] args) throws SQLException{
//        第一步: 注册驱动
        DriverManager.registerDriver(new Driver());

//        第二步: 获得连接
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day20", "root", "123");

//        第三步: 创建对象Statement,用来执行sql语句
        String sql = "select * from hw_user";
        Statement state = conn.createStatement();

//        第四步: 让state去执行sql语句
        ResultSet rs = state.executeQuery(sql);

//        第五步: 读取数据:
        JdbcUtil.showRs(rs);

//        第六步: 关闭资源
        rs.close();
        conn.close();
        state.close();


    }

}
