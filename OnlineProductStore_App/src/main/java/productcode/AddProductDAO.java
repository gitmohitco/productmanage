package productcode;
import java.sql.*;
public class AddProductDAO {
	public int k = 0;
	public int insert(AddProductBean apb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setString(1, apb.getpId());
			ps.setString(2, apb.getpName());
			ps.setFloat(3, apb.getPrice());
			ps.setInt(4, apb.getpQty());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
