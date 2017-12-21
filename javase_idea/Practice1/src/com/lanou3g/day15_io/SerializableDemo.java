package com.lanou3g.day15_io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * serializable:序列化
 */
public class SerializableDemo {
    @Test
    public void output() throws IOException {
        Person person = new Person("燕丘石","未知");

        FileOutputStream fos = new FileOutputStream("src/com/lanou3g/day15_io/text/prson.out");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person);

        oos.flush();
        oos.close();
    }
}
