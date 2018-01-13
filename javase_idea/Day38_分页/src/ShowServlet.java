import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowServlet",urlPatterns = "/show")
public class ShowServlet extends HttpServlet {

    private List<Book> books;
    private int end;

    @Override
    public void init() throws ServletException {
        books = new ArrayList<>();

        for (int i = 0; i < 201; i++) {
            Book book = new Book(
                    "我是一本书" + i,
                    "我是一个作者" + i,
                    "50",
                    "武侠小说"
            );
            books.add(book);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageBean pageBean = new PageBean();
        //获得前端给的当前页码参数  pc=pageCode
        String pc = request.getParameter("pc");

        int p = Integer.parseInt(pc);
        int begin = (p - 1) * pageBean.getPageSize();

        if (201 - begin < pageBean.getPageSize()){
            end = 201;
        }else{
            end = p * pageBean.getPageSize();
        }


//        String sql = "select * from xxx limit ?,?";
//        qr.query(conn,sql,begin,pageSize);

        List<Book> bookList = this.books.subList(begin, end);
        pageBean.setBooks(bookList);
        //select coumt(*) from xxx;
        pageBean.setTotalData(201);
        pageBean.setPageCode(p);

        request.setAttribute("pageBean", pageBean);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }



}
