<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successfully Deleted...</title>
<link rel="stylesheet" href="UpdateDeleteProduct.css" />
</head>
<body>
	<div>
	<%
	AdminBean ad = (AdminBean)session.getAttribute("abean");
	AddProductBean apb = (AddProductBean)request.getAttribute("dltbean");
	out.println("This Page belongs to Admin: "+ad.getAfname()+"<br>");
	%>
	</div>
	<form action="deletedone" method="post">
		<input type="hidden" name="pid" value=<%=apb.getpId() %> />
		<label for="pname">Product Name: </label>
		<input type="text" name="pname" id="pname" value=<%=apb.getpName() %> />
		<label for="price">Product Price: </label>
		<input type="text" name="price" id="price" value=<%=apb.getPrice() %> />
		<label for="qty">Product Quantity: </label>
		<input type="number" name="qty" id="qty" value=<%=apb.getpQty() %> />
		<input type="submit" value="Yes, Delete" name="btn" />
	</form>
</body>
</html>