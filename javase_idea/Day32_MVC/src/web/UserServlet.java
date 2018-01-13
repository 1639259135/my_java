package web;

import util.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends BaseServlet {

    public String login(HttpServletRequest request, HttpServletResponse response){
        System.out.println("login被调用了");

        //指定一个路径,还得让其父类BaseServlet能够得到

        //返回一个路径
        //规范:
        //      f: 表示请求转发
        //      r: 表示重定向
        return "r:/index.jsp";
    }


    public String register(HttpServletRequest request, HttpServletResponse response){
        System.out.println("register被调用了");



        //返回一个路径
        return "f:/login.jsp";
    }


}
