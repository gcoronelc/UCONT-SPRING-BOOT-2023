<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUMAR</title>
</head>
<body>
	<h1>SUMAR</h1>
	<form method="post" action="sumar">
		<div>
			<label>Producto:</label> <select name="producto">
				<c:forEach items="${productos}" var="bean">
					<option id="${bean.codigo}">${bean.nombre}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			<label>Cantidad:</label> <input type="number" name="nume2" />
		</div>
		<div>
			<input type="submit" name="btnProcesar" value="Procesar" />
		</div>
	</form>

	<c:if test="${reporte != null}">
		<h1>REPORTE</h1>
		<h2>${reporte}</h2>
	</c:if>

</body>
</html>