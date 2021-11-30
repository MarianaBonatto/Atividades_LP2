<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
    </head>
    <body>
        <%
            out.println("<h1>Cookies</h1>");
            
            for(Cookie c : request.getCookies())
            {
                out.print("<div>" + c.getName() + " ---> " + c.getValue() + "</div>");
            }
        %>
    </body>
</html>
