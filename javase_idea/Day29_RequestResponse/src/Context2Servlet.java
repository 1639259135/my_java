import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Context2Servlet", urlPatterns = "/context2")
public class Context2Servlet extends HttpServlet {
    private int a;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object count = getServletContext().getAttribute("count");
        request.setAttribute("name","123");
        HttpSession session = request.getSession();
    }
}
