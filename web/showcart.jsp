<%@ page import="demo.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Temo
  Date: 3/11/2016
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart Page</title>
</head>
<body>
<% Cart cart = (Cart)session.getAttribute("cart"); %>
Items in cart: <%= cart == null ? "error" : cart.getTotalItems() %>

<a href="<%= response.encodeURL(request.getContextPath() + "/showcart2.jsp") %>">Click here to go to showcart2.jsp</a>
</body>
</html>
