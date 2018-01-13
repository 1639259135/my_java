package com.lanou3g.study;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class HelloServlet extends HttpServlet {
    /**
        Tomcat就相当于一个简易版服务器
        我们可以把自己写的后端应用程序
        部署到Tomcat上
        然后就可以通过访问tomcat的方式去访问我们自己的应用

        原来做一个练习,拉取用户昵称和成绩的那个
        给的地址时: ip地址: 8080
        这里这个8080端口就是在访问对应ip地址上的Tomcat

        那么我们创建好一个JavaWeb程序
        并且部署到了Tomcat之后,
        Tomcat是如何根据用户输入的地址
        来找到我们程序中对应的执行单元呢?

        比如: 192.168.20.122:8080/day16/ten

        这里这个day16就是要访问部署到Tomcat上
        名为day16的应用程序

        ten表示,要访问day16这个应用的那个文件/
        这里这个文件,实际上就是我们自己写的类
        就是我们自定义的HttpServlet子类

        也就是说

        B/S系统: Browser  Server
        C/S系统: Client   Server

     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * Request和Response
         * Request: 请求,包含这次请求的所有数据
         *
         * Response: 响应,将这次请求的结果返回给请求方
         */
//        super.doGet(req, resp);

        //使用req,获取请求参数
        //方法中传入的参数为: 参数名
        //根据参数名获得参数(类似键值对)
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("用户名:" + username + "\t密码:" + password);

        System.out.println("已经访问到Servlet");

        //使用resp,将请求的结果返回给请求方
        resp.getWriter().write("<h1>SUCCESS</h1>" );

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //500或500+: 表示服务器出错了
        //404: 表示未找到资源, 也就是你访问的路径,在服务器中不存在

        //中文乱码解决
        req.setCharacterEncoding("utf-8");

        //1,请求参数
        String username = req.getParameter("username");
        String gender = req.getParameter("gender");

        System.out.println("username:" + username);
        System.out.println("gender:" + gender);

        //2,使用jdbc把数据插入到数据库

        //给用户一个结果
        resp.getWriter().write(" INSERT SUCCESS");

    }
}
