package comm.example.myphotogalleryaccountservice.controller;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.myphotogalleryaccountservice.AccountResponseEntity;
import comm.example.myphotogalleryaccountservice.model.AccountModel;
import comm.example.myphotogalleryaccountservice.service.AccountService;
import comm.example.myphotogalleryaccountservice.shared.AccountDto;

@RestController
@RequestMapping("/accounts")
public class AccountContoller {
	
	@Autowired
	private Environment env;
	
	
	private AccountService aService;
	
	@Autowired	
	public AccountContoller(AccountService aService) {
		super();
		this.aService = aService;
	}


	@GetMapping("/show")
	public String showAccount()
	{
		return " user account in action to perform"  +env.getProperty("local.server.port");
	}

	

@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
	public ResponseEntity<AccountResponseEntity> createAccount(@RequestBody AccountModel aModel)
	{
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AccountDto aDto = modelMapper.map(aModel, AccountDto.class);
		aDto.setAccountNum(UUID.randomUUID());
		
		AccountDto aDto1=aService.createAcccount(aDto);
		AccountResponseEntity are= modelMapper.map(aDto1, AccountResponseEntity.class);
		return new ResponseEntity<AccountResponseEntity>(are,HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<AccountModel> getallAccount()
	{
		List<AccountModel> list = aService.getAll();
		return list;
		
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteAccount(@PathVariable int id)
	{
		aService.delById(id);
		return "deleted Succesfully";
	}
	}