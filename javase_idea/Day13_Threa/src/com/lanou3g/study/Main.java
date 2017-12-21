package com.lanou3g.study;

public class Main {

    private static Thread thread;

    public static void main(String[] args) {
        /*
            线程:Thread
            什么是线程?
            讲线程之前先将一下进程
            进程就是一个程序

            线程就是程序中的执行单元

            进程中可以有多个线程


            正常情况下,每个线程都有自己独立的执行流程,互补干涉
            如果人为写的话,可以让两个线程产生交集
         */

        thread = new HelloThread();


        //创建一个Runnable的实现类对象
        thread = new Thread(new HelloRunnable());


        //什么叫内部类?
        //定义在一个类内部的类,叫内部类
        //没有名字的对象叫匿名对象,那么
        //没有名字的类叫匿名类
        //这个类有写在另一个类中
        //          所以我们叫他 匿名内部类
       thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    System.out.println("我是匿名内部类中的run:" + i);
                }
            }
        });


        thread = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 5000; i++) {
                    System.out.println("第四种创建线程方法" + i);
                }
            }
        };



        //开启一个子线程
        thread.start();

        //主线程
        for (int i = 0; i < 10000; i++) {

            //Thread的静态方法currentThread
            //可以帮助我们获得当前执行的线程对象
            //调用这个线程对象的getName方法获得名称
            System.out.println(Thread.currentThread().getName() + "---------" + i);
        }


        /*
            什么是GC?
            java在内存中创建的对象,程序员是不能手动销毁的
            这也  是java箱对c 的一个好处
            c的程序员都需要手动销毁内存中 的内容
            //二,我们java操作员就不需要做这个操作,与java内部的机制帮助我们管理内存

            GC就 是帮助我们把内存中不用 的对象销毁掉,释放内存空间

            当一个main方法执行时,实际是启动两个线程
            一个是我们能看到的主线程
            一个在后台运行,我们看不到的gc
            注:：GC什么时候销毁对象，由它自己决定，我们无法决定
         */


        /*
            线程的抢栈式执行

            多个线程共同去抢占CPU的执行权
            谁抢到谁执行

            所以看到多个线程交替出现
         */


    }

}
