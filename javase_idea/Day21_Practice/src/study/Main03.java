package study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Main03 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/day20";
        Properties info = new Properties();
        info.load(new FileReader("src/jdbc.properties"));
        Connection conn = DriverManager.getConnection(url, info);
        Statement state = conn.createStatement();
        String update = "update hw_user set uname='张三' where uname='王武'";
        boolean execute = state.execute(update);
        state.close();
        conn.close();

    }
}
