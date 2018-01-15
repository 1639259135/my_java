import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/emp")
public class EmployeeServlet extends HttpServlet {

    private int n;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Page page = new Page();
        EmpDao empDao = new EmpDao();

        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

        String pc = request.getParameter("pc");
        if (pc == null){
            pc = "1";
        }
        int p = Integer.parseInt(pc);
        int begin = (p - 1) * page.getPageSize();

        try {

            String job = request.getParameter("job");
            String managerId = request.getParameter("managerId");
            String pay = request.getParameter("pay");
            String prize = request.getParameter("prize");
            String dmtid = request.getParameter("dmtid");

            String[] ps = {"job","managerId","pay","prize","dmtid"};
            String[] pv = {job,managerId,pay,prize,dmtid};

            String params = "";
            for (int i = 0; i < pv.length; i++) {
                if (pv[i] != null){
                    params += "&" + ps[i] + "=" + pv[i];
                }
            }
            System.out.println("params = " + params);
            page.setParams(params);

            sb1.append("select count(*) from employee");
            StringBuffer sb3 = getSb(sb1, job, managerId, pay, prize, dmtid, ps, pv);
            int count = (int) empDao.queryCount(sb3.toString());
            page.setTotalDatas(count);
            if (count - begin < page.getPageSize()){
                n = count - begin;
            }else{
                n = page.getPageSize();
            }

            sb.append("select * from employee");
            StringBuffer sb2 = getSb(sb, job, managerId, pay, prize, dmtid, ps, pv);
            sb2.append(" limit " + begin + " , " + n);
            List<Employee> employees = empDao.queryAll(sb2.toString());

            page.setEmployees(employees);
            page.setPageCode(p);

            System.out.println(page.getTotalPages() + "=================");
            JSONObject jsonObject = JSONObject.fromObject(page);
            response.getWriter().write(jsonObject.toString());
//            request.setAttribute("page",page);

            request.getRequestDispatcher("/index.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private StringBuffer getSb(StringBuffer sb,String job, String managerId, String pay, String prize, String dmtid, String[] ps, String[] pv) {
        if (job != null || managerId != null || pay != null || prize != null || dmtid != null){
            sb.append(" where ");
            boolean shouldAnd = false;
            for (int i = 0; i < pv.length; i++) {
                System.out.println(i +"===="+ pv[i]);
                if (pv[i] != null){
                    if (shouldAnd){
                        sb.append(" and ");
                    }
                    sb.append(ps[i] + " = '" + pv[i] + "' ");
                    shouldAnd = true;
                }
            }
        }
        return sb;
    }
}
