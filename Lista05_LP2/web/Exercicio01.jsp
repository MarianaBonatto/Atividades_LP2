<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício 01</title>
    </head>
    <%!
        LocalDate data;
     %>
    <body>
        <h1>Data atual : </h1>
    <%
        data = LocalDate.now();
        out.print("<h3>" + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() + "</h3>");
    %>
    </body>
</html>
