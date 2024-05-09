package productcode;
import java.sql.*;
public class AddedToCartAsPerQtyDAO {
	public int k = 0;
	public int added(CartBean cb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into cart values(?,?,?,?)");
			ps.setString(1, cb.getPname());
			ps.setFloat(2, cb.getPrice());
			ps.setInt(3, cb.getPqty());
			ps.setFloat(4, cb.getTotProd());
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
