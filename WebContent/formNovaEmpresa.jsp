<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Empresa</title>
</head>
<body>
	<h2>Nova Empresa</h2>
	</br>
	<form action="${linkServletNovaEmpresa }" method="post">
	
		Nome: <input type="text" name="nome" required />
	
		<button type="submit"> Salvar </button>
		<a href='/gerenciador/'>Voltar</a>
	</form>

</body>
</html>