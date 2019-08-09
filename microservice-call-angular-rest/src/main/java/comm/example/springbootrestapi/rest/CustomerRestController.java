package comm.example.springbootrestapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.springbootrestapi.dao.CustomerDao;
import comm.example.springbootrestapi.entity.Customer;
import comm.example.springbootrestapi.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	private CustomerService service;

	
	@Autowired
	public CustomerRestController(CustomerService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/customer")
	public List<Customer> getAll()
	{
		return service.findAll();
		
	}
	
	@RequestMapping("/customer/{iD}")
	public Customer getByID(@PathVariable int iD)
	{
		
		Customer customer = service.getById(iD);
		
		if(customer==null){
			throw new IdNotFoundException("no such customer found with id: "+iD);
		}
		return customer;
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer cus)
	{
		
		cus.setId(0);
		
		service.createCustomer(cus);
		
		return cus;
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer cuss)
	{
				
		service.createCustomer(cuss);
		return cuss;
	}
	
	@DeleteMapping("/customer/{iD}")
	public String delByID(@PathVariable int iD)
	{
		Customer custt = service.getById(iD);
		
		service.deleteById(iD);
		
		return "Deleted Customer:  "+custt;
	}
	

}
