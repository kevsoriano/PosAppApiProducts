package com.jkngil.PosAppApiProducts.models;

import java.util.List;

public class CreateProductRequestModel {
	private String name;
	private List<ProductVariantModel> productVariants;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductVariantModel> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<ProductVariantModel> productVariants) {
		this.productVariants = productVariants;
	}

}
