package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	@Column
	private String description;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id", referencedColumnName = "id")
	private BrandEntity brand;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_category_id", referencedColumnName = "id")
	private ProductCategory productCategory;
	@OneToMany(mappedBy = "productDetails", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<SupplierProductEntity> suppliers;
	@OneToMany(mappedBy = "productDetails", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ProductTagEntity> productTags;
	@OneToMany(mappedBy = "productDetails", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ProductVariantEntity> productVariants;
	@CreationTimestamp
	private Instant createdOn;
	@UpdateTimestamp
	private Instant lastUpdatedOn;

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

	public List<ProductVariantEntity> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<ProductVariantEntity> productVariants) {
		this.productVariants = productVariants;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Instant getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Instant lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ProductTagEntity> getProductTags() {
		return productTags;
	}

	public void setProductTags(List<ProductTagEntity> productTags) {
		this.productTags = productTags;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public List<SupplierProductEntity> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierProductEntity> suppliers) {
		this.suppliers = suppliers;
	}

}
