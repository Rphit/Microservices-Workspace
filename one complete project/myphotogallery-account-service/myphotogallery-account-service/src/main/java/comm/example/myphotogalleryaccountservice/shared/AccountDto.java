package comm.example.myphotogalleryaccountservice.shared;

import java.io.Serializable;
import java.util.UUID;

public class AccountDto implements Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private String accountHolder;
   private String bank;
   private String city;
   private UUID accountNum;
   
   
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public UUID getAccountNum() {
	return accountNum;
}

public void setAccountNum(UUID uuid) {
	this.accountNum = uuid;
}

   
   
   
}
