package productcode;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			AddProductBean apb = new AddProductBean();
			apb.setpId(req.getParameter("pid"));
			apb.setpName(req.getParameter("pname"));
			float pric = Float.parseFloat(req.getParameter("price"));
			int qty = Integer.parseInt(req.getParameter("pqty"));
			apb.setPrice(pric);
			apb.setpQty(qty);
			int k = new AddProductDAO().insert(apb);
			if(k>0) {
				hs.setAttribute("msg", "Product added Successfully...<br>");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			}
		}
	}
}
