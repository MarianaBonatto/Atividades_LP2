<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <%
            String login = request.getParameter("prontuario");
            String senha = request.getParameter("senha");
            
            if(login.equals("SP1951017") && senha.equals("fma.2702"))
            {
                out.println("<h1>PARABÉNS, VOCÊ CONSEGUIU ACESSAR O SISTEMA</h1>");
            } else {
                response.sendRedirect(request.getContextPath() + "LoginDeAcesso.jsp");
            }
        %>
    </body>
</html>
