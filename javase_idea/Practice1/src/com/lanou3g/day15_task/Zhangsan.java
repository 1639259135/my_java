package com.lanou3g.day15_task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Zhangsan {
    public static void main(String[] args) throws IOException {
        //把张三写成发送方
        Socket socket = new Socket("192.168.11.218",9999);

        Scanner input = new Scanner(System.in);

        OutputStream so = socket.getOutputStream();

        InputStream is = socket.getInputStream();

        byte[] buff = new byte[1024];

        String sends = "";
        while (!(sends = input.nextLine()).equals("quit")){
            //如果输出的内容不是quit,那么程序继续
            so.write(sends.getBytes());

            int l = is.read(buff);

            System.out.println(new String(buff,0,l));

        }

        //如果输入了quit,则循环会终止
        //那么关闭这个socket
        socket.close();

    }
}
