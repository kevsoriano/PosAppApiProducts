package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

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
	@ManyToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
	@JoinTable(name = "product_suppliers", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "supplier_id", referencedColumnName = "id"))
	private List<SupplierEntity> suppliers;
	@ManyToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
	@JoinTable(name = "product_producttags", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "product_tag_id", referencedColumnName = "id"))
	private List<ProductTagEntity> productTags;
	@ManyToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
	@JoinTable(name = "product_productcategories", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "product_category_id", referencedColumnName = "id"))
	private List<ProductCategoryEntity> productCategories;
//	@ManyToOne
//	@JoinColumn(name = "brand_id", nullable = false)
//	private BrandEntity brand;

//	@OneToMany
//	private List<ProductAttributeEntity> productAttributes;
//	@OneToMany
//	private List<ProductVariantEntity> productVariants;
//	@OneToOne(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
//	private ProductTypeEntity productType;

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

//	public BrandEntity getBrand() {
//		return brand;
//	}
//
//	public void setBrand(BrandEntity brand) {
//		this.brand = brand;
//	}

}
