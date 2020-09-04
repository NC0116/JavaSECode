<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/31
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose</title>
</head>
<body>
<%
    List<Object> list = new ArrayList<>();
    list.add("aaa");
    request.setAttribute("list",list);
    request.setAttribute("number",5);

%>
<d:choose>
    <d:when test="${number}">星期一</d:when>
    <d:when test="${number}">星期二</d:when>
    <d:when test="${number}">星期三</d:when>
    <d:when test="${number}">星期四</d:when>
    <d:when test="${number}">星期五</d:when>
    <d:when test="${number}">星期六</d:when>
    <d:when test="${number}">星期日</d:when>
    <d:otherwise >过年</d:otherwise>
</d:choose>
</body>
</html>
