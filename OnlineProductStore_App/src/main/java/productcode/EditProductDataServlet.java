package productcode;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProductDataServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String pId = req.getParameter("pid");
			ArrayList<AddProductBean> al = (ArrayList<AddProductBean>)hs.getAttribute("pbean");
			Iterator<AddProductBean> it = al.iterator();
			while(it.hasNext()) {
				AddProductBean apb =it.next();
				if(pId.equals(apb.getpId())) {
					hs.setAttribute("editbean", apb);
					break;
				}
			}
			req.getRequestDispatcher("EditProductData.jsp").forward(req, res);
		}
	}
}
