<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/29
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .us{
            margin: 0;
            padding: 0;
            width: 300px;
            height: 200px;
            margin: 100px auto;
        }
        span{
            color: blue;
        }

    </style>
</head>
<body>
<div class="us"><span>登录成功：</span>&nbsp;&nbsp;<h1><%=session.getAttribute("user")%>,欢迎登录！</h1></div>
<script language="javascript">
    function changeColor(){
        var color="#f00|bai#0f0|#00f|#880|#808|#088|yellow|green|blue|gray|orange";
        color=color.split("|");
        document.querySelector("h1").style.color=color[parseInt(Math.random() * color.length)];
    }
    setInterval("changeColor()",200);
</script>
</body>
</html>
