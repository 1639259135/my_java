import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DbcpUtil {

    static {
        Properties properties = new Properties();

        ClassLoader classLoader = DbcpUtil.class.getClassLoader();

        InputStream is = classLoader.getResourceAsStream("dbcp.properties");

        try {
            properties.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static DataSource dataSource;

    public static Connection getConnection(){

        try {
            Connection conn = dataSource.getConnection();

            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }





}
