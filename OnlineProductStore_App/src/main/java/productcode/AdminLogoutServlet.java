package productcode;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class AdminLogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
		}else {
			hs.removeAttribute("abean");
			hs.removeAttribute("pbean");
			hs.invalidate();
			req.setAttribute("msg", "Logged Out Successfully...<br>");
		}
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}
}
