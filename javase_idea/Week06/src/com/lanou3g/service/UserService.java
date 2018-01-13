package com.lanou3g.service;

import com.lanou3g.dao.UserDao;
import com.lanou3g.domain.User;

import java.sql.SQLException;

public class UserService {

    private User user;
    private UserDao userDao = new UserDao();

    public User login(User u){
        try {
            user = userDao.queryByUsername(u.getUsername());
            System.out.println(user.toString() + "-----------");
            if (user != null){
                if (user.getPassword().equals(u.getPassword())) {
                    return user;
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
