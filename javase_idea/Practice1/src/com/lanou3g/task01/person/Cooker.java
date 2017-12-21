package com.lanou3g.task01.person;

import com.lanou3g.task01.main.UserInter;

public class Cooker extends Person implements UserInter {

    @Override
    public void onLine() {
        System.out.println("上班了");
    }

    @Override
    public void offLine() {
        System.out.println("下班回家了");

    }

    public Cooker(String name, String userName, String password, String work) {
        super(name, userName, password, work);
    }

    public void toss(){
        System.out.println("颠一颠更美味");
    }
}
