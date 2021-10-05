<%-- 
    Document   : Exercicio05
    Created on : 05/10/2021, 11:27:18
    Author     : carol
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercício 05</title>
    </head>
   <%! 
            Random random = new Random();
            int num = 0;
    %>
    <body>
        <h1>10 números aleatórios entre 0 e 100: </h1>
        <table>
        <%
            for(int i = 1; i < 11; ++i)
            {
                num = random.nextInt(100);
                
        %>
            <tr>
                <td>Número <%= i %> : </td>
                <td><%= num %></td>
            </tr>
        <%
            }
        %>
        </table>
    </body>
</html>
