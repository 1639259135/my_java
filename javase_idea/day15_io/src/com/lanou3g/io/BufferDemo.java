package com.lanou3g.io;

import org.junit.Test;

import java.io.*;

public class BufferDemo {
    @Test
    public void showRead() throws IOException {
        //创建一个字符输入流对象,构造方法中传入发送文件地址
        FileReader fr = new FileReader("src/线程之前的复习");

        //将字符串读取流到构造方法中去
        BufferedReader br = new BufferedReader(fr);

        String line = null;

        StringBuffer sb = new StringBuffer();


        //readLine()方法,一读读一行
        //如果什么都没有读到
        //返回null
        while ((line = br.readLine()) != null){
            //将读取到的内容添加到sb中
            sb.append(line + "\n");
        }
        System.out.println(sb);
        fr.close();
    }

    @Test
    public void showWriter() throws IOException {
        //创建一个字符输出流对象,构造方法中传入接收文件地址
        FileWriter fw = new FileWriter("src/fireWriter.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 20; i++) {
            bw.write(i + "");
            bw.newLine();//新来一行
            bw.flush();//将流中的内容刷新到文件
        }

        bw.close();



    }
}
