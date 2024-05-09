package productcode;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/atcart")
public class AddedToCartAsPerQtyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String pname = req.getParameter("name");
			float price = Float.parseFloat(req.getParameter("price"));
			int qty = Integer.parseInt(req.getParameter("numProd"));
			float totPrice = price*qty;
				CartBean cb = new CartBean();
					cb.setPname(pname);
					cb.setPrice(price);
					cb.setPqty(qty);
					cb.setTotProd(totPrice);
				int k = new AddedToCartAsPerQtyDAO().added(cb);
				if(k>0) {
					hs.setAttribute("addbyqty", cb);
					req.getRequestDispatcher("AddedToCartAsPerQty.jsp").forward(req, res);
				}
		}
	}
}
