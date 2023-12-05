<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search your Book</title>
<style type="text/css">
    h1 {
        text-align: center;
    }
</style>
</head>
<body>

    <h1>Search Book</h1>
    <form action="FetchBookServlet" method="post">
        Book Title: <input type="text" name="title" required><br>
        <input type="submit" value="Get Book">
    </form>

    <c:if test="${not empty book}">
        <h1>Search Result</h1>
        <table border="1">
            <tr>
                <th>Book ID</th>
                <th>Title</th>
                <th>Publisher</th>
                <th>ISBN</th>
                <th>Author ID</th>
            </tr>
            <tr>
                <td>${book.bookId}</td>
                <td>${book.title}</td>
                <td>${book.publisher}</td>
                <td>${book.isbn}</td>
                <td>${book.authorId}</td>
            </tr>
        </table>
    </c:if>

</body>
</html>
