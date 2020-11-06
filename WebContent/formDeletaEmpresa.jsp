<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.servlet.Empresa" %>
<c:url value="/deletaEmpresa" var="linkServletExcluirEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Excluir Empresa</title>
</head>
<body>
	<form action="${linkServletExcluirEmpresa}" method="post">
			<h2>Excluir Contato</h2>
			<c:forEach items="${lista}" var="empresa">
				<li><input type="RADIO" name="nome" value='${empresa.getNome()}'/>
				Name: ${ empresa.getNome() }</li>
				</br>
			</c:forEach>
			
			<button type="submit"> Excluir Contato </button>
			<a href='/gerenciador/'>Voltar</a>
	</form>
</body>
</html>