package productcode;
import java.io.*;
@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	private String auname,apass,afname,alname,aAddr,amid;
	private long aphno;
	public AdminBean() {}
	public String getAuname() {
		return auname;
	}
	public void setAuname(String auname) {
		this.auname = auname;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	public String getAfname() {
		return afname;
	}
	public void setAfname(String afname) {
		this.afname = afname;
	}
	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}
	public String getaAddr() {
		return aAddr;
	}
	public void setaAddr(String aAddr) {
		this.aAddr = aAddr;
	}
	public String getAmid() {
		return amid;
	}
	public void setAmid(String amid) {
		this.amid = amid;
	}
	public long getAphno() {
		return aphno;
	}
	public void setAphno(long aphno) {
		this.aphno = aphno;
	}
}
