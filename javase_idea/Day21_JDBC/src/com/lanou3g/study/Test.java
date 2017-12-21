package com.lanou3g.study;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            静态的东西会随着类的加载而进入内存
            所以放我们创建对象,只是将类加载时,
            会执行该类的静态代码块

            而因为类只需要加载一次
            所以创建对象T时,不会再次执行静态代码块
         */

//        Class c = T.class;
        Class<?> aClass = Class.forName("com.lanou3g.study.T");
        T t = new T();



    }
}
