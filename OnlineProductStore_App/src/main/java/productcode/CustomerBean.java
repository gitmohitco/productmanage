package productcode;
import java.io.*;
@SuppressWarnings("serial")
public class CustomerBean implements Serializable {
	private String cuname,cpass,cfname,clname,caddr,cmid;
	private long cphno;
	public CustomerBean() {}
	public String getCuname() {
		return cuname;
	}
	public void setCuname(String cuname) {
		this.cuname = cuname;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getCfname() {
		return cfname;
	}
	public void setCfname(String cfname) {
		this.cfname = cfname;
	}
	public String getClname() {
		return clname;
	}
	public void setClname(String clname) {
		this.clname = clname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public String getCmid() {
		return cmid;
	}
	public void setCmid(String cmid) {
		this.cmid = cmid;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
}
