package com.lanou3g.study;

public class HelloRunnable implements Runnable {
    public void run(){
        for (int i = 0; i < 5000; i++) {
            System.out.println("Hello Thread" + i);
        }
    }
}
