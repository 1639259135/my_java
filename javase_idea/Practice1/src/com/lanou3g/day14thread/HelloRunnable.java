package com.lanou3g.day14thread;

public class HelloRunnable extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("Hello Runnable");
        }
    }
}
