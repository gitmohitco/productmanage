package productcode;
import java.sql.*;
import java.util.*;
public class CartDataDAO {
	public ArrayList<CartBean> al = new ArrayList<CartBean>();
	public ArrayList<CartBean> cart(){
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from cart");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CartBean cb = new CartBean();
				cb.setPname(rs.getString(1));
				cb.setPrice(rs.getFloat(2));
				cb.setPqty(rs.getInt(3));
				cb.setTotProd(rs.getFloat(4));
				al.add(cb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
	
}
