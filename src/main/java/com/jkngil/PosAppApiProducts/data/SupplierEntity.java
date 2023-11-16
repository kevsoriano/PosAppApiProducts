package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name = "suppliers")
public class SupplierEntity implements Serializable {

	private static final long serialVersionUID = -1033427356928730164L;
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 50, nullable = false)
	private String name;
	@ManyToMany(mappedBy = "suppliers")
	private List<ProductEntity> productDetails;

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

	public List<ProductEntity> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductEntity> productDetails) {
		this.productDetails = productDetails;
	}

}
