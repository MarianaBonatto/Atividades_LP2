<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício 03</title>
    </head>
    <%! 
            Integer num = 0;
    %>
    <body>
        <h1>Números pares entre 0 e 1000: </h1>
        <%
            for(int i = 0; i < 1001; ++i)
            {
                if(i % 2 == 0)
                {
                num = i;
                out.print("<h3>" + num + "</h3>");
                }
            }
        %>
    </body>
</html>
