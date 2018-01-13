import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "PicServlet", urlPatterns = "/pic")
public class PicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //File,FileReader,FileInputStream
        //找的都是本机中的文件: 绝对路径

        //想要找本项目中的文件
        //需要使用ServletContext#getResourceAsStream方法
        // 相对路径  相对于web文件夹

        InputStream resourceAsStream = getServletContext().getResourceAsStream("img/qq.png");
        byte[] bytes = IOUtils.toByteArray(resourceAsStream);

        response.getOutputStream().write(bytes);


        //类对象.getClassLoader();
        //会获得一个ClassLoader对象
        //称之为: 类加载器
        //可以帮助我们加载一些文件
        //路径: 相对于src

    }
}
