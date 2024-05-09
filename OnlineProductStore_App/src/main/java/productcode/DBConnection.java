package productcode;

import java.sql.*;

public class DBConnection {
	private static Connection conn = null;
	private DBConnection() {
		
	}//Connection protected
	//Connection must runs only once  
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBInfo.dburl,DBInfo.dbuname,DBInfo.dbpass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return conn;
	}
}
