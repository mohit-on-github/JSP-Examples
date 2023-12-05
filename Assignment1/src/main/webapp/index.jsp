<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime, java.time.format.DateTimeFormatter" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Today's Date and Time</title>
</head>
<body>
    <h1>Today's Date and Time:</h1>
    <%
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter time = DateTimeFormatter.ofPattern(" HH:mm:ss");
        String formattedDate = now.format(date);
        String formattedTime = now.format(time);
    %>
    <h3>Date:</h3><p><%= formattedDate %></p>
    <h4>Time:</h4><p><%= formattedTime %></p>
</body>
</html>
