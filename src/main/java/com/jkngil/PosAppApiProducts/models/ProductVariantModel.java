package com.jkngil.PosAppApiProducts.models;

import java.util.List;

public class ProductVariantModel {
	private long id;
	private String SKU;
	private List<ProductAttributeModel> productAttributes;
	private List<OutletProductVariantModel> inventoryDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public List<ProductAttributeModel> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributeModel> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public List<OutletProductVariantModel> getInventoryDetails() {
		return inventoryDetails;
	}

	public void setInventoryDetails(List<OutletProductVariantModel> inventoryDetails) {
		this.inventoryDetails = inventoryDetails;
	}

}
