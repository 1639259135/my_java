package com.lanou3g.day14thread;

public class Main {

    private static Thread thread;

    public static void main(String[] args) {

        thread = new HelloThread();
        thread = new Thread(new HelloRunnable());

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    System.out.println("我是匿名内部类中的run" + i);
                }
            }
        });

        thread = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 5000; i++) {
                    System.out.println("我是第四中创建线程的方法");
                }
            }
        };

        thread.start();

        for (int i = 0; i < 5000; i++) {
            System.out.println(Thread.currentThread().getName() + "我是主线程" + i);
        }


    }
}
