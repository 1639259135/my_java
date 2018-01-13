<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/4
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数</title>
</head>
<body>
    <%--
        获取请求,参数名为name值,并输出到jsp页面中
    --%>
    ${param.name}
    ${paramValues.hobbies[0]}
</body>
</html>
