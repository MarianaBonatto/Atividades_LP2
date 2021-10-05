<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercicio 03</title>
    </head>
     <%!
        LocalDate data;
     %>
    <body>
        <h1>Datas dos últimos 7 dias : </h1>
        <table>
        <%
                data = LocalDate.now();
                data = data.minusDays(01);
        %>
            <tr>
                <td> Data <%= 01 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
          <%
                data = LocalDate.now();
                data = data.minusDays(02);
                
           %>
            <tr>
                <td> Data <%= 02 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
            <%
                data = LocalDate.now();
                data = data.minusDays(03);
                
           %>
            <tr>
                <td> Data <%= 03 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
            <%
                data = LocalDate.now();
                data = data.minusDays(04);
                
           %>
            <tr>
                <td> Data <%= 04 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
            <%
                data = LocalDate.now();
                data = data.minusDays(05);
                
           %>
            <tr>
                <td> Data <%= 05 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
            <%
                data = LocalDate.now();
                data = data.minusDays(06);
                
           %>
            <tr>
                <td> Data <%= 06 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
            <%
                data = LocalDate.now();
                data = data.minusDays(07);
                
           %>
            <tr>
                <td> Data <%= 07 %> : </td>
                <td> <%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %> </td>
            </tr>
        </table>
    </body>
</html>
