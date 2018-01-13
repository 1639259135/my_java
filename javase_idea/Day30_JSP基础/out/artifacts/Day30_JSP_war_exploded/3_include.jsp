<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--
        静态包含include指令,
        是在4_target.jsp被编译成.java文件之前,就添加进3_include.jsp中了
        所以只能看到3_include.java文件
    --%>

    <%@ include file="4_target.jsp"%>
    <h1>我是Include</h1>
</body>
</html>
