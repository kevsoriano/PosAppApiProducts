package com.jkngil.PosAppApiProducts.models;

import java.util.List;

public class ProductResponseModel {
	private long id;
	private String name;
	private String description;
	private int amount;
	private double cost;
	private double markup;
	private double retailPrice;
	private List<ProductTagDetailsModel> productTags;
	private List<ProductCategoryDetailsModel> productCategories;
	private List<SupplierDetailsModel> suppliers;
//	private BrandDetailsModel brand;

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

	public List<ProductTagDetailsModel> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTagDetailsModel> productTags) {
		this.productTags = productTags;
	}

	public List<ProductCategoryDetailsModel> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<ProductCategoryDetailsModel> productCategories) {
		this.productCategories = productCategories;
	}

	public List<SupplierDetailsModel> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierDetailsModel> suppliers) {
		this.suppliers = suppliers;
	}

//	public BrandDetailsModel getBrand() {
//		return brand;
//	}
//
//	public void setBrand(BrandDetailsModel brand) {
//		this.brand = brand;
//	}

}
