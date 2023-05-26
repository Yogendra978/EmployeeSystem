<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee list</title>
</head>
<body>
<h1>Employee list </h1>
<table>
	<thead>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Skills</th>
			<th>Salary</th>
			<th>Mobile</th>
			<th>update</th>
			<th>delete</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="l" items="${list }">
		<tr>
			<td>${l.fristname}</td>
			<td>${l.lastname }</td> 
			<td>${l.email}</td>
			<td>${l.skills }</td>
			<td>${l.sallery }</td>
			<td>${l.mobile }</td>
			<td><a href="update?id=${l.id }">update</a></td>
			<td><a href="delete?id=${l.id }">delete</a></td>
		</tr>
	</c:forEach>
	</tbody>
	
</table>
<h3>${msg }</h3>
</body>
</html>