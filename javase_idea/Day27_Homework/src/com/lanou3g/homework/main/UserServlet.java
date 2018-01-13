package com.lanou3g.homework.main;

import com.lanou3g.homework.dao.USerDao;
import com.lanou3g.homework.domain.User;
import com.lanou3g.homework.utils.JdbcUtil;
import net.sf.json.JSONArray;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class UserServlet extends HttpServlet{

    private USerDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        try {
            JSONArray jsonArray = JSONArray.fromObject(USerDao.showUser());
            resp.getWriter().write(jsonArray.toString());
//            System.out.println("访问到Servlet");
        } catch (SQLException e) {
            System.out.println("出错了");
        }
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        resp.setContentType("text/html;charset=utf-8");
//
//        String uname = req.getParameter("uname");
//        String age = req.getParameter("age");
//        String loc = req.getParameter("loc");
//
//        USerDao.insertUser(uname,age,loc);
//        resp.getWriter().write("成功啦");
//    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        userDao = new USerDao();
        Map<String, String[]> parameterMap = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        userDao.insertUser(user);
        resp.getWriter().write("成功啦");
    }
}
