package com.lanou3g.task01.person;

import com.lanou3g.task01.main.UserInter;

public class Doctor extends Person implements UserInter {

    @Override
    public void onLine() {
        System.out.println("上班了");
    }

    @Override
    public void offLine() {
        System.out.println("下班回家了");
    }

    public Doctor(String name, String userName, String password, String work) {
        super(name, userName, password, work);
    }

    public void operate(){
        System.out.println("开始手术了");
    }
}
