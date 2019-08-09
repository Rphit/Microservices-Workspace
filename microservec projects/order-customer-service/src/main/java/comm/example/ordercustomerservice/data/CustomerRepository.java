package comm.example.ordercustomerservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import comm.example.ordercustomerservice.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
