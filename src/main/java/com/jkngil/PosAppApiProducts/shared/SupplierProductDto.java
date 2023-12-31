package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class SupplierProductDto implements Serializable {

	private static final long serialVersionUID = -839141628173071201L;
	private long id;
	private SupplierDto supplier;
	private String supplierCode;
	private String supplierPrice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SupplierDto getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierDto supplier) {
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

}
