package productcode;
import java.io.IOException;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/dlt")
public class CartDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsg").forward(req, res);
		}else {
			String pname = req.getParameter("pname");
			
			ArrayList<CartBean> al = (ArrayList<CartBean>)hs.getAttribute("cartbean");
			Iterator<CartBean> it = al.iterator();
			while(it.hasNext()) {
				CartBean apb = (CartBean)it.next();
				if(pname.equals(apb.getPname())) {
					int k = new CartDeleteDAO().delete(apb);
					if(k>0) {
						req.setAttribute("msg", "Product removed successfully!!<br>");
					}
					break;
				}
			}
			req.getRequestDispatcher("CartDelete.jsp").forward(req, res);
		}
	}
}
