package com.lanou3g.io;

import org.junit.Test;

import java.io.*;

/**
 * 反序列化
 */
public class DeserializableDemo {
    @Test
    public void input() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("src/pig.out");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();

        System.out.println(o);

    }
}
