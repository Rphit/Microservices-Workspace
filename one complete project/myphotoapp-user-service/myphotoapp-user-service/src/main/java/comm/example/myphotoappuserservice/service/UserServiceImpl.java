package comm.example.myphotoappuserservice.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import comm.example.myphotoappuserservice.data.UserRepository;
import comm.example.myphotoappuserservice.entity.UserEntity;
import comm.example.myphotoappuserservice.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserDto createUser(UserDto uDto) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity uEntity = modelMapper.map(uDto, UserEntity.class);
		uEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(uDto.getPassword()));
		userRepository.save(uEntity);

		UserDto uDto1 = modelMapper.map(uEntity, UserDto.class);

		return uDto1;
	}

}
