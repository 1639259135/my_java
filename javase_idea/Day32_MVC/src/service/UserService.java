package service;

import dao.UserDao;
import domain.User;
import service.exception.InxalidUsernameException;
import service.exception.LoginException;
import service.exception.PasswordNotMathedException;

public class UserService {

    private UserDao userDao = new UserDao();

    public User login(User user) throws LoginException {

        User fromDb = userDao.queryByUsername(user.getUsername());
        if (fromDb == null){
            throw new InxalidUsernameException();
        }

        //如果查出的用户名与输入的用户名不相同
        if (!fromDb.getPassword().equals(user.getPassword())){
            //抛出匹配异常
            throw new PasswordNotMathedException();
        }

        return fromDb;

    }


}
