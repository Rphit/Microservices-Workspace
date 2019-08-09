package comm.example.myphotoappuserservice.controller;



import java.util.UUID;

import javax.print.attribute.standard.Media;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.myphotoappuserservice.UserResponseEntity;
import comm.example.myphotoappuserservice.model.UserModel;
import comm.example.myphotoappuserservice.service.UserService;
import comm.example.myphotoappuserservice.shared.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private Environment env;
	
	private UserService uService;
	
@Autowired
	public UserController(UserService uService) {
		super();
		this.uService = uService;
	}

	@GetMapping("/status/check")
	public String getUsersStatus()
	{
		return "users-service: up and running: port no: "+env.getProperty("local.server.port");
	}
	
@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
	public ResponseEntity<UserResponseEntity> createUser(@RequestBody UserModel uModel)
	{
		
	ModelMapper modelMapper=new ModelMapper();
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	UserDto uDto=modelMapper.map(uModel, UserDto.class);
	uDto.setuId(UUID.randomUUID().toString());
	
	UserDto uDto1=uService.createUser(uDto);
	 UserResponseEntity ure= modelMapper.map(uDto1, UserResponseEntity.class);
	return new ResponseEntity<UserResponseEntity>(ure,HttpStatus.CREATED);
	}
}
