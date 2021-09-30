<%-- 
    Document   : index
    Created on : 30/09/2021, 14:42:55
    Author     : carol
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabuada</title>
    </head>
    <body>
        <h1>TABUADA DO DOIS : </h1>
        <table>
            <%
                for(int a =1; a <=10; a++)
                {
            %>
            <tr>
                <td>2</td>
                <td>*</td>
                <td><%= a %></td>
                <td>=</td>
                <td> <%= a*2 %></td>
            </tr>
            <% 
                }
            %>
        </table>
    </body>
</html>
