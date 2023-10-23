<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Excluir Produto</title>
</head>
<body>
    <h1>Excluir Produto</h1>
    <form action="/gerenciador/ExclusaoProdutoServlet" method="post">
        ID do Produto: <input type="text" name="id" /><br/>
        <input type="submit" value="Excluir Produto" />
    </form>
</body>
</html>
