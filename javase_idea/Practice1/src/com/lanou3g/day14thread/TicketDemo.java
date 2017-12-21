package com.lanou3g.day14thread;

public class TicketDemo {

    private int ticket = 10000;

    public synchronized void sellTicket(){
        for (int i = 0; i < 2500; i++) {
            System.out.println(Thread.currentThread().getName() + "剩余票数" + (-- ticket));
        }
    }

}
