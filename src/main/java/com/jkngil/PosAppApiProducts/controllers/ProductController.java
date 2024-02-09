package com.jkngil.PosAppApiProducts.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jkngil.PosAppApiProducts.models.CreateProductRequestModel;
import com.jkngil.PosAppApiProducts.models.ProductResponseModel;
import com.jkngil.PosAppApiProducts.models.SaleLineItemModel;
import com.jkngil.PosAppApiProducts.services.ProductService;
import com.jkngil.PosAppApiProducts.shared.ProductDto;
import com.jkngil.PosAppApiProducts.shared.SaleLineItemDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping
	public ResponseEntity<ProductResponseModel> createProduct(
			@Valid @RequestBody CreateProductRequestModel productDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		ProductDto productDto = modelMapper.map(productDetails, ProductDto.class);
		ProductDto createdProduct = productService.createProduct(productDto);

		ProductResponseModel returnValue = modelMapper.map(createdProduct, ProductResponseModel.class);

		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}

	@GetMapping
	public ResponseEntity<List<ProductResponseModel>> listProducts(
			@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		List<ProductResponseModel> returnValue = new ArrayList<>();
		List<ProductDto> products = productService.listProducts(page, limit);

		for (ProductDto product : products) {
			ModelMapper modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

			ProductResponseModel productDetails = modelMapper.map(product, ProductResponseModel.class);
			returnValue.add(productDetails);
		}

		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductResponseModel> getProduct(@PathVariable long id) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		ProductDto productDto = productService.getProduct(id);
		ProductResponseModel returnValue = modelMapper.map(productDto, ProductResponseModel.class);

		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	}

	@PutMapping
	public ResponseEntity<ProductResponseModel> updateProductQty(@RequestBody List<SaleLineItemModel> saleDetails) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		SaleLineItemDto lineItemDto = modelMapper.map(saleDetails, SaleLineItemDto.class);
//		productService.updateProductQty(lineItemDto);

		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
}
