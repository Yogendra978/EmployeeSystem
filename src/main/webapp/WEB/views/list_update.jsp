<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>update</h1>
	<form action="updateData" method="post">
	<pre>
	First Name <input type="text" name="fristname" value="${up.fristname }"/>
	Last Name  <input type="text" name="lastname" value="${up.lastname }"/>
	Email 	   <input type="email" name="email" value="${up.email }"/>
	Skills     <input type="text" name="skills" value="${up.skills }"/>
	Sallery    <input type="text" name="sallery" value="${up.sallery }"/>
	Mobile     <input type="text" name="mobile" value="${up.mobile }">
		<input type="submit" value="update"/>
		</pre>
	</form>
</body>
</html>