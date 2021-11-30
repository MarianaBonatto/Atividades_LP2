<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
     <body>
        <form action="cadastro" method="post">
            <table>
                <tr>
                    <td>Nome : </td>
                    <td><input type="text" name="name"/></td>
                </tr>
                  <tr>
                    <td>Endereço : </td>
                    <td><input type="text" name="address"/></td>
                </tr>
                <tr>
                    <td>Bairro : </td>
                    <td><input type="text" name="district"/></td>
                </tr>
                <tr>
                    <td>Cidade : </td>
                    <td><input type="text" name="city"/></td>
                </tr>
                <tr>
                    <td>Cep : </td>
                    <td><input type="text" name="cep"/></td>
                </tr>
                <tr>
                    <td>Telefone : </td>
                    <td><input type="text" name="telephone"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="CADASTRAR"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
