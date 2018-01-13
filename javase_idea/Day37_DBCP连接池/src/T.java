import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class T {

    @Test
    public void t1() throws SQLException {

        Connection coon = DbcpUtil.getConnection();

        System.out.println(coon);

        coon.close();

    }

    @Test
    public void t2(){
        for (int i = 0; i < 20; i++) {
            Connection coon = DbcpUtil.getConnection();

            System.out.println(i +"----------" + coon);
        }
    }

    @Test
    public void t3(){

        for (int i = 0; i < 15; i++) {
            Connection connection = DbcpUtil.getConnection();

            System.out.println(i + "-----" + connection);
        }
    }

    @Test
    public void t4(){

        for (int i = 0; i < 20; i++) {
            Connection connection = DbcpUtil.getConnection();

            System.out.println(i + "-------" + connection);
        }
    }


}
