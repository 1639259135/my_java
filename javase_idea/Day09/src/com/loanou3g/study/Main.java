package com.loanou3g.study;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         psvm     main方法快捷键
         sout 输出语句快捷键

         */

        /**
         集合
         什么是集合?


         在使用数组时,发现数组的长度,在初始化是就定义好了
         不可改变

         这时我们来学习一下集合,
         集合也可以装载一些元素
         并且,集合的大小,是可以改变的
         */

        //创建了一个集合对象
        List list = new ArrayList();

        //通过观察发现,ist是一个接口
        //那么ArrayList一定是List接口的一个实现类

        //java中,类最多只能继承一个类
        //java中只支持单继承
        //但是java中,支持多实现
        //多实现: 一个类可以实现多个接口,多个接口之间用逗号分开

        System.out.println(list.size());
        //length    数组的长度,是一个属性
        //length()  是字符串的长度,是一个方法
        //size()    是集合的方法,获取集合的长度

        //给集合添加一个元素
        //add方法可以接收任意一个类型的对象
        list.add("张三");
        list.add(new Student());
        list.add(1);

        System.out.println(list.size());


        for (int i = 0; i < list.size(); i ++){

            Object obj = list.get(i);
           // System.out.println("第" + i + "个元素为:" + list.get(i));
            System.out.println("第" + i + "个元素为:" + obj.toString());
        }

        /**
         * 基本数据类型包装类
         *
         * 八大基本数据类型,每个类型都有一个包装类
         * 包装类,其实就是一个class,就是一个类型
         *
         * 可以创建该类型的对象
         *
         * 对应关系:
         * int      Integer
         * char     Characer
         * byte     Byte
         * short    Short
         * long     Long
         * float    Float
         * double   Double
         * boolean  Boolean
         *
         * 除了int和char,其他都是基本数据类型大驼峰结构
         *
         * Integer a = 1; (Integer b = new Integer(1);) //自动装箱
         *
         * int b = a; //自动拆箱
         *
         */

        Integer a = 1;

        int b = a;


        Object obj = 1;//Object obj = new Integer(1);
        System.out.println(obj.getClass().getName());

    }
}
