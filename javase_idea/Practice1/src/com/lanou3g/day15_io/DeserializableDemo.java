package com.lanou3g.day15_io;

import org.junit.Test;

import java.io.*;

public class DeserializableDemo {
    @Test
    public void output() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("src/com/lanou3g/day15_io/text/prson.out");

        ObjectInputStream oos = new ObjectInputStream(fis);

        Object o = oos.readObject();

        System.out.println(o);

        oos.close();
    }
}
