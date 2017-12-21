package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day20", "root", "123");
        Statement state = conn.createStatement();
        int i = state.executeUpdate(
                "INSERT INTO hw_user VALUES (NULL ,'王武',30,'武汉')");

        state.close();
        conn.close();


    }
}
