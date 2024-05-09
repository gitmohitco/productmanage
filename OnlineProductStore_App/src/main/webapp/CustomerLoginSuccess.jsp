<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
<link rel="stylesheet" href="CustomerLoginSuccess.css">
</head>
<body>
	<div class="warp">
		<div class="cusdata">
			<%
			CustomerBean cb = (CustomerBean)session.getAttribute("cuslogin");
			out.println("Wel Come "+cb.getCfname()+"<br>");
			%>
		</div>
		<br>
		<div>
			<a href="click">Click to Continue</a>
			<a href="index.html">Back to Home</a>
		</div>
	</div>
</body>
</html>