<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Atualizar Produto</title>
</head>
<body>
    <h1>Atualizar Produto</h1>
    <form action="${linkServletAtualizacaoProduto}" method="post">
    Nome: <input type="text" name="nome" value="${produto.nome}" />
    <br>
    Preço: <input type="text" name="preco" value="${produto.preco}" />
    <br>
    <input type="submit" value="Atualizar Produto" />
</form>
</body>
</html>
