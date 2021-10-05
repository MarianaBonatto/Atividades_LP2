<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercicio 01</title>
    </head>
    <%! 
            public ArrayList<Integer> mariArray(ArrayList<Integer> numeros)
            {
                 for(int i = 1; i < 10001; ++i)
                {
                if(i % 5 == 0)
                {
                    numeros.add(i);
                }
                }
                    return numeros;
            }
    %>
    <body>
        <h1>Números múltiplos de 5 entre 0 e 10000: </h1>
        <%
            ArrayList<Integer> num = new ArrayList<Integer>();
        %>
        <table>
            <tr>
                <td><%= mariArray(num) %></td>
            </tr>
        </table>
    </body>
</html>
