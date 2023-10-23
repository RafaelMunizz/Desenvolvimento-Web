<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="br.com.ifpb.gerenciador.Produto" %>
<c:url value="/CriacaoProdutoServlet" var="linkServletCriacaoProduto" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário de Criação de Produto</title>
</head>
<body>
    <h2>Cadastro de Produto</h2>
    <form action="/gerenciador/CriacaoProdutoServlet" method="post">
        Nome: <input type="text" name="nome" />
        <br>
        Preço: <input type="text" name="preco" />
        <br>
        <input type="submit" value="Cadastrar Produto" />
    </form>
</body>
</html>
