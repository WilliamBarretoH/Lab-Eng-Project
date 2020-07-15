<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="calculadora.model.entity.History" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	float input1 = 0;
	float input2 = 0;
	float result = 0;
%>

<form action="/calculadora/calculator" method="post">

	input1: <input type="text" name="input1" />
	input2: <input type="text" name="input2" />

	result: <a>result</a>

</form>

	

</body>
</html>