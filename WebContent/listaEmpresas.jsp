<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.ifpb.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	Lista de empresas: <br />
	<c:if test="${not empty nome}">
			Empresa ${ nome } cadastrada com sucesso!
		</c:if>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			
			<li>${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> </li>
		</c:forEach>
	</ul>
	<div>
		<form action="deletaEmpresa" method="post">
			<input type="submit" value="delete" name="value_btn"/>
		</form>
		</br>
		<form action="editaEmpresa" method="post">
			<input type="submit" value="update" name="value_btn"/>
		</form>
		</br>
		<li><a href='/gerenciador/'>Voltar</a></li>
	</div>
</body>
</html>