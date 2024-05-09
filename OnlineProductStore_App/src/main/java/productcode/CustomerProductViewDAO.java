package productcode;
import java.sql.*;
import java.util.*;
public class CustomerProductViewDAO {
	public ArrayList<AddProductBean> al = new ArrayList<AddProductBean>();
	public ArrayList<AddProductBean> cusretrive(){
		
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				AddProductBean apb = new AddProductBean();
				apb.setpId(rs.getString(1));
				apb.setpName(rs.getString(2));
				apb.setPrice(rs.getFloat(3));
				apb.setpQty(rs.getInt(4));
				al.add(apb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
}
