package com.jkngil.PosAppApiProducts.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jkngil.PosAppApiProducts.data.ProductEntity;
import com.jkngil.PosAppApiProducts.data.ProductRepository;
import com.jkngil.PosAppApiProducts.shared.OutletProductVariantDto;
import com.jkngil.PosAppApiProducts.shared.ProductDto;
import com.jkngil.PosAppApiProducts.shared.ProductVariantDto;

@Service
public class ProductServiceImpl implements ProductService {
	ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(
			ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductDto createProduct(ProductDto productDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=0; i<productDetails.getProductVariants().size();i++) {
			ProductVariantDto productVariant = productDetails.getProductVariants().get(i);
			productVariant.setProductDetails(productDetails);
			
			for(int j=0;j<productVariant.getInventoryDetails().size();j++) {
				OutletProductVariantDto inventoryDetails = productVariant.getInventoryDetails().get(j);
				inventoryDetails.setProductVariantDetails(productVariant);
				productVariant.getInventoryDetails().set(i, inventoryDetails);
			}
			productDetails.getProductVariants().set(i,productVariant);
		}
		
		ProductEntity productEntity = modelMapper.map(productDetails, ProductEntity.class);
		ProductEntity createdProduct = productRepository.save(productEntity);
		
		ProductDto returnValue = modelMapper.map(createdProduct, ProductDto.class);
		return returnValue;
	}

	@Override
	public List<ProductDto> listProducts(int page, int limit) {
		List<ProductDto> returnValue = new ArrayList<>();
		Pageable pageRequest = PageRequest.of(page, limit);
		Page<ProductEntity> productPage = productRepository.findAll(pageRequest);
		List<ProductEntity> products = productPage.getContent();
		
		for(ProductEntity product: products) {
			ModelMapper modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			
			ProductDto productDto = modelMapper.map(product, ProductDto.class);
			returnValue.add(productDto);
		}
		return returnValue;
	}

	@Override
	public ProductDto getProduct(long id) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ProductDto returnValue = new ProductDto();
		Optional<ProductEntity> product = productRepository.findById(id);
//		productEntity.isPresent(value -> doSomething(value));
		returnValue = modelMapper.map(product.get(), ProductDto.class);
		
		return returnValue;
	}

}
