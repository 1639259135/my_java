package com.lanou3g.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //需求就是,把t1.txt中的内容
        //复制到target.txt中

        FileReader fr = new FileReader("src/ti.txt");

        char[] chs = new char[1024];

        //返回值表示:读了多少字符
        int len = fr.read(chs);

        FileWriter fw = new FileWriter("src/target.txt");

        fw.write(chs,0,len);

        fr.close();
        fw.close();

    }
}