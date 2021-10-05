<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício 4</title>
    </head>
    <%! 
            Integer num = 0;
    %>
    <body>
        <h1>Números múltiplos de 3 entre 0 e 100: </h1>
        <table>
        <%
            for(int i = 0; i < 101; ++i)
            {
                if(i % 3 == 0)
                {
                
        %>
            <tr>
                <td>3</td>
                <td>*</td>
                <td><%= i %></td>
                <td>=</td>
                <td> <%= i * 3 %></td>
            </tr>
        <%
            }
            }
        %>
        </table>
    </body>
</html>
