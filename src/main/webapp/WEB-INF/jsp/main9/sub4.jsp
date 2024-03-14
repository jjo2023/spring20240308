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
<h3>${attr3.name}</h3>
<h3>${attr3["name"]}</h3>
<%-- ↑ 얘는 보는 바와 같이 문제가 없어...--%>

<%-- 근데 밑에 애들은 띄어쓰기, - 기호때문에 안된다구!! --%>
<%-- 그니까 쟤네들은 네모괄호를 이용해서 불러오도록 하면됨 --%>
<%--<h3>${attr3.my name}</h3>--%>
<h3>${attr3["my name"]}</h3>
<%--<h3>${attr3.your-name}</h3>--%>
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
