package productcode;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/adlog")
public class AdminServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		String uN = req.getParameter("auname");
		String uP = req.getParameter("apass");
		AdminBean ab = new AdminDAO().login(uN, uP);
		if(ab==null) {
			req.setAttribute("msg", "Invalid Login Credentials...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			HttpSession hs = req.getSession(); //Session Created
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
	}
}
