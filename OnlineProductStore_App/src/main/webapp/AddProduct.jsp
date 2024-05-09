<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="msg.css">
</head>
<body>
	<%
	AdminBean ab = (AdminBean)session.getAttribute("abean");
	String msg = (String)session.getAttribute("msg");
	out.println("Page is belongs to admin "+ab.getAfname()+"<br>");
	out.println(msg+"<br>");
	%>
	<div class="anchor">
		<a href="AddProduct.html">Add Product</a>
		<a href="view">View Product details</a>
		<a href="logout">Logout</a>
	</div>
</body>
</html>