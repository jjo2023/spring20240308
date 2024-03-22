<%--
  Created by IntelliJ IDEA.
  User: zzozzo
  Date: 2024-03-22
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="0" end="3" var="i">
    <p>${foodList[i]}</p>
</c:forEach>

<hr>
<c:forEach items="${names}" var="name">
    <li>${name}</li>
</c:forEach>

<hr>

<style>

</style>


<%-- varStatus : 반복문의 상태 --%>
<c:forEach begin="0" end="3" var="n" varStatus="stautus">
    <h2>${n}, ${stautus.count}</h2> <%-- count : 이 반복문이 몇 번째인가를 반환 --%>

    <div class="content1">
        n : ${n}
    </div>
    <div class="content2">
        <div>count : ${stautus.count}</div>
        <div>index: ${stautus.index}</div>
        <div>current: ${stautus.current}</div>
    </div>

</c:forEach>

</body>
</html>
