<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmaci�n de registro</title>
</head>
<body>
	Se registr� exitosamente el alumno
	<b>${alumno.nombre} ${alumno.apellido}</b> de edad
	<b>${alumno.edad} a�os</b>, con email
	<b>${alumno.email}</b>, con c�digo postal
	<b>${alumno.cp}</b>, del g�nero
	<b>${alumno.genero}</b>, en la asignatura optativa
	<b>${alumno.materiaOptativa}</b>, con idiomas elegidos
	<b>${alumno.idioma}</b>
</body>
</html>