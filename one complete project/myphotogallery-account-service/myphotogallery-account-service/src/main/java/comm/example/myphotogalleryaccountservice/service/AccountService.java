package comm.example.myphotogalleryaccountservice.service;

import java.util.List;

import comm.example.myphotogalleryaccountservice.model.AccountModel;
import comm.example.myphotogalleryaccountservice.shared.AccountDto;

public interface AccountService {

   public AccountDto createAcccount( AccountDto aDto);
   
   public List<AccountModel> getAll();
   
   public void delById(int id);
   
}
