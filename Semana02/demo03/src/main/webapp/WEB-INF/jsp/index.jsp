<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/css/estilos.css" rel="stylesheet">
<title>HOME</title>
</head>
<body>
	<h1>SALUDO</h1>
	<div>Hola todos.</div>
	<p></p>
	<div>${mensaje}</div>
	<p></p>
	<div>
		<%
		
		String[] arreglo = (String[]) request.getAttribute("arreglo");
		
		for(String dato: arreglo){
			out.println(dato + "<br/>");
		}
		
		%>
	</div>
	<p>
	<div>
		<button type="button" onclick="saludo();">Saludar</button>		
	</div>
	
	<script src="/js/index.js"></script>
	
	
</body>
</html>