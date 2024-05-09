<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Updated</title>
<link rel="stylesheet" href="UpdateProductData.css" />
</head>
<body>
	<%
	String msg = (String)session.getAttribute("msg");
	out.println(msg);
	%>
	<div class="link">
	<a href="view">View All Product</a>
	<a href="AddProduct.html">Add Product</a>
	<a href="logout">Logout</a>
	</div>
</body>
</html>