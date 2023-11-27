package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable {
	private static final long serialVersionUID = 4075764856666367148L;
	private long id;
	private String name;
	private List<ProductVariantDto> productVariants;

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

	public List<ProductVariantDto> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<ProductVariantDto> productVariants) {
		this.productVariants = productVariants;
	}
}
