package study;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main08 {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from hw_user";
        List<User> query = qr.query(JdbcUtil.getConnection(), sql, new ResultSetHandler<List<User>>() {
            @Override
            public List<User> handle(ResultSet resultSet) throws SQLException {

                List<User> users = new ArrayList<>();
                while (resultSet.next()){
                 User user = new User();
                 user.setId(resultSet.getInt(1));
                 user.setUname(resultSet.getString(2));
                 user.setAge(resultSet.getInt(3));
                 user.setLoc(resultSet.getString(4));
                 users.add(user);
                }
                return users;
            }
        });
        System.out.println(query);
    }

}
