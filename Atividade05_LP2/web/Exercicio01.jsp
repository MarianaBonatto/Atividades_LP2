<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício 01</title>
    </head>
   <%!      
            public int mariAleatorio(int num)
            {
                Random random = new Random();
                return num = random.nextInt(1000);
            }
    %>
    <body>
        <h1>Um número aleatório entre 1 e 1000 : </h1>
        <%
            int num = 0;
            out.print("<h3>" + mariAleatorio(num) + "</h3>");
        %>
    </body>
</html>
