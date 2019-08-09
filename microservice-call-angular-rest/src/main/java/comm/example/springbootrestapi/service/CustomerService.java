package comm.example.springbootrestapi.service;

import java.util.List;

import comm.example.springbootrestapi.entity.Customer;

public interface CustomerService {
	

	public List<Customer> findAll();
	
	public Customer getById(int theid);
	
	public void createCustomer(Customer cust);
	
	public void deleteById(int theId);

	

	

}
