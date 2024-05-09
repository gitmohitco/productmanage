package productcode;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		AddProductBean apb = null;
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String pid = req.getParameter("pcode");
			ArrayList<AddProductBean> al = (ArrayList<AddProductBean>) hs.getAttribute("pbean");
			Iterator<AddProductBean> it = al.iterator();
			while(it.hasNext()) {
				apb = it.next(); 
				if(pid.equals(apb.getpId())) {
					req.setAttribute("dltbean", apb);
					break;
				}
			}
			req.getRequestDispatcher("UpdateDeleteProduct.jsp").forward(req, res);
		}
	}
}
