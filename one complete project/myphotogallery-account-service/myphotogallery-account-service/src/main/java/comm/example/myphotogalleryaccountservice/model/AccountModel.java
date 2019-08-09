package comm.example.myphotogalleryaccountservice.model;

import javax.validation.constraints.NotNull;

public class AccountModel {

	@NotNull(message =" name can not be null")
	private String accountHolder;
	@NotNull(message ="bank name can not be null")
	private String bank;
	@NotNull(message ="city name can not be null")
	private String city;
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
	
	
	
}
