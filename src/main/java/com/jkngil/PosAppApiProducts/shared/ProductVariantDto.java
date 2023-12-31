package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class ProductVariantDto implements Serializable {

	private static final long serialVersionUID = 3335437015991531897L;
	private long id;
	private String name;
	private String SKU;
	private List<ProductAttributeDto> productAttributes;
	private List<OutletProductVariantDto> inventoryDetails;
	private ProductDto productDetails;
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

	public void setSKU(String SKU) {
		this.SKU = SKU;
	}

	public List<ProductAttributeDto> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributeDto> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public ProductDto getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDto productDetails) {
		this.productDetails = productDetails;
	}

	public List<OutletProductVariantDto> getInventoryDetails() {
		return inventoryDetails;
	}

	public void setInventoryDetails(List<OutletProductVariantDto> inventoryDetails) {
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
