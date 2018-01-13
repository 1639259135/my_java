import org.omg.CORBA.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContextServlet", urlPatterns = "/context")
public class ContextServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Object count = getServletContext().getAttribute("count");
//
//        if (count == null){
//            getServletContext().setAttribute("count",1);
//            System.out.println("第1次访问");
//        }else{
//            long c = (long) count;
//            c++;
//            System.out.println("第" + c + "次访问");
//        }
//
//        getServletContext().setAttribute("count",1);

    }
}
