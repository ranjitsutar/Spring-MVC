<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Expression Language -->
<%@page isELIgnored="false"%>

<!-- Using JSTL  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help page</title>
</head>
<body>
<!-- 
	<h1>My name is Ranjit</h1>
	<h2>Help page</h2>
		<% 
		String name=(String)request.getAttribute("name");
		Integer rollnumber= (Integer) request.getAttribute("rollnumber");
		
		LocalDateTime dateTime=(LocalDateTime)request.getAttribute("time");
		%>
				<h1>Roll Number : <%= rollnumber %></h1>
		
				<h1>Name : <%= name %></h1>
				
				<h1>Time : <%= dateTime %></h1>
-->


<!-- Same Expresion Language  -->

	<h1> Name : ${name}</h1>
	<h1> Roll Number ${rollnumber}</h1>
	<h1> Time :  ${dateTime}</h1>
	<h1> Roll Number ${rollnumber}</h1>
	<h1>List of marks : ${list}</h1>
	
<!-- get the mark iterate by iterate -->	

	<c:forEach var="item" items= ${list} >
	<h1> ${item}</h1>
	
	</c:forEach>
	


</body>
</html>