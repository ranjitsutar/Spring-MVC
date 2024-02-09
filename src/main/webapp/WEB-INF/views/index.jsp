<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Home Page</h1>
<p>Lorem30</p>


	<% String name= (String) request.getAttribute("name");
		Integer id=(Integer) request.getAttribute("id");

		List<String> listfrient= (List<String>)request.getAttribute("friend");
		
		%>

	<h1> Name is <%= name %></h1>
	<h1>Id <%= id %></h1>
	<h1>List of  Friend</h1>
	<!-- 
	<% 
		for(String s : listfrient ){
			out.println(s);
		}
	%>
	 -->
	 
	 <%  for(String s : listfrient){%>
	 <h1><%= s %></h1>	 
	 %<% }  %>
	 
	 
	 
	
</body>
</html>