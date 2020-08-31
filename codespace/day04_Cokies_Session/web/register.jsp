<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/30
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body{
      background-color: peru;
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
</style>

<body>
<form class="log1" action="/registerServlet" method="post">
    <div class="log2">用户注册</div>
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
            <td>性别</td>
            <td><input type="text" name="gender" ></td>
        </tr>
        <tr>
            <td colspan="2"><img id="img" src="/checkCodeServlet"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="注册"></td>
        </tr>
    </table>

</form>
</body>
</html>
