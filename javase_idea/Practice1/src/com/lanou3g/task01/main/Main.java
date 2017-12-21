package com.lanou3g.task01.main;

import com.lanou3g.task01.exception.LoginException;
import com.lanou3g.task01.exception.NoExistException;
import javafx.fxml.LoadException;
import org.dom4j.DocumentException;
import com.lanou3g.task01.person.Person;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        begin(input);

    }

    private static void begin(Scanner input) throws Exception {
        System.out.println("请选择:a.登录 \t b.注册");

        String result = input.nextLine();

        switch (result){
                case "a":
                Login(input);
                break;
            case "b":
                Register(input);
                break;
            default:
                System.out.println("错误,请重新输入");
                begin(input);
        }
    }

    private static void Register(Scanner input) throws Exception {
        System.out.println("请输入姓名:");
        String name = input.nextLine();
        System.out.println("请输入用户名:");
        String userName = input.nextLine();
        System.out.println("请输入密码:");
        String password1 = input.nextLine();

        System.out.println("请选择职业: 1.Worker \t 2.Doctor \t 3.Cooker \t 4.Boss");
        int result = input.nextInt();
        UserInter ui =null;
        String work = null;
        switch (result){
            case 1 :
                work = "worker";
                ui = new Register().register(name,userName,password1,work);
                break;
            case 2 :
                work = "Doctor";
                ui = new Register().register(name,userName,password1,work);
                break;
            case 3 :
                work = "Cooker";
                ui = new Register().register(name,userName,password1,work);
                break;
            case 4 :
                work = "Boss";
                ui = new Register().register(name,userName,password1,work);
                break;
            default:
                System.out.println("干啥涅");
                break;
        }
        System.out.println("注册成功");
    }

    private static void Login(Scanner input) throws Exception {
        System.out.println("请输入用户名:");
        String userName = input.nextLine();
        System.out.println("请输入密码:");
        String password1 = input.nextLine();

        UserInter ui = null;

        ui = new Login().login(userName,password1);

//        try {
//            ui = new Login().login(userName,password1);
//
//        } catch (LoginException e) {
//            System.out.println(e.getMessage());
//            try {
//                ui = new Login().login(userName,password1);
//                Login(input);
//            } catch (LoginException e1) {
//            }
//        }

        Person person = (Person) ui;

        if (person != null){

            System.out.println("当前登录用户："+person.getName()+"\t职业为："+person.getWork());
            long currentTime = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");
            String time = sdf.format(currentTime);
            System.out.println("当前系统时间为："+time);

            System.out.println("是否开始工作: 1.是 \t 2.否");
            String result = input.nextLine();

            switch (result){
                case "1":
                    ui.onLine();
                break;
                case "2":
                    ui.offLine();
                break;
                default:
                    System.out.println("what are you 弄啥咧");
                break;
            }
        }
    }
}
