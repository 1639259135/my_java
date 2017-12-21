package javase_practice.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public void play(){
        System.out.println("开始倒计时");
        for (int i = 3; i > 0; i --) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "...");
        }

    }

    public void easyGame(){
        List easy = new ArrayList();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {        //数字
            easy.add(i);
        }
        for (char i = 97; i <= 122; i++) {        //字母
            easy.add(i);
        }

        String random = "";
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * easy.size());
            random += String.valueOf(easy.get(index));
        }

        String result = "";
        System.out.println(random);
        long start = System.currentTimeMillis();
        result = input.nextLine();
        if (random.equals(result)){
            long end = System.currentTimeMillis();
            int score = (int) (end - start);
            System.out.println("恭喜你,闯关成功! \n 你的成绩为:" + score);
        }

    }

    public void middleGame(){
        List middle = new ArrayList();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {        //数字
            middle.add(i);
        }
        for (char i = 97; i <= 122; i++) {        //字母
            middle.add(i);
        }
        for (char i = 65; i <= 90; i++) {
            middle.add(i);
        }

        String random = "";
        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * middle.size());
            random = random.concat(String.valueOf(middle.get(index)));
        }

        String result = "";
        System.out.println(random);
        long start = System.currentTimeMillis();
        result = input.nextLine();
        if (random.equals(result)){
            long end = System.currentTimeMillis();
            int score = (int) (end - start);
            System.out.println("恭喜你,闯关成功! \n 你的成绩为:" + score + "毫秒");
        }

    }



    public void difficultGame(){
        List difficulty = new ArrayList();
        Scanner input = new Scanner(System.in);
        for (char i = 33; i <= 126; i++) {
            difficulty.add(i);
        }

        String random = "";
        for (int i = 0; i < 30; i++) {
            int index = (int) (Math.random() * difficulty.size());
            random = random.concat(String.valueOf(difficulty.get(index)));
        }

        String result = "";
        System.out.println(random);
        long start = System.currentTimeMillis();
        result = input.nextLine();
        if (random.equals(result)){
            long end = System.currentTimeMillis();
            int score = (int) (end - start);
            System.out.println("恭喜你,闯关成功! \n 你的成绩为:" + score);
        }
    }

}
