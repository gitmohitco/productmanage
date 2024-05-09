<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products Available</title>
<link rel="stylesheet" href="Cpview.css">
</head>
<body>
	<%
	ArrayList<AddProductBean> al = (ArrayList<AddProductBean>)session.getAttribute("cosview");
	Iterator<AddProductBean> it = al.iterator();
	out.println("<h2>Products</h2><br>");
	out.print("<a href='cart' id='cart'>Cart</a>");
	out.println("<a href='logout' id='logout'>Logout</a><br>");
	while(it.hasNext()){
		AddProductBean apb = (AddProductBean)it.next();
		out.print("<table><tr><th>"+apb.getpName()+"</th>"+
				"<td>Price: "+apb.getPrice()+"</td>"+
				"<td>qty: "+apb.getpQty()+"</td>"+
				"<td><a href='addcart?pid="+apb.getpId()+"' id='addcart'>Add to cart</a></td></tr></table>");
	}
	%>
</body>
</html>