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
    <title>forEach</title>
</head>
<body>

<%--    begin 开始--%>
<%--    end：结束--%>
<%--    var：临时变量--%>
<%--    step：步长--%>
<%--    varStatus：循环状态对象--%>
<%--    index：容器中元素的索引--%>
<%--    coun：循环次数
        items:容器对象
--%>

<c:forEach begin="1" end="10" var="i" step="1" varStatus="s">
    ${i}
</c:forEach>
<hr>

<%
    List<Object> list = new ArrayList<>();
    list.add("da");
    list.add("xiao");
    list.add("zhong");
    request.setAttribute("list",list);

%>

<c:forEach items="${list}" var="str" varStatus="s">
    ${s.index} ---- ${s.count} ${str}<br>
</c:forEach>
</body>
</html>

