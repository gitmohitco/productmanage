package productcode;
import java.io.*;
@SuppressWarnings("serial")
public class CartBean implements Serializable {
	private String pname;
	private float price,totProd;
	private int pqty;
	public CartBean() {}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotProd() {
		return totProd;
	}
	public void setTotProd(float totProd) {
		this.totProd = totProd;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
}
