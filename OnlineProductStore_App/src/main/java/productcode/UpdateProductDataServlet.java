package productcode;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductDataServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
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
					int k = new UpdateProductDataDAO().update(apb);
					if(k>0) {
						hs.setAttribute("msg", "Product updated successfully!!<br>");
					}
					break;
				}
			}
			req.getRequestDispatcher("UpdateProductData.jsp").forward(req, res);
		}
	}
}
