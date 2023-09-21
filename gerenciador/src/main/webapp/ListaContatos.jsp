<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Contato" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Contatos</title>
</head>
<body>	
	
	<p>Lista de contatos</p>
	
	<ul>
		<c:forEach items="${listaContatos}" var="contato">		
			<li>Contato: ${contato.nome} | Email: ${contato.email} | Telefone: ${contato.telefone}</li>
		</c:forEach>		
	</ul>
</body>
</html>