<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%--设置错误处理页面,当1_hello页面出现错误,会自动转到2_error --%>
<%@ page errorPage="2_error.jsp" %>
<html>
<head>
    <title>1_HELLO</title>
</head>
<body>
    <%
        //是在service方法里的
        Object user = request.getAttribute("user");
        int a = 10/0;
        System.out.println(a);

    %>

    a的值为:
    <%=
        a
    %>

    <%!
       //是在类里的
        public void dodo(){

        }
        //这是定义成员变量
        private String name;
    %>
</body>
</html>
