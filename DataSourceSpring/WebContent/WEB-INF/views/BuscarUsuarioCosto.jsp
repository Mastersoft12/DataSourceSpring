<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar Usuario Centro de Costo</h1>
        <sf:form method="POST" commandName="usuarioCentroCosto">
        Usuario: <sf:input path="usuarioRed"/>
        <input type="submit" value="Buscar">
        </sf:form>
    </body>
</html>