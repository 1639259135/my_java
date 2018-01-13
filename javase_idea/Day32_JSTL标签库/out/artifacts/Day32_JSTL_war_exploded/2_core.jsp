<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/5
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        直接在jsp页面中显示
        value属性值中使用EL表达式查找域属性
    --%>
    <c:out value="你好"/>
    <c:out value="${requestScope.user.gender}" default="找不到了"/>


    <%--
        test: 判断条件,里面写一个EL表达式做一个判断

        如果下面有需要用到相同的判断条件,
        则直接可以使用request域中的result变量来判断
        该变量,就保存了if语句判断的结果
    --%>
    <c:if test="${5 <= 6}" var="result" scope="request">
        <h1>我自横刀向天笑,</h1>
    </c:if>

    <c:if test="${result}">
        <h1>笑完我就去睡觉</h1>
    </c:if>


    <%--<table border="1">--%>
        <%--<tr><td>我是表头</td></tr>--%>
    <%--<c:forEach begin="0" end="10" step="2">--%>
        <%--<tr><td>hello</td></tr>--%>
    <%--</c:forEach>--%>
    <%--</table>--%>

    <table border="1">
        <tr>
            <td>姓名</td>
        </tr>
        <%--
            这个写法,就是Java中的增强for循环
            user是循环中的变量
            users是从域中找到的集合对象
        --%>
        <c:forEach var="user" items="${requestScope.users}" varStatus="vs">
            <tr>
                <td>
                        ${user}角标:${vs.index}第几个:${vs.count}当前对象:${vs.current}
                </td>
            </tr>
        </c:forEach>
    </table>

    <%--会在value指定的路径前面,加上一个项目名--%>
    <%--就相当于: day32/index.jsp--%>
    <a href="<c:url value="/index.jsp"/>" >访问主页</a>


</body>
</html>
