<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercicio 04</title>
    </head>
   <body>
        <h1>TABUADA DO DEZ : </h1>
        <table>
            <%
                for(int a =1; a <=10; a++)
                {
            %>
            <tr>
                <td>10</td>
                <td>*</td>
                <td><%= a %></td>
                <td>=</td>
                <td> <%= a*10 %></td>
            </tr>
            <% 
                }
            %>
        </table>
        <h1>TABUADA DO DOZE : </h1>
        <table>
            <%
                for(int a =1; a <=10; a++)
                {
            %>
            <tr>
                <td>12</td>
                <td>*</td>
                <td><%= a %></td>
                <td>=</td>
                <td> <%= a*12 %></td>
            </tr>
            <% 
                }
            %>
        </table>
        <h1>TABUADA DO QUATORZE : </h1>
        <table>
            <%
                for(int a =1; a <=10; a++)
                {
            %>
            <tr>
                <td>14</td>
                <td>*</td>
                <td><%= a %></td>
                <td>=</td>
                <td> <%= a*14 %></td>
            </tr>
            <% 
                }
            %>
        </table>
        <h1>TABUADA DO DEZESSEIS : </h1>
        <table>
            <%
                for(int a =1; a <=10; a++)
                {
            %>
            <tr>
                <td>16</td>
                <td>*</td>
                <td><%= a %></td>
                <td>=</td>
                <td> <%= a*16 %></td>
            </tr>
            <% 
                }
            %>
        </table>
    </body>
</html>