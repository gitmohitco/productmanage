package productcode;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/addcart")
public class AddToCartServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String pId = req.getParameter("pid");
			AddProductBean apb = new AddToCartDAO().getVal(pId);
			hs.setAttribute("addtocart", apb);
			req.getRequestDispatcher("AddToCart.jsp").forward(req, res);
			}
		}
}
