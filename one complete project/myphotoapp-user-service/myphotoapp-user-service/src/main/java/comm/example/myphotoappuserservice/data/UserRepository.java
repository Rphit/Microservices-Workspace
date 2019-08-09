package comm.example.myphotoappuserservice.data;

import org.springframework.data.repository.CrudRepository;

import comm.example.myphotoappuserservice.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
