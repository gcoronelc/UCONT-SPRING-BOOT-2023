<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PROMEDIO</h1>

	<h2>Datos</h2>
	<form method="post" action="promedio">
		<div>
			Número 1: <input type="number" name="n1" />
		</div>
		<div>
			Número 2: <input type="number" name="n2" />
		</div>
		<div>
			Número 3: <input type="number" name="n3" />
		</div>
		<div>
			<input type="submit" value="Enviar" />
		</div>
	</form>

	<%
	if (request.getAttribute("pr") != null) {
	%>
	<h2>Resultado</h2>
	<div>Número 1: ${n1}</div>
	<div>Número 2: ${n2}</div>
	<div>Número 3: ${n3}</div>
	<div>Promedio: ${pr}</div>
	<%
	}
	%>
</body>
</html>