package javase_practice.util;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class SelectQueryRunner extends QueryRunner {
    @Override
    public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh) throws SQLException {
        conn.setAutoCommit(false);
        T t = super.query(conn,sql,rsh);
        conn.commit();
        conn.close();
        return t;
    }


    @Override
    public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params) throws SQLException {
        conn.setAutoCommit(false);
        T t = super.query(conn,sql,rsh,params);
        conn.commit();
        conn.close();
        return t;
    }
}
