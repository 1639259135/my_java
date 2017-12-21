package com.lanou3g.study;

public class Ticket {

    public void sellTicket(){
        //大括号中:代码块
        //synchronized:同步
        //所以这个代码块叫做同步代码块

        //synchronized后面的括号中
        //要传入的是同步块的锁对象

        //this != Ticket.class

        //this指的是本类对象
        //Ticket.class指的是这个类的类对象

        //本类对象指的是根据这个类创建出来的
        //类型为Ticket

        //类对象的类型为:Class
        //方法对象的类型:Method
        //属性对象类型为: Filed
        synchronized (Ticket.class){
            for (int i = 0; i < 10; i++) {
                try {

                    //请你等一等
                    //一旦锁定对象,调用wait方法
                    //那么档期那运行的线程,就会失去执行权,
                    //并且失去抢夺执行权的权利
                    //当锁定对象的notifyAll方法被调用后,
                    //这个线程才会从新开始抢夺执行权
                    //抢到后执行
                    Ticket.class.wait();
                } catch (InterruptedException e) {

                }
                System.out.println("转了一圈---" + i);
            }
        }
    }

    public void continued(){
        synchronized (Ticket.class) {
            Ticket.class.notifyAll();
        }

    }



}
