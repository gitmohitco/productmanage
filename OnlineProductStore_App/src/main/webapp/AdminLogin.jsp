<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login JSP page</title>
<link rel="stylesheet" href="msg.css">
</head>
<body>
	<%
		AdminBean ab = (AdminBean)session.getAttribute("abean");
		out.println("Page belongs to Admin: "+ab.getAfname()+"<br>");
	%>
	<div>
		<a href="AddProduct.html">Add Product</a>
		<a href="view">View All Product</a>
		<a href="logout">Logout</a>
	</div>
</body>
</html>