package com.lanou3g.task01.person;

import com.lanou3g.task01.main.UserInter;

public class Boss extends Person implements UserInter {
    @Override
    public void onLine() {
        System.out.println("上班了");
    }

    @Override
    public void offLine() {
        System.out.println("下班回家了");
    }

    public Boss(String name, String userName, String password, String work) {
        super(name, userName, password, work);
    }

    public void pay(){
        System.out.println("来来来,每人一毛,人人都有");
    }
}
