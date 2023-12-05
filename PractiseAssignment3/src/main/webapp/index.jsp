<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Multiplication Table of 9</title>
</head>
<body>
    <%!
        int number = 9;
    %>

    <h1>Multiplication Table of <%= number %>:</h1>
    <table border="1">
        <%
            for (int i = 1; i <= 10; i++) {
        %>
        <tr>
            <td><%= number %> x <%= i %></td>
            <td>=</td>
            <td><%= number * i %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
