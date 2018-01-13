package web;

import domain.User;
import service.UserService;
import service.exception.LoginException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //formU表示从表单提交上来的
        //formDb表示从数据库查出来的
        User formU = new User();
        formU.setUsername(username);
        formU.setPassword(password);

        try {
            User login = userService.login(formU);
            request.getSession().setAttribute("user",login);
            request.getRequestDispatcher("/login.jsp").forward(request,response);

        } catch (LoginException e) {
            request.setAttribute("errorMsg",e.getMessage());
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }


    }
}
