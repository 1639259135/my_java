package com.lanou3g.realtoday;

import com.lanou3g.realtoday.exception.EatException;
import com.lanou3g.realtoday.exception.NotEnoughException;
import com.lanou3g.realtoday.exception.TooMuchException;

public class Main {
    public static void main(String[] args) {
        showSimple();

        //自定义异常
//        showSecond();

        //这是声明一个出来
//        third();

    }

    private static void third() {
        Chunlai chunlai = null;
        try {

            //抛出了异常

            //给春来赋值
            chunlai = new Chunlai();
            chunlai.eat(300);
        } catch (EatException e) {
            System.out.println(e);

            try {
                chunlai.eat(230);
            } catch (EatException e1) {
                e1.printStackTrace();
            }
        }
    }


    private static void showSecond() {
        try {
            new Chunlai().eat(130);
        } catch (EatException e) {
            try {
                new Chunlai().eat(330);
            } catch (EatException e1) {
                e1.printStackTrace();
            }
        }
    }

    private static void showSimple() {
        int n = 10;

        try {
            /**
             * 在try中,写可能会出现的异常代码
             * 如果执行该代码,会出现异常
             * 则程序会跳转到,catch块中
             */
            int result = n / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());

            //方法执行到return的时候
            //就回反回一个值,
            //这里反回值类型为void
            //表示没有返回值,所以直接写一个return就行了
            return;
        }finally {
            //在finally中,是一定会执行的代码
            //就是不管是报错了,还是没报错
            //都会执行

            System.out.println("哈哈哈哈哈哈哈哈");
        }
    }
}
