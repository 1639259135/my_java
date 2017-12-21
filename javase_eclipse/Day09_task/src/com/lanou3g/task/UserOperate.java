package com.lanou3g.task;

import javafx.concurrent.Worker;

public class UserOperate {

    public void login(String userName, String password){
        for(int i = 0; i < UserData.ud.size(); i ++) {
            String name = UserData.getUd()[i][0];
            String un = UserData.getUd()[i][1];
            String pw = UserData.getUd()[i][2];
            Strign profession = UserData.getUd()[i][3];

            if (userName.equals(ud.getUd()[i][1]) && password.equals(ud.getUd()[i][2])) {
                System.out.println("姓名:" + ud.getUd()[i][0] + "\t" + "职业:" + ud.getUd()[i][3]);

                switch (profession) {
                    case "Worker":
                        return (name,un, pw, profession);
                    case "Doctor":
                        return (name,un, pw, profession);
                    case "Cooker":
                        return (name,un, pw, profession);
                    case "Boss":
                        return (name,un, pw, profession);
                }
            }
            System.out.println("输入错误");
            return null;
        }}
