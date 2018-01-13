<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/4
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <%--
        使用EL获得JSP四大域中的域属性
        这与昨天学到的PageContext的全域查找,是一个意思
            EL表达式:
                ${}
                如果EL表达式什么都没有访问到,不会显示空,会输出一个空的字符串;
    --%>

    ${name}
    减:${100-5}
    加:${100+5}
    乘:${100*5}
    除:${100/5}
    取余:${100%5}
    ${100!=5}
    ${100<5}
    ${100>5}
    ${100<=5}
    ${100>=5}
    ${100 div 5}
    ${100 mod 5}
    ${100 eq 5}
    ${100 ne 5}
    ${100 lt 5}
    ${100 gt 5}
    ${100 le 5}
    ${100 ge 5}
    ${true && false}
    ${true and false}
    ${true || false}
    ${!true}
    ${not true}
    ${empty ""}
    ${not empty ""}

</body>
</html>
