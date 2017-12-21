package com.lanou3g.day14thread;

public class Main02 {
    public static void main(String[] args) {

        TicketDemo ticketDemo = new TicketDemo();

        sell(ticketDemo);
        sell(ticketDemo);
        sell(ticketDemo);
        sell(ticketDemo);

    }

    private static void sell(TicketDemo ticketDemo) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ticketDemo.sellTicket();    //线程进入sellTicket方法
            }
        }).start();
    }
}
