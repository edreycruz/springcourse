<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación de registro</title>
</head>
<body>
	Se registró exitosamente el alumno
	<b>${alumno.nombre} ${alumno.apellido}</b> de edad
	<b>${alumno.edad} años</b>, con email
	<b>${alumno.email}</b>, con código postal
	<b>${alumno.cp}</b>, del género
	<b>${alumno.genero}</b>, en la asignatura optativa
	<b>${alumno.materiaOptativa}</b>, con idiomas elegidos
	<b>${alumno.idioma}</b>
</body>
</html>