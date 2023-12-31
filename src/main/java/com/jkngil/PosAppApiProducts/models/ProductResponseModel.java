package com.jkngil.PosAppApiProducts.models;

import java.util.List;

public class ProductResponseModel {
	private long id;
	private String name;
	private String description;
	private List<ProductVariantModel> productVariants;
	private BrandModel brand;
	private List<SupplierProductModel> suppliers;
	private List<ProductTagModel> productTags;
	private ProductCategoryModel productCategory;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BrandModel getBrand() {
		return brand;
	}

	public void setBrand(BrandModel brand) {
		this.brand = brand;
	}

	public List<ProductTagModel> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTagModel> productTags) {
		this.productTags = productTags;
	}

	public ProductCategoryModel getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategoryModel productCategory) {
		this.productCategory = productCategory;
	}

	public List<SupplierProductModel> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierProductModel> suppliers) {
		this.suppliers = suppliers;
	}

}
