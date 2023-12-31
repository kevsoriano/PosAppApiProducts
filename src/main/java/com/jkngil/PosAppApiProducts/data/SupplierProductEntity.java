package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name = "supplier_products")
public class SupplierProductEntity implements Serializable {

	private static final long serialVersionUID = -6652609286785624799L;
	@Id
	@GeneratedValue
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "supplier_id", referencedColumnName = "id")
	private SupplierEntity supplier;
	@Column
	private String supplierCode;
	@Column
	private String supplierPrice;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private List<ProductEntity> productDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SupplierEntity getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierEntity supplier) {
		this.supplier = supplier;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierPrice() {
		return supplierPrice;
	}

	public void setSupplierPrice(String supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

	public List<ProductEntity> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductEntity> productDetails) {
		this.productDetails = productDetails;
	}

}
