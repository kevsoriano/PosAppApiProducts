package com.jkngil.PosAppApiProducts.models;

public class SupplierProductModel {
	private long id;
	private SupplierModel supplier;
	private String supplierCode;
	private String supplierPrice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public SupplierModel getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierModel supplier) {
		this.supplier = supplier;
	}

}
