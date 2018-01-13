package dao;

import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public  User queryByUsername(String username) throws SQLException {
        User user = new QueryRunner().query(
                JdbcUtil.getConnection(),
                "select * from user where username =?",
                new BeanHandler<>(User.class),
                username);

        return user;
    }

    public  void insertUser(User user){

        JdbcUtil.execute(coon -> {
            PreparedStatement pstate = coon.prepareStatement("INSERT INTO user VALUES (null,?,?)");
            pstate.setString(1,user.getUsername());
            pstate.setString(2,user.getPassword());
            System.out.println("账号: " + user.getUsername() + "\t密码: " + user.getPassword());
            pstate.addBatch();
            pstate.executeBatch();

            return pstate;
        });

    }



}
