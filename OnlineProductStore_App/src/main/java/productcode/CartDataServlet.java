package productcode;
import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/cart")
public class CartDataServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			ArrayList<CartBean> al = new CartDataDAO().cart();
			hs.setAttribute("cartbean", al);
			req.getRequestDispatcher("CartData.jsp").forward(req, res);
		}
	}
}
