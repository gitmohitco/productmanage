<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleted Successfully</title>
<link rel="stylesheet" href="CartDelete.css">
</head>
<body>
	<div class="warp">
	<div>
	<%
	String msg = (String)request.getAttribute("msg");
	out.println(msg);
	%>
	</div>
	</div>
</body>
</html>