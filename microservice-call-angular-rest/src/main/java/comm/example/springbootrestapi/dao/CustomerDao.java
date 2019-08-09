package comm.example.springbootrestapi.dao;

import java.util.List;

import comm.example.springbootrestapi.entity.Customer;

public interface CustomerDao {
	
	
	public List<Customer> findAll();
	
	public Customer getById(int theid);

	public void createCustomer(Customer cust);

	public void deleteById(int theId);
	

	


}
