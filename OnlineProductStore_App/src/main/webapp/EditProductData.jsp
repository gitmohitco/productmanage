<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Here</title>
<link rel="stylesheet" href="EditProductData.css" /> 
</head>
<body>
	<%
	AdminBean ab = (AdminBean)session.getAttribute("abean");
	AddProductBean apb = (AddProductBean)session.getAttribute("editbean");
	out.println("This page belongs to Admin: <span>"+ab.getAfname()+"</span><br>");
	%>
	<form action="update" method="post">
		<input type="hidden" name="pid" value=<%=apb.getpId() %> />
		<label for="pname">Product Name: </label>
		<input type="text" name="pname" id="pname" value=<%=apb.getpName() %> />
		<label for="price">Product Price: </label>
		<input type="text" name="price" id="price" value=<%=apb.getPrice() %> />
		<label for="qty">Product Quantity: </label>
		<input type="number" name="qty" id="qty" value=<%=apb.getpQty() %> />
		<input type="submit" value="Update" name="btn" />
	</form>
</body>
</html>