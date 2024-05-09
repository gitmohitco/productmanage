package productcode;
import java.sql.*;
public class CustomerLoginDAO {
	public CustomerBean cb = null;
	public CustomerBean cuslogin(String uN,String uP) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from customertab where uname=? and pword=?");
			ps.setString(1, uN);
			ps.setString(2, uP);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				cb = new CustomerBean();
				cb.setCuname(rs.getString(1));
				cb.setCpass(rs.getString(2));
				cb.setCfname(rs.getString(3));
				cb.setClname(rs.getString(4));
				cb.setCaddr(rs.getString(5));
				cb.setCmid(rs.getString(6));
				cb.setCphno(rs.getLong(7));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cb;
	}
}
