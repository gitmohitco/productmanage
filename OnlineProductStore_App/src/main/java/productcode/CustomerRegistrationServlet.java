package productcode;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/cosreg")
public class CustomerRegistrationServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			CustomerBean cb = new CustomerBean();
			cb.setCuname(req.getParameter("cuname"));
			cb.setCpass(req.getParameter("cpass"));
			cb.setCfname(req.getParameter("cfname"));
			cb.setClname(req.getParameter("clname"));
			cb.setCaddr(req.getParameter("caddr"));
			cb.setCmid(req.getParameter("cmail"));
			cb.setCphno(Long.parseLong(req.getParameter("ctel")));
			int k = new CustomerRegistrationDAO().customerinsert(cb);
			if(k>0) {
				req.setAttribute("msg", "Registration Successfull...<br>");
				req.getRequestDispatcher("Msg.jsp").forward(req, res);
			}
		}
	}
}
