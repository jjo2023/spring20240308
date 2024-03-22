<%--
  Created by IntelliJ IDEA.
  User: zzozzo
  Date: 2024-03-22
  Time: 오후 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>form 요소</h2>
<form> <%-- action 안쓰면 현재 경로 --%>
    <input type="text" name="param1">
    <br>
    <input type="text" name="param2">
    <br>
    <button>전송</button>
</form>

<hr>
<form action=""> <%-- 빈 스트링이어도 현재경로 --%>

이름 : <input type="text" name="name">
<br>
<input type="text" name="age">
<br>
<input type="text" name="address">
<br>
<input type="tel" name="email">
<br>
<button>전송</button>
</form>

<%-- 그럼 이제 action을 써보자 --%>
<hr>
<form action="https://search.naver.com/search.naver">
    <input type="text" name="query"><br>
    <button>네이버로검색</button>
</form>

<hr>
<form action="https://www.google.com/search">
    <input type="text" name="q" id=""><br>
    <button>구글로검색</button>
</form>

<hr>
<form action="https://prod.danawa.com/list/">
    <input type="text" name="shortcutKeyword"><br>
    <button>다나와로검색</button>
</form>

<hr>
<form action="/"> <%-- /로 시작하는 경우 path가 결정됨 --%>
    <input type="text" name="email"><br>
    <button>전송</button>
</form>

<form action="/main12/sub2">
    <input type="text" name="age"><br>
    <button>전송</button>
</form>

<hr>
<form action="main12/sub2"> <%-- /도 아니고 peotocol(://)도 아니면 현재페이지의 상대경로.
                            마지막 슬래시의 뒤로 들어감--%>
    <input type="text" name="email"><br>
    <button>전송</button>
</form>
<form action="sub3">
    <input type="text" name="address">
    <button>전송</button>
</form>

<%-- .. : 한 경로 위 --%>
<form action="..">
    <input type="text" name="age">
    <button>전공</button>
</form>



















</body>
</html>
