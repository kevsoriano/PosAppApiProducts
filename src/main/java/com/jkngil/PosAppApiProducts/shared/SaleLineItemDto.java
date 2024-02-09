package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class SaleLineItemDto implements Serializable {

	private static final long serialVersionUID = 3763081257134428083L;
	private String productName;
	private String outletName;
	private int amount;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getOutletName() {
		return outletName;
	}

	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}

}
