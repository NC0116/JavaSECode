<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/29
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function () {
            document.querySelector("#img").onclick = function () {
                this.src = "/checkCodeServlet?time="+new Date().getTime();
            }
        }
    </script>

    <style>
        div{
            color: red;
        }
        body{
            background-image:url("http://202.199.224.119:8080/eams/static/images/education-bg.png");
        }
        .log1{
            width: 300px;
            height: 400px;
            background-color: white;
            float: right;
            margin-top: 50px;
            margin-right: 400px;
        }
        .log2{
            width: 300px;
            height: 50px;
            background-color: rosybrown;
            color: white;
            font-size: 20px;
            text-align: center;
            line-height: 50px;
        }
        .log3{
            margin: auto;
            line-height: 50px;
            margin-top: 30px;
        }
        .log4{
            color: red;
        }
        a{
            font-size: 12px;
        }
      .img1{

          /*background: url("images/name.png")  ;*/
      }
    </style>

</head>

<body>
<form class="log1" action="/loginServlet1" method="post">
    <div class="log2">用户登录</div>
    <table class="log3">
        <tr>
            <td>用户名</td>
            <td><input class="img1" type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkCode" ></td>
        </tr>
        <tr>
            <td colspan="2"><img id="img" src="/checkCodeServlet"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录">&nbsp;&nbsp;<a href="/register.jsp" >没账号，去注册？</a></td>
        </tr>
        <tr class="log4">
           <td><%=request.getAttribute("login_error") == null?"":request.getAttribute("login_error")%></td>
            <td><%=request.getAttribute("cc_error") == null?"":request.getAttribute("cc_error")%></td>
        </tr>

    </table>

</form>

</body>
</html>
