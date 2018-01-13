package javase_practice.util;

import javase_practice.bean.Person;
import javase_practice.dao.JdbcUtil;
import javase_practice.util.SelectQueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OperationUsers {
    /**
     * UsersDao
     * 增:insert 删:delete 改:update 查:query
     */

    public static void insert(int id, String userName, String password){
        JdbcUtil.execute(coon -> {
            PreparedStatement pstate = coon.prepareStatement(
                    "INSERT INTO users VALUES (?,?,?)");

            pstate.setInt(1,id);
            pstate.setString(2,userName);
            pstate.setString(3,password);

            pstate.addBatch();
            pstate.executeBatch();
            return pstate;
        });
    }

    public static void delete(int id){
        JdbcUtil.execute(coon -> {
            PreparedStatement pstate = coon.prepareStatement(
                    "DELETE FROM users WHERE id = ?");
            pstate.setInt(1,id);
            pstate.addBatch();
            pstate.executeBatch();
            return pstate;
        });
    }

    public static void update(int id, String userName, String password){
        JdbcUtil.execute(coon -> {
            PreparedStatement pstate = coon.prepareStatement(
                    "UPDATE users SET userName = ? ,password = ? WHERE id = ?");
            pstate.setString(1,userName);
            pstate.setString(2,password);
            pstate.setInt(3,id);

            pstate.addBatch();
            pstate.executeBatch();
            return pstate;
        });
    }

    public  List<Person> queryUsers() throws SQLException {

        List<> query = new SelectQueryRunner().query(JdbcUtil.getConnection(), "select * from users;", new ArrayListHandler());

        return ;

    }

}
