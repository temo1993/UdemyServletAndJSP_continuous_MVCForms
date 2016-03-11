<%--
  Created by IntelliJ IDEA.
  User: Temo
  Date: 3/11/2016
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action="Controller" method="post">
    <input type="hidden" name="action" value="dologin"/>
Email: <input type="text" name="email" value="" title="user"/><br/>
Password: <input type="password" name="password" value="" title="password"/><br/>
    <input type="submit" name="submitBtn" value="OK" title="Login"/>
</form>
</body>
</html>
