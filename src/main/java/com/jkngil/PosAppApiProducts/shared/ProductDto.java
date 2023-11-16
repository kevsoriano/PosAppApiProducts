package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable {
	private static final long serialVersionUID = 4075764856666367148L;
	private long id;
	private String name;
	private String description;
	private int amount;
	private double cost;
	private double markup;
	private double retailPrice;
	private List<SupplierDto> suppliers;
	private List<ProductTagDto> productTags;
	private List<ProductCategoryDto> productCategories;
//	private BrandDto brand;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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

	public List<ProductTagDto> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTagDto> productTags) {
		this.productTags = productTags;
	}

	public List<ProductCategoryDto> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<ProductCategoryDto> productCategories) {
		this.productCategories = productCategories;
	}

//	public BrandDto getBrand() {
//		return brand;
//	}
//
//	public void setBrand(BrandDto brand) {
//		this.brand = brand;
//	}

	public List<SupplierDto> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierDto> suppliers) {
		this.suppliers = suppliers;
	}

}
