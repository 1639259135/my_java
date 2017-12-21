package com.lanou3g.io;

import java.io.*;

public class CopyJpg {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/aa.jpg");

        byte[] bytes = new byte[1024 * 1024 * 10];

        fis.read(bytes);

        FileOutputStream fos = new FileOutputStream("src/bb.jpg");

        fos.write(bytes);

        fis.close();
        fos.close();





    }
}
