package com.jkngil.PosAppApiProducts.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkngil.PosAppApiProducts.models.CreateProductRequestModel;
import com.jkngil.PosAppApiProducts.models.ProductResponseModel;
import com.jkngil.PosAppApiProducts.services.ProductService;
import com.jkngil.PosAppApiProducts.shared.ProductDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@PostMapping
	public ResponseEntity<ProductResponseModel> createUser(@Valid @RequestBody CreateProductRequestModel productDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ProductDto productDto = modelMapper.map(productDetails, ProductDto.class);
		ProductDto createdProduct = productService.createProduct(productDto);
		
		ProductResponseModel returnValue = modelMapper.map(createdProduct, ProductResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
}
