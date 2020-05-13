<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 09/05/2020
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <div>
        <h1>Roll Form</h1>
        <form:form method="POST" modelAttribute="roll" action="saveRoll">

            <form:hidden path="id"></form:hidden>
            <form:input path="name" type="text"></form:input>
            <form:input path="colorNumber" type="number"></form:input>
            <form:input path="numberOfRolls" type="number"></form:input>
            <input type="submit">
        </form:form>
    </div>

</div>

<script type="text/javascript"
        src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>