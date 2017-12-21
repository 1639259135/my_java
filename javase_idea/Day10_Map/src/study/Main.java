package study;

import java.util.Collection;
import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        /**
         * Map是什么?
         * 是一个接口
         * Map也可以存放数据
         * Map存放的数据,都是键值对形式的
         * 什么是键值对?
         *
         *          name = "zhangsan"
         *          age = 14;
         *          gender = "男"
         *     这种一一对应关系 ,就叫做键值对
         *
         */

        Map map = new HashMap();

        //put 方法,向Map中添加一个信息
        //括号中接受两个值
        //第一个表示key, 键
        //第二个表示value, 值

        map.put("name","王武");
        map.put("gender","男");
        map.put("age",14);

//        System.out.println(m.get("name"));

        first(map);
        second(map);

        iterate(map);
        fore(map);


    }

    private static void fore(Map map) {
        // 第四种遍历：
        System.out.println("第四种：通过Map.values()遍历所有的value，但不能遍历key");
        for (Object o : map.values()) {
            System.out.println("value= " + o);
        }
    }

    private static void first(Map map) {
        System.out.println("开始遍历了");

        for (Object o : map.keySet()) {
            //m.keySet就是将map中所有的key拿出来

            //增强for循环,也叫foreach
            //冒号后面接收的是一个集合
            //          也就是接受了一堆数据
            System.out.println(map.get(o).toString());
        }
    }

    private static void second(Map map) {
        System.out.println("遍历map的第二种方式");

        //获得map这个集合中的所有的键值对
        //放进了set这个集合
        Set set = map.entrySet();
        /**
         * Collection是一个接口
         * List和Set都是Collection的子接口
         *
         * 我们使用的集合ArrayList只是List的一个实现类
         *
         * Set和List区别:
         *      List有序(通过角标找元素),可重复
         *      Set无序,不可重复
         */

        for (Object o : set){

            //o这个引用指向的对象类型为:HashMap$Node
            //但是这里我们将o强转成Map.Entry的时候还不报错是因为

            //HashMap$Node是Map.Entry的实现类

            //一个Entry的实现类对象,就表示一个键值对
            //可以使用这个对象,获得key和value
            Map.Entry entry = (Map.Entry) o;

            System.out.println("key的值为:" + entry.getKey() + "----value的值为:" + entry.getValue());
            System.out.println(o.getClass().getName());//获取o的类型
        }
    }

    private static void iterate(Map map) {
        //迭代器:Iterator

        System.out.println("开始使用迭代去遍历map集合");
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            //如果有下一个,就返回一个true,进入下一次循环

            //获得的对象,是Object类型的
            //父类的引用next,只能屎用父类的方法
            //无法屎用子类独有的方法
            Object next = iterator.next();

            //所有要把父类next强转成子类
            Map.Entry entry = (Map.Entry) next;

            System.out.println("key为:" + entry.getKey() + "/t" + "value为:" + entry.getValue());

        }
    }

}
