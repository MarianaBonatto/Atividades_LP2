<%@page import="Atividade08.Conteudo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
    </head>
    <body>
        <h1>Lista : </h1>

        <table>
            <tr>
                <th>Assunto </th>
                <th>Mensagem </th>
            </tr>

            <%
                ArrayList<Conteudo> lista = (ArrayList<Conteudo>) session.getAttribute("lista");
                for (Conteudo conteudo : lista) 
                {
            %>
    
            <tr>
                <td><%=conteudo.getAssunto()%></td>
                <td><%=conteudo.getMensagem()%></td>
      
            <%
                }
            %>
            </tr>
        </table>

        <a href="index.jsp">Clique aqui e igite um novo assunto ou mensagem</a>
  
    </body>
</html>
