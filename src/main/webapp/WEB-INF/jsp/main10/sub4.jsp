<%--
  Created by IntelliJ IDEA.
  User: zzozzo
  Date: 2024-03-21
  Time: 오후 6:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>forEach tag</h1>
<p> 콘텐츠 반복 출력</p>
<p>주요 attribute : begin, end, var, items, varStatus </p>
<c:forEach begin="1" end="3" var="num">
    <li>${num}</li> <%-- 전체줄 주석말고.. 이렇게 옆에 주석 넣고 싶을때!! 컨트롤 + 쉬프트 + /--%>
</c:forEach>

<hr>

<c:forEach items="${myList}"  var="item">
    <li>${item}</li>
</c:forEach>

</body>
</html>
