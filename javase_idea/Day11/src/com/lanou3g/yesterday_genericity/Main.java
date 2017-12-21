package com.lanou3g.yesterday_genericity;

import com.lanou3g.yesterday_genericity.one.Databaswutil;
import com.lanou3g.yesterday_genericity.one.Student;
import com.lanou3g.yesterday_genericity.one.Teacher;

public class Main {
    public static void main(String[] args) {
        Databaswutil<Student> dbu = new Databaswutil<>();
        dbu.save(new Student());

        Databaswutil<Teacher> dbu2 = new Databaswutil<>();
        dbu2.save(new Teacher());


    }
        //两个在方法中使用的例子
        public static <T> void test(T t ) {
        }
//        public static <Test>  Test test() {
//        return null;
//        }

        public static <E> E test2(){
            return null;
        }

    //也可以给单个数组




}
