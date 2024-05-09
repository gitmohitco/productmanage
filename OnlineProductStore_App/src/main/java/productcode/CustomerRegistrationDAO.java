package productcode;
import java.sql.*;
public class CustomerRegistrationDAO {
	public int k = 0;
	public int customerinsert(CustomerBean cb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into customertab values(?,?,?,?,?,?,?)");
			ps.setString(1, cb.getCuname());
			ps.setString(2, cb.getCpass());
			ps.setString(3, cb.getCfname());
			ps.setString(4, cb.getClname());
			ps.setString(5, cb.getCaddr());
			ps.setString(6, cb.getCmid());
			ps.setLong(7, cb.getCphno());
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
