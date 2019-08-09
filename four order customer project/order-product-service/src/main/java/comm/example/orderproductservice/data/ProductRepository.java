package comm.example.orderproductservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import comm.example.orderproductservice.entity.ProductEntity;



public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
