package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class BrandDto implements Serializable {

	private static final long serialVersionUID = -4939713803728797222L;
	private long id;
	private String name;
	private List<ProductDto> productDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductDto> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDto> productDetails) {
		this.productDetails = productDetails;
	}

}
