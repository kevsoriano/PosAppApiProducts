package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "suppliers")
public class SupplierEntity implements Serializable {

	private static final long serialVersionUID = -1033427356928730164L;
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String supplierName;
	@Column
	private String description;
	@Column
	private long defaultMarkup;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String companyName;
	@Column
	private String email;
	@Column
	private String mobileNo;
//	private List<AddressEntity> addresses;
//	@Column
//	private String supplierCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public String getSupplierCode() {
//		return supplierCode;
//	}
//
//	public void setSupplierCode(String supplierCode) {
//		this.supplierCode = supplierCode;
//	}

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
