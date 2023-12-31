package com.jkngil.PosAppApiProducts.models;

import java.util.List;

public class ProductVariantModel {
	private long id;
	private String name;
	private String SKU;
	private List<ProductAttributeModel> productAttributes;
	private List<OutletProductVariantModel> inventoryDetails;
	private double taxRate;
	private double markup;
	private double retailPrice;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getMarkup() {
		return markup;
	}

	public void setMarkup(double markup) {
		this.markup = markup;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

}
