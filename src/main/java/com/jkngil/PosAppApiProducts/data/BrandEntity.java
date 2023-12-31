package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "brands")
public class BrandEntity implements Serializable {

	private static final long serialVersionUID = -3079617280181906378L;
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@OneToOne(mappedBy = "brand")
	private ProductEntity product;

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

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

}
