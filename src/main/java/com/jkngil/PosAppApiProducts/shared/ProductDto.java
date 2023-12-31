package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable {
	private static final long serialVersionUID = 4075764856666367148L;
	private long id;
	private String name;
	private String description;
	private BrandDto brand;
	private List<SupplierProductDto> suppliers;
	private List<ProductTagDto> productTags;
	private ProductCategoryDto productCategory;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BrandDto getBrand() {
		return brand;
	}

	public void setBrand(BrandDto brand) {
		this.brand = brand;
	}

	public List<ProductTagDto> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTagDto> productTags) {
		this.productTags = productTags;
	}

	public ProductCategoryDto getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategoryDto productCategory) {
		this.productCategory = productCategory;
	}

	public List<SupplierProductDto> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierProductDto> suppliers) {
		this.suppliers = suppliers;
	}

}
