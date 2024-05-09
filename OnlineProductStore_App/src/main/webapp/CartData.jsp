<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
<link rel="stylesheet" href="CartData.css">
</head>
<body>
	<div class="msg">
	<%
	ArrayList<CartBean> al = (ArrayList<CartBean>)session.getAttribute("cartbean");
	CartBean cb = null;
	if(al.size()==0){
		out.println("Sorry no Product Data Available!!!<br>");
	}else{
		Iterator<CartBean> it = al.iterator();
		while(it.hasNext()){
			cb = it.next();
			out.print("<table><tr><th>"+cb.getPname()+"</th>"+
					"<td>Price: "+cb.getPrice()+"</td>"+
					"<td>qty: "+cb.getPqty()+"</td>"+"<td>Total: "+cb.getTotProd()+"</td>"+
					"<td><a href='dlt?pname="+cb.getPname()+"' id='delete'>Delete</a></td></tr></table>");
		}
	}
	%>
	</div>
	<div>
		<a href="checkout" class="anch">Proceed to Check-Out</a>
	</div>
</body>
</html>