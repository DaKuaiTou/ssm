<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2023/1/7
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/user/register1" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    昵称：<input type="text" name="nickname"><br>
    生日：<input type="text" name="birthday"><br>
    爱好：
    <input type="checkbox" name="hobbies" value="football">足球
    <input type="checkbox" name="hobbies" value="basketball">篮球
    <input type="checkbox" name="hobbies" value="paiqiu">排球
    <input type="checkbox" name="hobbies" value="yvmaoqiu">羽毛球
    <input type="submit" value="注册">
</form>
</body>
</html>
