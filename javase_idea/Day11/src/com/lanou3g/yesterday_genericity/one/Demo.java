package com.lanou3g.yesterday_genericity.one;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static <T> T getInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {

        //屎用类对象clazz,创建一个对象
        //类对象中指定了泛型T
        //就意味着,根据这个类创建出来的对象的类型,就是T
        T t = clazz.newInstance();
        return t;
    }


    public static Object getInstance(String className) throws Exception {

        //只需要使用一个字符串形式的类名
        //即可获得该类的类对象
        Class<?> aClass = Class.forName(className);

        //通过类对象,获得该类型的对象
        Object o = aClass.newInstance();

        //通过类对象的方法,获得类对象的name属性
        Field name = aClass.getDeclaredField("name");


        //参数1,方法名
        //参数2,参数列表中每个额参数的类型
        //参数2接受的是一个可变参数
        //所以可以传入任意个参数类型
        Method show = aClass.getDeclaredMethod("show", String.class);

        show.setAccessible(true);
        show.invoke(o,"钓鱼吧");


        //打破私有权的限制
        name.setAccessible(true);

        //调用属性对象name的set方法
        //参数1接收的是,要给哪个对象的属性name赋值
        //参数2,要赋的值
        name.set(o,"盖伦");

        return o;
    }


}
