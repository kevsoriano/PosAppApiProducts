package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class OutletProductVariantDto implements Serializable {
	private static final long serialVersionUID = 1810822905166217616L;
	private long id;
	private String outletName;
	private int amount;
	private int reorderPoint;
	private int reorderQty;
	private ProductVariantDto productVariantDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public ProductVariantDto getProductVariantDetails() {
		return productVariantDetails;
	}

	public void setProductVariantDetails(ProductVariantDto productVariantDetails) {
		this.productVariantDetails = productVariantDetails;
	}

}
