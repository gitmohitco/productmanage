<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" href="UpdateProductData.css" />
</head>
<body>
	<div>
		<%
		String msg = (String)session.getAttribute("msg");
		out.println(msg);
		%>
	</div>
	<a href="CustomerLogin.html">Login</a>
</body>
</html>