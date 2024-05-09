package productcode;
import java.sql.*;
public class AdminDAO {
	public AdminBean ab = null;
	public AdminBean login(String uN,String pW) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from productadmin where uname=? and password=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ab = new AdminBean();
				ab.setAuname(rs.getString(1));
				ab.setaAddr(rs.getString(2));
				ab.setAfname(rs.getString(3));
				ab.setAlname(rs.getString(4));
				ab.setaAddr(rs.getString(5));
				ab.setAmid(rs.getString(6));
				ab.setAphno(rs.getLong(7));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ab;
	}
}
