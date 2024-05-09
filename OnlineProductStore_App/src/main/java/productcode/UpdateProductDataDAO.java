package productcode;
import java.sql.*;
public class UpdateProductDataDAO {
	public int k = 0;
	public int update(AddProductBean apb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update product set pname=?,price=?,pqty=? where pcode=?");
			ps.setString(1, apb.getpName());
			ps.setFloat(2, apb.getPrice());
			ps.setInt(3, apb.getpQty());
			ps.setString(4, apb.getpId());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
