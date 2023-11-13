package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name = "product_tags")
public class ProductTagEntity implements Serializable {

	private static final long serialVersionUID = 5492470580666795628L;
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 50, nullable = false)
	private String name;
	@ManyToMany(mappedBy="productTags")
	private List<ProductEntity> products;

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

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

}
