package productcode;
import java.sql.*;
import java.util.ArrayList;
public class ProceedToCheckOutDAO {
	public ArrayList<CartBean> al = new ArrayList<CartBean>();
	public ArrayList<CartBean> checkout(){
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select totprod from cart");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CartBean cb = new CartBean();
				cb.setTotProd(rs.getFloat(1));
				al.add(cb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
