package com.jkngil.PosAppApiProducts.services;

import java.util.List;

import com.jkngil.PosAppApiProducts.shared.ProductDto;

public interface ProductService {
	ProductDto createProduct(ProductDto productDetails);
	List<ProductDto> listProducts(int page, int limit);
	ProductDto getProduct(long id);
}
