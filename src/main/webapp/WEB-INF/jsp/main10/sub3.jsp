<%--
  Created by IntelliJ IDEA.
  User: zzozzo
  Date: 2024-03-21
  Time: 오후 5:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jstl core tag 설정하기..--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
${person1.name}
${person.id}
${person1.foods[0]}
${person1.foods[1]}
${person1.foods[2]}

<hr>

<h3>${person1.cars[0]}</h3>
<h3>${person1.cars[1]}</h3>
<h3>${person1.cars[2]}</h3>

<hr>

<c:forEach items="${person1.cars}" var="car">
    ${car}
</c:forEach>

<hr>

<c:forEach items="${person1.foods}" var="food">
    ${food}
</c:forEach>

</body>
</html>
