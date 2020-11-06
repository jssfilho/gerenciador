<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.servlet.Empresa" %>
<c:url value="/editaEmpresa" var="linkServletEditarEmpresa"/>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Empresa</title>
</head>
<body>
	<h2>Alterar Nome</h2>
	</br>
	<form action="${linkServletEditarEmpresa}" method="post">
			Novo Nome: <input type="text" name="novoNome" required  />
			<c:forEach items="${lista}" var="empresa">
				<li><input type="RADIO" name="nome" value='${empresa.getNome()}'/>
				<label>Nome Antigo: ${empresa.getNome()} </label></li>
				</br>
			</c:forEach>
			
			<button type="submit"> Editar Empresa </button>
			<a href='/gerenciador/'>Voltar</a>
	</form>
	
</body>
</html>