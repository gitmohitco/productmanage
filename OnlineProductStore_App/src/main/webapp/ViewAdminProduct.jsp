<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="productcode.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Product Data</title>
<link rel="stylesheet" href="CartData.css" />
</head>
<body>
	<%
	AdminBean ab = (AdminBean)session.getAttribute("abean");
	ArrayList<AddProductBean> al = (ArrayList<AddProductBean>)session.getAttribute("pbean");
	out.println("<p>Page belongs to admin "+ab.getAfname()+"</p><br>");
	if(al.size()==0){
		out.println("Sorry no Product Data Available!!!<br>");
	}else{
		Iterator<AddProductBean> it = al.iterator();
		while(it.hasNext()){
			AddProductBean apb = (AddProductBean)it.next();
			out.println("<table><tr><th>"+apb.getpId()+"</th>"
			+"<td>"+apb.getpName()+"</td>"+
			"<td>₹"+apb.getPrice()+"</td>"+"<td>Qty: "+apb.getpQty()+"</td>"+
					"<th><a href='edit?pid="+apb.getpId()+"'>Edit</a></th>"+
					"<th><a href='delete?pcode="+apb.getpId()+"' name='delete'>Delete</a></th></tr></table>");
		}
	}
	%>
	<a href="logout" id="log">Logout</a>
</body>
</html>