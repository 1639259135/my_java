import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "PicFilter" ,urlPatterns = "/pic")
//这里这个urlPatterns,指的是拦截路径
public class PicFilter implements Filter {
    public void destroy() {
    }

    /**
     * 当用户访问PicServlet时,
     * 会先访问PicFilter
     * 执行doFilter方法
     * 在该方法中,存在参数chain
     * 使用这个参数的doFilter方法可以选择放行
     * 如果不执行doFilter方法
     * 则该请求会被拦截
     *
     * 可以在Filter#doFilter中,对
     * request和response做配置
     *比如:设置编码
     *
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String user = req.getParameter("user");
        if (user != null){
            chain.doFilter(req, resp);
            return;
        }
        resp.getWriter().write("no user");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
