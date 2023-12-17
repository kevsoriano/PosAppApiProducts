package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
	@LazyCollection(LazyCollectionOption.FALSE)
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
