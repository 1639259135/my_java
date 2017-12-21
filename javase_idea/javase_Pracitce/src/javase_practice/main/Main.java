package javase_practice.main;
import javase_practice.Exception.RegisterUserNameErrorException;
import javase_practice.dao.*;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, DocumentException, RegisterUserNameErrorException {
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        Register register = new Register();
        GetWeather gw = new GetWeather();
        GetLocation gl = new GetLocation();
        Game game = new Game();

        System.out.println("请选择项目: a, 注册 \t b, 登录");
        String choise1 = input.nextLine();
        switch (choise1){
            case "a":
                register(input, register);
                break;
            case "b":
                Login(input, login);
                function(input, gw, gl, game);  //功能
                break;
        }
    }


    private static void function(Scanner input, GetWeather gw, GetLocation gl, Game game) throws IOException {
        System.out.println("1, 查询天气 \t 2, 查询手机号码归属地 \t 3, 手速游戏 \t 4, 查询手速游戏前十名");
        int choice2 = input.nextInt();
        switch (choice2){
            case 1:
                System.out.println("请输入需要查询的城市英文名:");
                String city = input.nextLine();
                gw.getWeather(city);
                break;
            case 2:
                System.out.println("请输入需要查询的城市英文名:");
                String num = input.nextLine();
                gl.getLocation(num);
                break;
            case 3:
                Game(input, game);
                break;
            case 4:
                System.out.println();
                break;
        }
    }


    private static void Game(Scanner input, Game game) {
        System.out.println("请选择游戏难度:1, 简单 \t 2, 适中 \t 3, 困难");
        int choiceGame = input.nextInt();
        game.play();
        switch (choiceGame) {
            case 1:
                game.easyGame();
                break;
            case 2:
                game.middleGame();
                break;
            case 3:
                game.difficultGame();
                break;

        }
    }

    private static void Login(Scanner input, Login login) throws DocumentException {
        System.out.println("请输入账号:");
        String id = input.nextLine();
        System.out.println("请输入密码:");
        String password = input.nextLine();
        login.login(id,password);

    }

    private static void register(Scanner input, Register register) throws IOException, DocumentException, RegisterUserNameErrorException {
        System.out.println("请输入用户名:");
        String userName = input.nextLine();
        System.out.println("请输入账号:");
        String id = input.nextLine();
        System.out.println("请输入密码:");
        String password = input.nextLine();

        register.register(id,userName,password);

        System.out.println("注册成功:\n" + "用户:" + userName + "\t 账号:" + id);

    }
}
