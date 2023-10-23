<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listagem de Produtos</title>
</head>
<body>
    <h2>Lista de Produtos</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Preço</th>
            <th>Ações</th>
        </tr>
        <c:forEach items="${listaDeProdutos}" var="produto">
            <tr>
                <td><c:out value="${produto.id}" /></td>
                <td><c:out value="${produto.nome}" /></td>
                <td><c:out value="${produto.preco}" /></td>
                <td>
                    <a href="<c:url value='/AtualizacaoProdutoServlet?id=${produto.id}'/>">Editar</a>
                    <a href="<c:url value='/ExclusaoProdutoServlet?id=${produto.id}'/>">Remover</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
