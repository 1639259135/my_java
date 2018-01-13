<%@ page import="com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ" %><%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--<%=request.getAttribute("username")%>--%>

  <%
    if (session.getAttribute("username") != null){
  %>
      <h1>登陆成功</h1>
  <%
    }else{
  %>
     <h1><a href="login.html"></a></h1>
  <%
   }
  %>


  </body>
</html>
