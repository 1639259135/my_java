package web;

import domain.User;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;
import utils.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends BaseServlet {

    private UserService us = new UserService();
    private Map<String, String[]> parameterMap;
    private User user;

    public String login(HttpServletRequest request,HttpServletResponse response){
        user = new User();

        HttpSession session = request.getSession();
        parameterMap = request.getParameterMap();

        try {
            BeanUtils.populate(user, parameterMap);

            Cookie cookie = new Cookie("username", user.getUsername());
            cookie.setPath("/login.jsp");
            cookie.setMaxAge(60 * 60);
            response.addCookie(cookie);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

       User u = us.login(user);
       if (u != null){
           session.setAttribute("user", u);
           return "f:/index.jsp";
       }

       return "r:/login.jsp";

   }


   public String register(HttpServletRequest request,HttpServletResponse response){

       parameterMap = request.getParameterMap();

       try {
           BeanUtils.populate(user,parameterMap);
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (InvocationTargetException e) {
           e.printStackTrace();
       }

       us.register(user);

       return "r:/login.jsp";
   }


}
