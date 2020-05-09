<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>
    <h1>Materialy:</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Nazwa materialu</th>
            <th>Numer koloru</th>
        </tr>
        <c:forEach var="roll" items="${rolls}">
            <c:url var="updateLink" value="/updateForm">
                <c:param name="rollId" value="${roll.id}" />
            </c:url>
        <tr>
            <td>${roll.id}</td>
            <td>${roll.name}</td>
            <td>${roll.colorNumber}</td>
            <td><a href="${updateLink}">Update</a> </td>
        </tr>

    </table>
</body>
</html>