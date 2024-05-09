package productcode;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CartDeleteDAO {
	public int k = 0;
	public int delete(CartBean apb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from cart where pname=?");
			ps.setString(1, apb.getPname());
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
