package com.lanou3g.day15_io;

import org.junit.Test;

import java.io.*;

//buffer:缓冲

public class BufferDemo {
    @Test
    public void showRead() throws IOException {     //将文件度出来
        FileReader fr = new FileReader("src/com/lanou3g/day15_io/周报03.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null){
            sb.append(line + "\n");
        }
        System.out.println(sb);
    }

    @Test
    public void showWriter() throws IOException {       //将文件写进去
        FileWriter fw = new FileWriter("src/com/lanou3g/day15_io\\text/新写的文本.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 20; i++) {
            bw.write(i + "");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
