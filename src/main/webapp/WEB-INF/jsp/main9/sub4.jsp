<%--
  Created by IntelliJ IDEA.
  User: zzozzo
  Date: 2024-03-14
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- 띄어쓰기, -기호 등은 오류 혹은 연산(마이너스니꽈)을 일으켜!
 그럴 경우엔 [""] 네모괄호 표기법을 이용해서 불러오셈
 <h3>${attr3.my name}</h3> 주석 풀면 오류나.. 띄어쓰기 때메 --%>
<h3>${attr3["my name"]}</h3>

<%-- <h3>${attr3.your-name}</h3>
얜 오류는 아닌데 -기호때메 연산을 일으킬 수도 있대!!
그러니까 굳이 써야 하면 네모괄호 써서 불러오래 --%>
<h3>${attr3["your-name"]}</h3>

<hr>

<h3>${myMap}</h3>
<h3>${myMap["son"]}</h3>
<h3>${myMap["lee"]}</h3>
<h3>${myMap["kim"]}</h3>

<hr>

<h3>${myMap.son}</h3>
<h3>${myMap.lee}</h3>
<h3>${myMap.kim}</h3>

<hr>
<%--1. cityMap... 어트리뷰트명이 cityMap이라는걸 알 수 있고--%>
<%--2. .을보고..  키 값을 가져왔다는 걸 알 수 있음..--%>
<%--3. key값을 가져왔다는건... Map을 사용했다는 것!--%>
<h3>${cityMap.seoul}</h3>
<h3>${cityMap.busan}</h3>
<h3>${color.red}</h3>
<h3>${color.blue}</h3>
<h3>${color["black"]}</h3>

</body>
</html>
