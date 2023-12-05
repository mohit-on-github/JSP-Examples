<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

	<h1>Home page </h1>

	<form action="employee" method="post">
		<label for="name"> </label> 
		Name:<input type="text" name="name" id="name" required /><br>
		Address:<input type="text" name="address" id="addr" required /><br>
		Years Experience: <input type="number" name="experience" id="experience" required /><br>
		Hours Worked:<input type="number" name="hours" id="hours" required /><br>
		
		<input type="submit" value="Send" />

	</form>

</body>
</html>