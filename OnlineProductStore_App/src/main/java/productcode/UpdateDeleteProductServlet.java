package productcode;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/deletedone")
public class UpdateDeleteProductServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsg").forward(req, res);
		}else {
			String pcode = req.getParameter("pid");
			String pname = req.getParameter("pname");
			float price = Float.parseFloat(req.getParameter("price"));
			int qty = Integer.parseInt(req.getParameter("qty"));
			
			ArrayList<AddProductBean> al = (ArrayList<AddProductBean>)hs.getAttribute("pbean");
			Iterator<AddProductBean> it = al.iterator();
			while(it.hasNext()) {
				AddProductBean apb = (AddProductBean)it.next();
				if(pcode.equals(apb.getpId())) {
					apb.setpName(pname);
					apb.setPrice(price);
					apb.setpQty(qty);
					int k = new UpdateDeleteProductDAO().delete(apb);
					if(k>0) {
						req.setAttribute("msg", "Product Deleted successfully!!<br>");
					}
					break;
				}
			}
			req.getRequestDispatcher("UpdateProductData.jsp").forward(req, res);
		}
	}
}
