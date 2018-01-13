<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%--指定当前页面为错误页面--%>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
    <%--
        JSP错误处理页面
            可以指定当前页面为错误页面
            那么其它的jsp可以设置,当异常出现时,
            要转发到哪个页面
        可以在错误处理页面使用内置对象exception
    --%>

    <%=exception.getMessage()%>

    <img src="http://pic31.nipic.com/20130710/2961605_155454831000_2.jpg">

</body>
</html>
