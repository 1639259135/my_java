package com.lanou3g.day15_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/lanou3g/day15_io\\text/周报03.txt");

        char[] chars = new char[1024 * 1024];
        int len = fr.read(chars);

        FileWriter fw = new FileWriter("src/com/lanou3g/day15_io\\text/周报03副本.txt");
        fw.write(chars,0,len);

        fr.close();
        fw.close();
    }
}
