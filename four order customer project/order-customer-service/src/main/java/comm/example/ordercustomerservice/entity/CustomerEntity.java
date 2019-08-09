package comm.example.ordercustomerservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class CustomerEntity implements Serializable {
  
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue
  int id;
   @Column(name="cname")
  String cName;
   @Column
  String email;
   @Column(name="customer_id")
  int customerId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
