<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro del alumno</title>
</head>
<body>

	<form:form action="registrar-alumno" modelAttribute="alumno">
	Nombre:
		<br>
		<form:input path="nombre" />
		<br>
		<form:errors path="nombre" />
		<br>
		<br>
	Apellido:
		<br>
		<form:input path="apellido" />
		<br>
		<br>
	Edad:
	<br>
		<form:input path="edad" />
		<br>
		<form:errors path="edad" />
		<br>
		<br>
	Email:
	<br>
		<form:input path="email" />
		<br>
		<form:errors path="email" />
		<br>
		<br>
	Código postal:
	<br>
		<form:input path="cp" />
		<br>
		<form:errors path="cp" />
		<br>
		<br>
	Materia optativa:
		<br>
		<form:select path="materiaOptativa" multiple="true">
			<form:option value="Diseño" label="Diseño" />
			<form:option value="Karate" label="Karate" />
			<form:option value="Comercio" label="Comercio" />
			<form:option value="Danza" label="Danza" />
		</form:select>
		<br>
		<br>
		Género:
		<br>
		<form:radiobutton path="genero" label="Masculino" value="Masculino" />
		<br>
		<form:radiobutton path="genero" label="Femenino" value="Femenino" />
		<br>
		<br>
		Idiomas a estudiar:
		<br>
		<form:checkbox path="idioma" label="Inglés" value="Inglés" />
		<br>
		<form:checkbox path="idioma" label="Español" value="Español" />
		<br>
		<form:checkbox path="idioma" label="Francés" value="Francés" />
		<br>
		<form:checkbox path="idioma" label="Alemán" value="Alemán" />
		<br>
		<br>
		<input type="submit" value="Registrar">
	</form:form>

</body>
</html>