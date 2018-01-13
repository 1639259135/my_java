<%@ page import="java.util.List" %>
<%@ page import="com.lanou3g.domain.Book" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/2
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>主页</title>
</head>
<body>

<c:if test="${sessionScope.user.username != null}">

  <h1>登录成功</h1>
  <br><br>

  用户名:${sessionScope.user.username}
  密码:${sessionScope.user.password}

  <br><br>
  <h3>书籍信息</h3>
  <table border="2">
    <tr>
      <th>BID</th>
      <th>书名</th>
      <th>作者</th>
      <th>价格</th>
    </tr>
    <c:if test="${sessionScope.list != null}">
      <c:forEach var="book" items="${sessionScope.list}">
        <tr>
          <td>${book.bid}</td>
          <td>${book.bookname}</td>
          <td>${book.author}</td>
          <td>${book.price}</td>
        </tr>
      </c:forEach>
    </c:if>
  </table>
</c:if>

<c:if test="${sessionScope.username == null}">
  <h3><a href="login.jsp">请重新登录</a></h3>
</c:if>

<c:remove var="username" scope="session"/>
<c:remove var="password" scope="session"/>

<br><br>
<h3><a href="login.jsp">退出</a></h3>

</body>
</html>
