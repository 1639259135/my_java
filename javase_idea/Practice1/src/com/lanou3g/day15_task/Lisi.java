package com.lanou3g.day15_task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Lisi {
    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);

        ServerSocket ss = new ServerSocket(9999);

        Socket s = ss.accept();

        byte[] buff = new byte[1024];

        InputStream is = s.getInputStream();

        //获得与这个ServerSocket相连的Socket的输出流
        OutputStream os = s.getOutputStream();

        int len = 0;
        StringBuffer sb = new StringBuffer();

        while ((len = is.read(buff)) != -1){
            sb.append(new String(buff,0,len));
            System.out.println(sb);
            //把sb清空
            sb.setLength(0);

            String result = input.nextLine();
            os.write(result.getBytes());
        }
        ss.close();
    }
}
