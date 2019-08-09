package comm.example.orderproductservice.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.orderproductservice.entity.ProductResponseEntity;
import comm.example.orderproductservice.model.ProductModel;
import comm.example.orderproductservice.service.ProductService;
import comm.example.orderproductservice.shared.ProductDto;

@RestController
@RequestMapping("/products")
public class Productcontroller {

	@Autowired
	private Environment env;
	
	private ProductService productService;

	@Autowired
	public Productcontroller(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
	public ResponseEntity<ProductResponseEntity> createProduct(@RequestBody ProductModel pModel)
	{
		
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ProductDto pDto =modelMapper.map(pModel,ProductDto.class );
		
		ProductDto pDto1= productService.createProduct(pDto);
		ProductResponseEntity pre= modelMapper.map(pDto1, ProductResponseEntity.class);
		
		return new ResponseEntity<ProductResponseEntity>(pre,HttpStatus.CREATED);
	}
	
	
}
