package productcode;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/click")
public class CustomerProductViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			ArrayList<AddProductBean> al = new CustomerProductViewDAO().cusretrive();
			hs.setAttribute("cosview", al);
			req.getRequestDispatcher("CustomerProductView.jsp").forward(req, res);
		}
	}
}
