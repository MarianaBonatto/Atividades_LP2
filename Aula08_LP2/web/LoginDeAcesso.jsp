<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login de Acesso</title>
    </head>
    <body>
        <form action="resultado.jsp" method="get">
            <table>
                <tr>
                    <td>Prontuário : </td>
                    <td><input type="text" name="prontuario"/></td>
                </tr>
                <tr>
                    <td>Senha : </td>
                    <td><input type="password" name="senha"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Acessar"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
