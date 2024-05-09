package productcode;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/buy")
public class BuyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession();
		CartBean cb = new CartBean();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired..<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			int k = new BuyDAO().buy();
			if(k>0) {
				hs.setAttribute("buydone", cb);
			}
			req.getRequestDispatcher("Buy.jsp").forward(req, res);
		}
	}
}
