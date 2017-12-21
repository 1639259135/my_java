package com.lanou3g.study;

import com.lanou3g.study.utils.JdbcUtil;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class WhQueryRunnerTest {
    /*
        根据需求结果的类型,
            选择ResultSetHandler的实现类
        如果结果集为单行单列: ScalarHandler
        如果想要一个对象的集合: BeanListHandler
        如果想要一个对象: BeanHandler
        如果想要一个Map: MapHandler
        如果想要一个Map集合: MapListHandler
        如果想要一个数组: ArrayHandler
        如果想要一个数组的集合: ArrayListHandler

     */


    @Test
    public void queryByParams() throws SQLException {
        Long query =
                new WhQueryRunner().query(
                        JdbcUtil.getConnection(), "select count(*) from hw_user",
                        new ScalarHandler<Long>());
//                new ArrayListHandler());
//                new ArrayHandler()
//                "李小龙");

        //Number类
        //可以接收任何数值类型的值
        //Number类中有获取各种整形值的方法
        Number number = query;
        int i = number.intValue();
        System.out.println(i);

        System.out.println(query);


//        for (Object[] objects : query) {
//            System.out.println(Arrays.toString(objects));
//        }


//        System.out.println(query);

    }
    @Test
    public void queryByBean() throws SQLException {
        List<User> users =
                new WhQueryRunner().query(
                JdbcUtil.getConnection(), "select * from hw_user",

                new BeanListHandler<>(User.class)
//                new BeanHandler<User>(User.class)
        );

        System.out.println(users);
    }


    @Test
    public void queryByMap() throws SQLException {

//        Map<String, Object> objectMap =
        List<Map<String, Object>> mapList =
                new WhQueryRunner().query(
                        JdbcUtil.getConnection(), "select * from hw_user",
                        new MapListHandler()
//                new MapHandler()
        );

        System.out.println(mapList.toString());

    }

}