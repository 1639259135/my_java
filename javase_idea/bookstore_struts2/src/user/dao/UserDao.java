package user.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import user.domain.User;
import utils.DbcpUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {

    private String sql = "";

    public User queryByUsername(String username) throws SQLException {

        QueryRunner qr = new QueryRunner();
        sql = "select * from user";
        Connection connection = DbcpUtil.getConnection();
        User user = qr.query(connection, sql, new BeanHandler<User>(User.class), username);
        connection.close();

        return user;
    }


    public void insertUser(User user) throws SQLException {

        QueryRunner qr = new QueryRunner();
        sql = "insert into user values(?,?,?,?,?,?)";
        Connection connection = DbcpUtil.getConnection();
        qr.insert(connection,sql,new BeanHandler<User>(User.class),
                user.getUid(),user.getUsername(),user.getPassword(),user.getEmail(),user.getCode(),user.getState());

        connection.close();
    }





}
