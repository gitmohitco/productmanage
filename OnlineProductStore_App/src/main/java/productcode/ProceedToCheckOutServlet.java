package productcode;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/checkout")
public class ProceedToCheckOutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired..<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			ArrayList<CartBean> al = new ProceedToCheckOutDAO().checkout();
			Iterator<CartBean> it = al.iterator();
			while(it.hasNext()) {
				CartBean cb = it.next();
				hs.setAttribute("proceedcheck", cb);
			}
		}
		req.getRequestDispatcher("ProceedToCheckOut.jsp").forward(req, res);
	}
}
