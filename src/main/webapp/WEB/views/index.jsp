<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	
<body>
	<h1>Registration Employee Form</h1>
	<pre>
	<form action="save" method="post">
	Frist Name <input type="text" name="fristname"/>
	Last Name  <input type="text" name="lastname"/>
	Email      <input type="email" name="email"/>
	Skills*	   <input type="text" name="skills"/>
	Sallery*   <input type="number" name="sallery"/>
	mobile     <input type="number" name="mobile"/>
	   <input type="submit" value="save"/>
	</form>
	${msg }
	</pre>
</body>
</html>