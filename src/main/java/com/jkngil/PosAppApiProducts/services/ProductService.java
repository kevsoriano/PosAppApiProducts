package com.jkngil.PosAppApiProducts.services;

import java.util.List;

import com.jkngil.PosAppApiProducts.shared.ProductDto;
import com.jkngil.PosAppApiProducts.shared.SaleLineItemDto;

public interface ProductService {
	ProductDto createProduct(ProductDto productDetails);
	List<ProductDto> listProducts(int page, int limit);
	ProductDto getProduct(long id);
	List<ProductDto> updateProductQty(List<SaleLineItemDto> saleDetails);
}
