<%@page import="br.com.buonapizzaria.entidades.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>

	<table border="1">
	
	<tr bgcolor="CCCCCC">
		<th>Código do Cliente</th> <th>Nome </th> <th> Login </th>
	</tr>
	<!-- delimitadores do código java -->
	<% 
	List<Cliente> lista = (List<Cliente>) request.getAttribute("ListaCliente");

	for(Cliente cli: lista){
	%> 
		
		<tr>
			<td><%= cli.getIdCliente() %> </td>
			<td><%= cli.getNomeCliente() %></td>
			<td><%= cli.getLoginCliente() %> </td>
			<td> <a href="clicontroller.do?acao=exc&id=<%= cli.getIdCliente()%>"> Excluir </a> </td>
		</tr>	
		
	<% } %>

	
	</table>
	
	<% %>
	

</body>
</html>