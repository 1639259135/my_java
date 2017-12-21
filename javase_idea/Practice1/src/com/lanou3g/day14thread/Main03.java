package com.lanou3g.day14thread;

public class Main03 {

    private static int num;

    public static void main(String[] args) {
        num = 10000;

        one();
        one();
        one();
        one();
    }

    private static void one() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2500; i++) {
                    System.out.println(num --);
                }
            }
        }).start();
    }
}
