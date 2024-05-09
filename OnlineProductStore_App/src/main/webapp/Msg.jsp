<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="msg.css">
</head>
<body>
	<%
	String msg = (String)request.getAttribute("msg");
	out.println(msg);
	%>
	<a href="index.html">Back to Home</a>
</body>
</html>