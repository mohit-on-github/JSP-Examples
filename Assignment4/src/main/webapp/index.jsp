<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Citizen Form - Assignment 4</title>
<style type="text/css">
h1 {
	text-align: center;
}
</style>
</head>

<body>

	<h1>Citizen Form</h1>
	
		<form action="CitizenServlet" method="post">
		<label for="id"> </label> 
		ID:<input type="number" name="id" id="id" required /><br>

		<label for="name"></label>
		Name: <input type="text" name="name" id="name" required /><br>
		Address:<input type="text" name="address" id="addr" required /><br>
		Total Income:<input type="number" name="income" id="income" required /><br>
		
		<input type="submit" value="Send" />

	</form>

</body>
</html>