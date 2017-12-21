package com.lanou3g.study;

public class Main02 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(".");
        }
    }
}
