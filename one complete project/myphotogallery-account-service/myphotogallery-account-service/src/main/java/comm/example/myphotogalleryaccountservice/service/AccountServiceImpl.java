package comm.example.myphotogalleryaccountservice.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.myphotogalleryaccountservice.data.AccountRepository;
import comm.example.myphotogalleryaccountservice.entity.AccountEntity;
import comm.example.myphotogalleryaccountservice.model.AccountModel;
import comm.example.myphotogalleryaccountservice.shared.AccountDto;
@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public AccountDto createAcccount(AccountDto aDto) {
		// TODO Auto-generated method stub
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AccountEntity aEntity = modelMapper.map(aDto, AccountEntity.class);
		accountRepository.save(aEntity);
 		
		AccountDto aDto1 =modelMapper.map(aEntity, AccountDto.class);
		return aDto1;
	}


	@Override
	public List<AccountModel> getAll() {
		// TODO Auto-generated method stub
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Iterable<AccountEntity> l = accountRepository.findAll();
		List<AccountModel> aModel = new ArrayList<AccountModel>();
		
		for(AccountEntity aEntity :l)
		{
			AccountModel aModel11= modelMapper.map(aEntity,AccountModel.class);
			aModel.add(aModel11);
		}
		
		return aModel;
	}


	@Override
	public void delById(int id) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(id);
	}

}
