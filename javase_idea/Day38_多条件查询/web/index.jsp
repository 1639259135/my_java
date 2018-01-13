<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/12
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style type="text/css">
    a{
      text-decoration-line: none;
    }
    input[type="text"]{
      display: inline-block;
      width: 23px;
    }
    form{
      display: inline-block;
    }
  </style>

  <body>

  <table border="1">
    <tr>
      <th>ID</th>
      <th>NAME</th>
      <th>JOB</th>
      <th>MANAGERID</th>
      <th>HIREDATE</th>
      <th>PAY</th>
      <th>PRIZE</th>
      <th>DMTID</th>
    </tr>
    <c:forEach var="emp" items="${requestScope.page.employees}" step="1">
      <tr>
        <td>${emp.id}</td>
        <td>${emp.name}</td>
        <td>${emp.job}</td>
        <td>${emp.managerId}</td>
        <td>${emp.hiredate}</td>
        <td>${emp.pay}</td>
        <td>${emp.prize}</td>
        <td>${emp.dmtid}</td>
      </tr>
    </c:forEach>
  </table>
  <c:set var="pageCode" value="${requestScope.page.pageCode}"/>
  <c:set var="totalPages" value="${requestScope.page.totalPages}"/>

  <c:set var="begin" value="1"/>
  <c:if test="${pageCode - 2 >= 1}">
    <c:set var="begin" value="${pageCode - 2}"/>
  </c:if>

  <c:set var="end" value="${totalPages}"/>
  <c:if test="${pageCode + 2 <= totalPages}">
    <c:set var="end" value="${pageCode + 2}"/>
  </c:if>

  <c:if test="${end < 5}">
    <c:if test="${totalPages >= 5}">
      <c:set var="end" value="5"/>
    </c:if>
    <c:if test="${totalPages < 5}">
      <c:set var="end" value="${totalPages}"/>
    </c:if>
  </c:if>

  <c:if test="${totalPages >= 5}">
    <c:if test="${begin >= end - 4}">
      <c:set var="begin" value="${end - 4}"/>
    </c:if>
  </c:if>
  <c:if test="${totalPages < 5}">
      <c:set var="begin" value="1"/>
  </c:if>




  <c:if test="${pageCode == 1}">
    首页
  </c:if>
  <c:if test="${pageCode != 1}">
    <c:if test="${pageCode != totalPages}">
      第${pageCode}页
    </c:if>
    <c:if test="${pageCode == totalPages}">
      尾页
    </c:if>
  </c:if>

  /共${totalPages}页&nbsp;

  <c:forEach var="v" begin="${begin}" end="${end}" step="1">
    <a href="emp?pc=${v}${requestScope.page.params}">
      <c:if test="${pageCode == v}">
        ${v}&nbsp;
      </c:if>
      <c:if test="${pageCode != v}">
        &lt;${v}&gt;&nbsp;
      </c:if>
    </a>
  </c:forEach>

    <form action="emp" method="get">
      <%--<input type="hidden" name="params" value="${requestScope.page.params}">--%>
      <input type="text" name="pc">/${totalPages}
      <input type="submit" value="跳转">
    </form>
  </body>
</html>
