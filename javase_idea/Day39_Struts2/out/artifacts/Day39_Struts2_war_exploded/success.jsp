<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/15
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>name</th>
            <th>age</th>
        </tr>
        <c:forEach var="user" items="${requestScope.users}">
            <tr>
                <td>${user.username}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>

    <br><br>

    <li> name&nbsp;&nbsp;&nbsp;&nbsp;age</li><br>
    <c:forEach var="user" items="${requestScope.users}">
        <li>${user.username} + ${user.age}</li>
    </c:forEach>

</body>
</html>
