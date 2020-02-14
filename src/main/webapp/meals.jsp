<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>

<table border="1">
    <tr>
        <th>DateTime</th>
        <th>Description</th>
        <th>Calories</th>
        <th>Excess</th>
    </tr>

    <c:forEach items="${requestScope.meals}" var="meal">
        <c:set var="color" value="green"/>
        <c:if test="${meal.excess eq true}">
            <c:set var="color" value="red"/>
        </c:if>

        <tr>
            <td>${meal.dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"))}</td>
            <td>${meal.description}</td>
            <td align="right">${meal.calories}</td>
            <td bgcolor=${color}>${meal.excess}</td>
        </tr>
    </c:forEach>

</table>


</body>
</html>