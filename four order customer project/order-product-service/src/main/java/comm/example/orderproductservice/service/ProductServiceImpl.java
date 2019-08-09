package comm.example.orderproductservice.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.orderproductservice.data.ProductRepository;
import comm.example.orderproductservice.entity.ProductEntity;
import comm.example.orderproductservice.shared.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	
	
  private ProductRepository  productRepository;
	
  @Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
	super();
	this.productRepository = productRepository;
}

  
  
	@Override
	public ProductDto createProduct(ProductDto pDto) {
		// TODO Auto-generated method stub
		

		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ProductEntity pEntity = modelMapper.map(pDto, ProductEntity.class);
		productRepository.save(pEntity);
		
	  ProductDto pDto1 =modelMapper.map(pEntity, ProductDto.class);
		return pDto1;
	}

}
