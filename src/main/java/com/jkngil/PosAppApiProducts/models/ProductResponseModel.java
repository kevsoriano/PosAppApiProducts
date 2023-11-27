package com.jkngil.PosAppApiProducts.models;

import java.util.List;

public class ProductResponseModel {
	private long id;
	private String name;
	private List<ProductVariantModel> productVariants;

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

	public List<ProductVariantModel> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<ProductVariantModel> productVariants) {
		this.productVariants = productVariants;
	}

}
