<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MATEMATICA</title>
</head>
<body>
	<h1>MATEMATICA</h1>
	<form method="post" action="matematica">
		<div>
			<label>Número 1:</label>
			<input type="number" name="num1"/> 
		</div>
		<div>
			<label>Número 2:</label>
			<input type="number" name="num2"/> 
		</div>
		<div>
			<input type="submit" name="btnProcesar" value="Procesar"/> 
		</div>
	</form>
	
	<c:if test="${titulo != null}">
		<h1>${titulo}</h1>
		<h3>Numero 1: ${modelo.num1}</h3>
		<h3>Numero 2: ${modelo.num2}</h3>
		<h3>Suma: ${modelo.suma}</h3>
		<h3>Producto: ${modelo.producto}</h3>
	</c:if>
	
</body>
</html>