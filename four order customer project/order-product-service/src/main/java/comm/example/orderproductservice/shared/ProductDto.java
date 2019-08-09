package comm.example.orderproductservice.shared;

import java.io.Serializable;

public class ProductDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String pName;
	String desciption;
	String product_id;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
	

}
