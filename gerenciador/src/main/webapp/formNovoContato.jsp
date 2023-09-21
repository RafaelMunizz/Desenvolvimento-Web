<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Contato" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovoContato" var="linkServletNovoContato"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Criação de Contato</title>
</head>
<body>
		<h2>Cadastro de contato </h2>
		<form action="${linkServletNovoContato}" method="post">
			Nome: <input type="text" name="nome" />
			<br>
			Email: <input type="text" name="email" />
			<br>
			Telefone: <input type="text" name="telefone" />
			<br>
			<input type="submit" value="cadastrar" />
		</form>

</body>
</html>