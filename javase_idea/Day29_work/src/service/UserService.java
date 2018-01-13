package service;

import dao.UserDao;
import domain.User;

import java.sql.SQLException;

public class UserService  {

    private User user;
    private UserDao userDao = new UserDao();

    public User login(User u){
        try {
            user = userDao.queryByUsername(u.getUsername());
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

    public String register(User user){

        userDao.insertUser(user);

        return "SUCCESS";
    }


}
