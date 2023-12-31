package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class SupplierDto implements Serializable {

	private static final long serialVersionUID = 3520923069073137486L;
	private long id;
	private String supplierName;
	private String description;
	private long defaultMarkup;
	private String firstName;
	private String lastName;
	private String companyName;
	private String email;
	private String mobileNo;

//	private String supplierCode;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getDefaultMarkup() {
		return defaultMarkup;
	}

	public void setDefaultMarkup(long defaultMarkup) {
		this.defaultMarkup = defaultMarkup;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
