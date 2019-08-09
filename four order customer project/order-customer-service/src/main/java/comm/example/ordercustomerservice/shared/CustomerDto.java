package comm.example.ordercustomerservice.shared;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String cName;
	String email;
	int customerId;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	

}
