package comm.example.myphotogalleryaccountservice.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="accounts")
public class AccountEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable= false,length =50)
	private String accountHolder;
	@Column(nullable= false,length =50)
	private String bank;
	@Column(nullable= false,length =50)
	private String city;
	@Column
	private UUID accountNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void setAccountNum(UUID accountNum) {
		this.accountNum = accountNum;
	}
	
	
	
	
	

}
