<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício 02</title>
    </head>
    <%! 
            Integer num = 0;
    %>
    <body>
        <h1>Números : </h1>
        <%
            for(int i = 1; i < 101; ++i)
            {
                num = i;
                out.print("<h3>" + num + "</h3>");
            }
        %>
    </body>
</html>
