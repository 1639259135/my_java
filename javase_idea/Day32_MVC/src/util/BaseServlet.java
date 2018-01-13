package util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //我们自己定义一个叫做method的请求参数
        //根据这个请求参数
        //来确定要执行哪个方法


        //首先获得请求参数method
        String methodName = req.getParameter("method");

        //要获得当前类的类型
        Class<? extends BaseServlet> servlet = this.getClass();

        //servlet的类型是Class,是一个类对象
        //通过getMethod方法,可以获得该类中的方法
        Method method = null;
        try {
            method = servlet.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
        } catch (NoSuchMethodException e) {
            //运行时异常,就是希望在运行时崩掉,检查异常
            throw new RuntimeException("Sorry,there is not method which name is");
        }

        try {
            String result = (String) method.invoke(this, req, resp);

            String[] split = result.split(":");
            String type = split[0];
            String path = split[1];

            if (type.equals("f")){
                //说明时请求转发
                req.getRequestDispatcher(path).forward(req,resp);
            }
            if (type.equals("r")){
                //说明时重定向
                resp.sendRedirect(req.getContextPath() + path);
            }


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }








}
