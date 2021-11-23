<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login de Acesso</title>
        <link href="css/login.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form action="Login" method="post">
            <table>
                <tr>
                    <td>Login : </td>
                    <td><input type="text" name="login"/></td>
                </tr>
                  <tr>
                    <td>Senha : </td>
                    <td><input type="password" name="senha"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="ENTRAR"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
