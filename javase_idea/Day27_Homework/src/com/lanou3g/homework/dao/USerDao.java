package com.lanou3g.homework.dao;

import com.lanou3g.homework.dao.UserQueryRunner;
import com.lanou3g.homework.domain.User;
import com.lanou3g.homework.utils.JdbcUtil;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class USerDao {

    public static List showUser() throws SQLException {
        List<User> users = new UserQueryRunner().query(
                JdbcUtil.getConnection(),
                "select * from hw_user",
                new BeanListHandler<>(User.class));
//        System.out.println(users.toString());
        return users;
    }


//    public static void insertUser(String uname,String age,String loc){
//        JdbcUtil.execute(coon -> {
//            PreparedStatement pstate = coon.prepareStatement(
//                    "INSERT INTO hw_user VALUES (NULL ,?,?,?)");
//            pstate.setString(1,uname);
//            pstate.setString(2,age);
//            pstate.setString(3,loc);
//
//            pstate.addBatch();
//            pstate.executeBatch();
//            return pstate;
//        });
//
//    }


    public static void insertUser(User user){
        JdbcUtil.execute(coon -> {
            PreparedStatement pstate = coon.prepareStatement(
                    "INSERT INTO hw_user VALUES (NULL ,?,?,?)");
            pstate.setString(1,user.getUname());
            pstate.setInt(2,user.getAge());
            pstate.setString(3,user.getLoc());

            pstate.addBatch();
            pstate.executeBatch();
            return pstate;
        });

    }
}
