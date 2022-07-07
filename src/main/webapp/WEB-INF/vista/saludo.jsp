<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hola, ${param.nombre}. Bienvenido al curso de Spring</h3>
<br>

<h3>${mensaje}</h3>

<img alt="Dólares perrones" src="${pageContext.request.contextPath}/resources/img/dollars.jpg">
</body>
</html>