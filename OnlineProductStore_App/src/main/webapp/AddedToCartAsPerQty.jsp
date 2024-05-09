<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Added to Cart Successfully</title>
<link rel="stylesheet" href="AddToCartAsPerQty.css">
</head>
<body>
	<div class="text">
	<%
	CartBean cb = (CartBean)session.getAttribute("addbyqty");
	out.println(cb.getPname()+": added to cart successfully...<br>");
	%>
	</div>
	<div>
		<a href="cart">Cart</a>
		<a href="click">Continue Shopping</a>
	</div>
</body>
</html>