package comm.example.springbootrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.example.springbootrestapi.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	
	private EntityManager entityManager;
	
	
	
	@Autowired
	public CustomerDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		return query.list();
	}



	@Override
	public Customer getById(int theid) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);

		Customer customer = currentSession.get(Customer.class, theid);
		
		return customer;
	}




	@Override
	public void createCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(cust);
		
	}


	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
		Session currentSession = entityManager.unwrap(Session.class);
		Customer customer = currentSession.get(Customer.class, theId);
		
		currentSession.delete(customer);

	}

}
