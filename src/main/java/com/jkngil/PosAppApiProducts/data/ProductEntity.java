package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "products")
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = -2676592488870068441L;

	@Id
	@GeneratedValue
	private long id;
	@Column(length = 50, nullable = false)
	private String name;
	@OneToMany(mappedBy = "productDetails", cascade = CascadeType.ALL)
	private List<ProductVariantEntity> productVariants;

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

	public List<ProductVariantEntity> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(List<ProductVariantEntity> productVariants) {
		this.productVariants = productVariants;
	}

}
