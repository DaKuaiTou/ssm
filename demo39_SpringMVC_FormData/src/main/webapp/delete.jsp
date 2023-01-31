<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/1/8
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除页面</title>
</head>
<body>
<form action="/user/delete" method="post">
    <input type="checkbox" name="ids" value="1">
    <input type="checkbox" name="ids" value="2">
    <input type="checkbox" name="ids" value="3">
    <input type="checkbox" name="ids" value="4">
    <input type="checkbox" name="ids" value="5">
    <input type="checkbox" name="ids" value="6">
    <input type="checkbox" name="ids" value="7">
    <input type="submit" value="删除">
</form>
</body>
</html>
