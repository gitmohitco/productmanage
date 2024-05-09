<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Purchase Successfully</title>
<link rel="stylesheet" href="Cpview.css" >
</head>
<body>
	<div class="warp">
		<div class="msg">
		<%
		CartBean cb = (CartBean)session.getAttribute("buydone");
		out.println("Purched Successfully");
		%>
		</div>
		<div>
			
		</div>
	</div>
</body>
</html>