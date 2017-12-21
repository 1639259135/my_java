package com.lanou3g.task01.person;

import com.lanou3g.task01.main.UserInter;

public class Worker extends Person implements UserInter {

    @Override
    public void onLine() {
        System.out.println("开始干活了");
    }

    @Override
    public void offLine() {
        System.out.println("下班回家了");
    }

    public Worker(String name, String userName, String password, String work) {
        super(name, userName, password, work);
    }

    public void strike(){
        System.out.println("我不干了");
    }

}
