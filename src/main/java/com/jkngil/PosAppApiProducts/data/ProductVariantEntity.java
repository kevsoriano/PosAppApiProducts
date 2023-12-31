package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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

@Entity(name = "product_variants")
public class ProductVariantEntity implements Serializable {

	private static final long serialVersionUID = 9025621986547075301L;

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@Column
	private String SKU;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "product_variant_attributes", joinColumns = @JoinColumn(name = "variant_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "attribute_id", referencedColumnName = "id"))
	private List<ProductAttributeEntity> productAttributes;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productDetails;
	@OneToMany(mappedBy = "productVariantDetails", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<OutletProductVariantEntity> inventoryDetails;
//	private double supplyPrice; // TODO: determine where to put supply price
	@Column
	private double taxRate;
	@Column
	private double markup;
	@Column
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

	public List<ProductAttributeEntity> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributeEntity> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public ProductEntity getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductEntity productDetails) {
		this.productDetails = productDetails;
	}

	public List<OutletProductVariantEntity> getInventoryDetails() {
		return inventoryDetails;
	}

	public void setInventoryDetails(List<OutletProductVariantEntity> inventoryDetails) {
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
