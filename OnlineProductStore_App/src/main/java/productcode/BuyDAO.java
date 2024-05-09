package productcode;
import java.io.*;
import java.sql.*;
public class BuyDAO {
	public int k = 0;
	public int buy() {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from cart");
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
