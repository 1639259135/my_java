package com.lanou3g.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化
 */
public class SerializableDemo {
    @Test
    public void output() throws IOException {

        Pig pig = new Pig("雪纳瑞","male");

        FileOutputStream fos = new FileOutputStream("src/pig.out");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(pig);

        oos.flush();
        oos.close();
        
    }
}
