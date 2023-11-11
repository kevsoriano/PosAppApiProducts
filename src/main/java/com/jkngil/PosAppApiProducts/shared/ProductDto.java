package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

import com.jkngil.PosAppApiProducts.data.BrandEntity;
import com.jkngil.PosAppApiProducts.data.ProductAttributeEntity;
import com.jkngil.PosAppApiProducts.data.ProductCategoryEntity;
import com.jkngil.PosAppApiProducts.data.ProductTagEntity;
import com.jkngil.PosAppApiProducts.data.ProductTypeEntity;
import com.jkngil.PosAppApiProducts.data.ProductVariantEntity;
import com.jkngil.PosAppApiProducts.data.SupplierEntity;

public class ProductDto implements Serializable {
	private static final long serialVersionUID = 4075764856666367148L;
	private long id;
	private String name;
	private String description;
	private int amount;
	private double cost;
	private double markup;
	private double retailPrice;
	private BrandEntity brand;
	private List<SupplierEntity> supplier;
	private ProductTypeEntity productType;
	private List<ProductTagEntity> productTag;
	private List<ProductCategoryEntity> productCategory;
	private List<ProductAttributeEntity> productAttribute;
	private List<ProductVariantEntity> productVariant;

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

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

	public List<SupplierEntity> getSupplier() {
		return supplier;
	}

	public void setSupplier(List<SupplierEntity> supplier) {
		this.supplier = supplier;
	}

	public ProductTypeEntity getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeEntity productType) {
		this.productType = productType;
	}

	public List<ProductTagEntity> getProductTag() {
		return productTag;
	}

	public void setProductTag(List<ProductTagEntity> productTag) {
		this.productTag = productTag;
	}

	public List<ProductCategoryEntity> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<ProductCategoryEntity> productCategory) {
		this.productCategory = productCategory;
	}

	public List<ProductAttributeEntity> getProductAttribute() {
		return productAttribute;
	}

	public void setProductAttribute(List<ProductAttributeEntity> productAttribute) {
		this.productAttribute = productAttribute;
	}

	public List<ProductVariantEntity> getProductVariant() {
		return productVariant;
	}

	public void setProductVariant(List<ProductVariantEntity> productVariant) {
		this.productVariant = productVariant;
	}

}
