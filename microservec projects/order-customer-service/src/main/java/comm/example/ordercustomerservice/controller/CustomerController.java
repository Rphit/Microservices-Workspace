package comm.example.ordercustomerservice.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.ordercustomerservice.entity.CustomerResponseEntity;
import comm.example.ordercustomerservice.model.CustomerModel;
import comm.example.ordercustomerservice.service.CustomerService;
import comm.example.ordercustomerservice.shared.CustomerDto;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	
	@Autowired
	private Environment env;
	
	private CustomerService customerService;
   
	@Autowired
	public CustomerController(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
	public ResponseEntity<CustomerResponseEntity> createCustomer(@RequestBody CustomerModel cModel)
	{
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CustomerDto cDto=modelMapper.map(cModel, CustomerDto.class);
		
		CustomerDto cDto1= customerService.createCustomer(cDto);
		CustomerResponseEntity cre=modelMapper.map(cDto1,CustomerResponseEntity.class);
		
		return new ResponseEntity<CustomerResponseEntity>(cre,HttpStatus.CREATED);
	}	
}
