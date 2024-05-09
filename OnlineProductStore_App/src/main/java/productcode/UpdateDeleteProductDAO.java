package productcode;
import java.sql.*;
public class UpdateDeleteProductDAO {
	public int k = 0;
	public int delete(AddProductBean apb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from product where pcode=?");
			ps.setString(1, apb.getpId());
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
