<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <style type="text/css">
	  body{
		  background-color: #e9fffa;
	  }
	  ul li{
		  display: inline;
		  /*background-color: skyblue;*/
	  }
	  input{
		  width: 400px;
		  height:40px;
		  position: absolute;
		  font-size: 18px
	  }

  </style>


  </head>
  
  <body>

  <div style="background-color: white;margin: 0;">
	  <ul>
		  <li><img style="width: 50px; height: 25px" src="images/网易云.png"></li>
		  <li style="font-size: 20px">网易云</li>
		  <li style="font-size: 17px">登录</li>
		  <li style="font-size: 15px;float: right;margin: 10px;">帮助与文档</li>
		  <li style="font-size: 15px;float: right;margin: 10px;">|</li>
		  <li style="font-size: 15px;float: right;margin: 10px;">网易云首页</li>
	  </ul>
  </div>


  <img style="position: fixed;left:15%;top: 25%" src="images/login.png">
  <div style="background-color:#d6eaff;
        width: 500px;height:600px;
        position: fixed;left: 50%;top:15%;">

	  <div style="font-size: 20px;position:absolute;left: 200px;top: 100px;">网易云登录</div>

	  <form action="user" method="post">

		  <%--<input type="hidden" name="method" value="login"/>--%>

		  <input style="left: 50px;top: 150px;" placeholder="请输入网易云邮箱账号"
				 type="text" id="username" name="username"
				 onfocus="inputFocus(this)" onblur="inputBlur(this)"
				 <%--value="${cookie.user.username}"--%>
		  >

		  <input placeholder="请输入密码" style="left: 50px;top: 230px;"
				 type="password" id="password" name="password"
				 onfocus="inputFocus(this)" onblur="inputBlur(this)">

		  <input type="checkbox" id="service"
				 style="width: 15px;height:15px;left: 50px;top: 350px;">
		  <label style="position: absolute;left:75px;top: 350px;" for="service">
			  同意并遵守<span style="color: dodgerblue"> 《服务条款》</span></label>

		  <input type="checkbox" id="time"
				 style="width: 15px;height:15px;left: 345px;top: 350px;">
		  <label style="position: absolute;left:365px;top: 350px;" for="service">
			  15天免登陆</label>

		  <input id="login" type="submit" value="登录"
				 style="background-color: dodgerblue;height: 50px;left: 50px;top: 390px;"
				 onmousedown="mousedown()" onmouseup="mouseup()">
	  </form>

	  <div style="position: absolute;left: 50px;top: 450px;width: 450px;">
		  还没有账号?
		  <a href="register.jsp" style="text-decoration-line: none">免费注册</a>
	  </div>

	  <div style="position:absolute;left: 380px;top: 450px;color: dodgerblue">忘记密码?</div>
  </div>


  <%--<h1>登录</h1>--%>
<%--<p style="color: red; font-weight: 900">${msg }</p>--%>
<%--<form action="../../user" method="post">--%>
	<%--<input type="hidden" name="method" value="login"/>--%>
	<%--用户名：<input type="text" name="username" value="${cookie.user.username}"/><br/>--%>
	<%--密　码：<input type="password" name="password"/><br/>--%>
	<%--<input type="submit" value="登录"/>--%>
<%--</form>--%>


  </body>

  <script type="text/javascript">
      function mousedown() {
          var login = document.getElementById("login");
          login.style.backgroundColor = "green";
      }
      function mouseup() {
          var login = document.getElementById("login");
          login.style.backgroundColor = "dodgerblue";
      }
      function inputFocus(ele) {
          // var a = document.getElementById("a");
          ele.style.width = "450px";
          ele.style.height = "50px";
          ele.style.borderColor = "red";
          ele.style.fontSize = "23px";
      }
      function inputBlur(ele) {
          // var b = document.getElementById("a");
          ele.style.width = "400px";
          ele.style.height = "40px";
          ele.style.borderColor = "";
          ele.style.fontSize = "18px";
      }


      var mydate=new Date();
      var minutes = mydate.getMinutes();
      var hours = mydate.getHours();
      var month=mydate.getMonth()+1;
      var day= mydate.getDate();
      var yar= mydate.getYear();
      document.write(yar+"-"+month+"-"+day+"\t"+hours+":"+minutes);

  </script>
</html>
