package comm.example.myphotogalleryaccountservice.data;

import org.springframework.data.repository.CrudRepository;

import comm.example.myphotogalleryaccountservice.entity.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {

}
