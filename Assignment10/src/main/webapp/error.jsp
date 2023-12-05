<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
    <h1>Error: NullPointerException</h1>
    <p>An unexpected error occurred: <%= exception.getMessage() %></p>
</body>
</html>
