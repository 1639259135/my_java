import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmpDao {

    public List<Employee> queryAll(String sql) throws SQLException {

        QueryRunner qr = new QueryRunner();
        Connection conn = DbcpUtils.getConnection();
        List<Employee> list = qr.query(conn, sql, new BeanListHandler<Employee>(Employee.class));

        conn.close();
        return list;
    }

    public long queryCount(String sql) throws SQLException {
        QueryRunner qr = new QueryRunner();
//        String sql = "select count(*) from employee";
        Connection conn = DbcpUtils.getConnection();
        Long count = qr.query(conn, sql, new ScalarHandler<>());

        conn.close();
        return count;
    }



}
