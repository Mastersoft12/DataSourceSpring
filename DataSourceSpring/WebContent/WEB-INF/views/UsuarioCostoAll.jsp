<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Usuario Centro de Costos</h1>
	<c:forEach items="${UsuarioCostoList}" var="usuario">

        ${usuario.centroCosto} : ${usuario.habilitadi} : ${usuario.usuarioCreador} : ${usuario.usuarioRed} <br />

	</c:forEach>

</body>
</html>