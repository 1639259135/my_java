import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContextParamServlet",
        urlPatterns = "/cp",
        initParams = {
                @WebInitParam(name = "username",value = "王武"),
                @WebInitParam(name = "age",value = "14")})
public class ContextParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取在web.xml中配置的全局参数
        String username = getServletContext().getInitParameter("username");

        String age = getServletConfig().getInitParameter("age");
        String username1 = getServletConfig().getInitParameter("username");


        System.out.println(username + "\t" + age+ "\t" +username1);


    }
}
