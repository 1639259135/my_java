<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/5
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

    <s:if test="${requestScope.errorMsg != null}">
        <h1>${requestScope.errorMsg}</h1>
    </s:if>

    <form action="user" method="post">
        <input type="hidden" name="method" value="login">

        <input type="text" name="username">

        <input type="password" name="password">

        <input type="submit">

    </form>
</body>
</html>
