package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "productTags")
public class ProductTagEntity implements Serializable {

	private static final long serialVersionUID = 220011173264345343L;
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productDetails;

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

	public ProductEntity getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductEntity productDetails) {
		this.productDetails = productDetails;
	}

}
