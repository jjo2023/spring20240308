<%--
  Created by IntelliJ IDEA.
  User: zzozzo
  Date: 2024-03-22
  Time: 오전 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>el에서 사용 할 수 있는 연산자</h3>
<h4>산술연산자</h4>
<h4>+, -, *, /, %</h4>

<hr>
<p>${a} + ${b} = ${a + b}</p> <%-- 3 + 5 = 8 반환 --%>
<p>${c} + ${d} = ${c + d}</p> <%-- "8" + "9" 로 스트링을 넣음,
                              el에서 연산자는 산술로만 사용되므로 결과 값은 17--%>

<hr>
<c:forEach begin="1" end="9" var="i">
    <p>2 * ${i} = ${2*i}</p>
</c:forEach>

<hr>
<c:forEach begin="2" end="9" var="i">
    <h2>구구단 ${i}단</h2>
    <c:forEach begin="1" end="9" var="j">
        <p>${i} * ${j} = ${i*j}</p>
    </c:forEach>
</c:forEach>

</body>
</html>
