package productcode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddToCartDAO {
	AddProductBean apb = new AddProductBean();
	public AddProductBean getVal(String code) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product where pcode=?");
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				apb.setpId(rs.getString(1));
				apb.setpName(rs.getString(2));
				apb.setPrice(rs.getFloat(3));
				apb.setpQty(rs.getInt(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return apb;
	}
}
