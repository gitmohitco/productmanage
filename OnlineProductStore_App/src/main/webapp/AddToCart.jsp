<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add To Cart</title>
<link rel="stylesheet" href="Cpview.css">
</head>
<body>
<%
	AddProductBean apb = (AddProductBean)session.getAttribute("addtocart");
	if(apb == null){
		out.println("Product Not Found...<br>");
	}else{
		out.print("<table><tr><th>"+apb.getpName()+"</th>"+
				"<td>Price: "+apb.getPrice()+"</td>"+
				"<td>avl qty: "+apb.getpQty()+"</td></tr></table>");
	}
%>
	<form action="atcart" method="post" id="form">
		<input type="text" name="name" value="<%=apb.getpName() %>" />
		<input type="hidden" name="price" value="<%=apb.getPrice() %>" />
		<input type="number" placeholder="Enter the Quantity" name="numProd" /><br>
		<div class="btn">
			<input type="submit" value="Add To Cart" />
			<a href="click">Continue Shopping</a>
		</div>
	</form>
</body>
</html>