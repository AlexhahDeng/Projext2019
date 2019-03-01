<%@ page import="sample.callPy" %>
<%@ page import="sample.callTarget" %><%--
  Created by IntelliJ IDEA.
  User: 75192
  Date: 2019/1/2
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple jsp page</title>
  </head>
  <body>
  <h3><%=callPy.getMessage()%></h3>
  </body>
</html>
