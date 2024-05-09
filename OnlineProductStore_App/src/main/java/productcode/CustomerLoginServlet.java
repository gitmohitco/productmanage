package productcode;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/customerlogin")
public class CustomerLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		String uName = req.getParameter("cosname");
		String uPass = req.getParameter("cospass");
		CustomerBean cb = new CustomerLoginDAO().cuslogin(uName, uPass);
		if(cb==null) {
			req.setAttribute("msg", "Invalid Login Credential...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("cuslogin", cb);
			req.getRequestDispatcher("CustomerLoginSuccess.jsp").forward(req, res);
		}
	}
}
