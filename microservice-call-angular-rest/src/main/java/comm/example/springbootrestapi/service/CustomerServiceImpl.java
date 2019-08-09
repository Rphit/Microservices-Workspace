package comm.example.springbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.springbootrestapi.dao.CustomerDao;
import comm.example.springbootrestapi.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerDao dao;
	
	
	@Autowired
	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	@Transactional
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	@Transactional
	public Customer getById(int theid) {
		// TODO Auto-generated method stub
		return dao.getById(theid);
	}

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		dao.createCustomer(cust);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
		dao.deleteById(theId);
	}

}
