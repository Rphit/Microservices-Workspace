/**
 * 
 */
package comm.example.ordercustomerservice.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import comm.example.ordercustomerservice.data.CustomerRepository;
import comm.example.ordercustomerservice.entity.CustomerEntity;
import comm.example.ordercustomerservice.shared.CustomerDto;

@Service
public class CustomerServiceimpl implements CustomerService {

	
  private CustomerRepository customerRepository;
  
  
    @Autowired	
	public CustomerServiceimpl(CustomerRepository customerRepository) {
    	
	this.customerRepository = customerRepository;
}


	@Override
	public CustomerDto createCustomer(CustomerDto cDto) {
		// TODO Auto-generated method stub
		
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CustomerEntity cEntity = modelMapper.map(cDto, CustomerEntity.class);
		customerRepository.save(cEntity);
		
		CustomerDto cDto1= modelMapper.map(cEntity, CustomerDto.class);
		
		return cDto1;
	}

}
