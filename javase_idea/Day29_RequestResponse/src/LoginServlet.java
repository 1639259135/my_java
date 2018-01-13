import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
    //注解
    //name就是这个Servlet的名字,生成时默认使用类名
    //urlPatterns就似乎访问这个Servlet时使用的路径
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户传递上来的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("zhangsan") && password.equals("123")){
            //TODO 跳转到主页,登录成功

            //设置状态码,302表示重定向
//            response.setStatus(302);

            //add时添加,header是头
            //这里添加相应头
            //add与set区别:
            //  set是给某一个头设置内容
            //  add时给某一个头添加内容
            //  也就是说多个add,那么该头有多个内容,
            //  多个set,该头之前的内容会被覆盖
//            response.setHeader("location","http://localhost:8080/index.jsp");
            //重定向的写法
            response.sendRedirect("http://localhost:8080/index.jsp");
        }else{
            //设置头ContentType的内容为...
            response.setContentType("text/html;charset=utf-8");
//            response.setHeader("ContentType","text/html;charset=utf-8");
            //TODO 跳转到错误页面提示失败
            response.getWriter().write("失败了");
//            response.setStatus(302);
//            response.setHeader("location","http://localhost:8080/error.html");

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);
    }






}
