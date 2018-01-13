package com.lanou3g.study;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "CookieServlet", urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("开始输出Cookie的cookie===========================");
//        String cookie = request.getHeader("Cookie");
//        System.out.println(cookie);
//        cookie.split(";");//分割字符串

        System.out.println("接收到了cookie================================");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + "==" + cookie.getValue());
        }


        //Set-Cookie: 响应头
        //gender=男: 对应相应头的值
        response.addHeader("Set-Cookie","gender=男");
        response.addHeader("Set-Cookie","age=18");

        Cookie user = new Cookie("user", "cookie");

        user.setPath("/day31/cookie");

        //设置为0,则表示销毁该cookie
        user.setMaxAge(60*60*24*30);//一个月的生命周期
        response.addCookie(user);



    }
}
