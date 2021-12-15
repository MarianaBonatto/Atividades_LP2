<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário</title>
    </head>
    <body>
        <form action="servlet" method="post">
            <table>
                <tr>
                    <td>Assunto : </td>
                    <td><input type="text" name="assunto"/></td>
                </tr>
                  <tr>
                    <td>Mensagem : </td>
                    <td><input type="text" name="mensagem"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Enviar"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
