package comm.example.myphotoappuserservice.shared;

import java.io.Serializable;

public class UserDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1185003112018750163L;
	
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String uId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	
	
	
	

}
