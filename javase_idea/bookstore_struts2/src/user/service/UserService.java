package user.service;

import user.dao.UserDao;
import user.domain.User;

import java.sql.SQLException;

public class UserService {

    UserDao userDao = new UserDao();

    public void insertUser(User user){

        try {
            userDao.insertUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}