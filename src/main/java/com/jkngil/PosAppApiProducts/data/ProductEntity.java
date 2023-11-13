package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "products")
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = -2676592488870068441L;

	@Id
	@GeneratedValue
	private long id;
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 100, nullable = false)
	private String description;
	@Column
	private int amount;
	@Column
	private double cost;
	@Column
	private double markup;
	@Column
	private double retailPrice;
	@OneToMany
	private List<SupplierEntity> suppliers;
	@OneToMany
	private List<ProductAttributeEntity> productAttributes;
	@OneToMany
	private List<ProductVariantEntity> productVariants;

//	@OneToOne
//	private BrandEntity brand;
//	@OneToOne
//	private ProductTypeEntity productType;
	@ManyToMany
	private List<ProductTagEntity> productTags;
	@ManyToMany
	private List<ProductCategoryEntity> productCategories;

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

	public List<SupplierEntity> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierEntity> suppliers) {
		this.suppliers = suppliers;
	}

	public List<ProductAttributeEntity> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributeEntity> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public List<ProductVariantEntity> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<ProductVariantEntity> productVariants) {
		this.productVariants = productVariants;
	}

	public List<ProductTagEntity> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTagEntity> productTags) {
		this.productTags = productTags;
	}

	public List<ProductCategoryEntity> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<ProductCategoryEntity> productCategories) {
		this.productCategories = productCategories;
	}

}
