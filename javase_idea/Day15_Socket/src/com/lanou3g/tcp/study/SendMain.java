package com.lanou3g.tcp.study;

import com.lanou3g.util.Constants;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendMain {
    public static void main(String[] args) throws IOException {

        //创建一个socket对象
        //指定的ip地址和端口号
        Socket socket = new Socket(Constants.ADDRESS,9999);

        //获得socket对象的输出工具
        //这个动西我们叫做流
        OutputStream os = socket.getOutputStream();

        //调用这个工具的写法
        //把传输的内容作为参数传进去
        //参数是一个字节数组
        os.write("春江潮水连海平，海上明月共潮生。\n滟滟随波千万里，何处春江无月明！".getBytes());    //getBytes()获得字节

        //关闭socket
        socket.close();


    }
}
