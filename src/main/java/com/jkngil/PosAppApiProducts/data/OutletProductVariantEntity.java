package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "outlet_product_variants")
public class OutletProductVariantEntity implements Serializable {

	private static final long serialVersionUID = -8499158843890952577L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "product_variant_id")
	private ProductVariantEntity productVariantDetails;
	@Column
	private String outletName;
	@Column
	private int amount;
	@Column
	private int reorderPoint;
	@Column
	private int reorderQty;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ProductVariantEntity getProductVariantDetails() {
		return productVariantDetails;
	}

	public void setProductVariantDetails(ProductVariantEntity productVariantDetails) {
		this.productVariantDetails = productVariantDetails;
	}

	public String getOutletName() {
		return outletName;
	}

	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getReorderPoint() {
		return reorderPoint;
	}

	public void setReorderPoint(int reorderPoint) {
		this.reorderPoint = reorderPoint;
	}

	public int getReorderQty() {
		return reorderQty;
	}

	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}

}
