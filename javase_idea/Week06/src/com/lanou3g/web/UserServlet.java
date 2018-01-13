package com.lanou3g.web;

import com.lanou3g.domain.User;
import com.lanou3g.service.UserService;
import com.lanou3g.utils.BaseServlet;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "UserServlet",urlPatterns = "/user")
public class UserServlet extends BaseServlet {

    private UserService us = new UserService();

    public String login(HttpServletRequest request, HttpServletResponse response){

        HttpSession session = request.getSession();
        User user = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();

        try {
            BeanUtils.populate(user,parameterMap);

            Cookie cookie = new Cookie("username", user.getUsername());
            cookie.setMaxAge(60*60);
            cookie.setPath("/week06/login.jsp");
            response.addCookie(cookie);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        User u = us.login(user);

        if (u != null){
            session.setAttribute("user",u);
            System.out.println(u.toString());
            return "f:/index.jsp";
        }

        return "r:/login.jsp";

    }



    public String register(HttpServletRequest request, HttpServletResponse response){




        return "/r:login.jsp";
    }



}
