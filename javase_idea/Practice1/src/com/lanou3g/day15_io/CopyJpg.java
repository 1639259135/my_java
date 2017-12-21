package com.lanou3g.day15_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpg {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/com/lanou3g/day15_io\\text/面向对象概念解析.jpg");

        byte[] bytes = new byte[1024 * 1024 * 1024];
        int len = fis.read(bytes);

        FileOutputStream fos = new FileOutputStream("src/com/lanou3g/day15_io\\text/面向对象概念解析副本.jpg");
        fos.write(len);

        fis.close();
        fos.close();
    }
}
