import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ForwardServlet" ,urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是forward");
        //设置一个域属性
        request.setAttribute("name","张三");



        //执行请求转发/请求包含到TargetServlet

        //获得请求转发者,并指定目标路径
        RequestDispatcher dispatcher = request.getRequestDispatcher("/target");

        //forward方法,就表示请求转发
//        dispatcher.forward(request,response);

        //include方法,就表示请求包含
        dispatcher.include(request,response);

        System.out.println("已经转发完毕");
        response.getWriter().write("this is forward");


    }


}
