<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Out Section</title>
<link rel="stylesheet" href="ProceedToCheckOut.css" />
</head>
<body>
	<div class="warp">
		<div class="warp-text">
		<%
		ArrayList<CartBean> al = (ArrayList<CartBean>)session.getAttribute("cartbean");
		if(al.size()==0){
			out.println("No Data Available...<br>");
		}else{
			Iterator<CartBean> it = al.iterator();
			float sum = 0;
			while(it.hasNext()){
				CartBean cb = it.next();
				sum = (float)sum+cb.getTotProd();
			}
			out.println("Total Amount: "+sum);
		}
		%>
		</div>
		<div class="buy">
		<form action="buy" method="post">
			<input type="submit" value="Buy Now" />
			<a href="cart">Cancel</a>
		</form>
		</div>
	</div>
</body>
</html>