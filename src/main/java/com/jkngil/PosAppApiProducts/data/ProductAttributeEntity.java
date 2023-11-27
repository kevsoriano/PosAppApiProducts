package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name = "product_attributes")
public class ProductAttributeEntity implements Serializable {

	private static final long serialVersionUID = -4388847511113466931L;

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String attributeType;
	@Column
	private String attributeValue;
	@ManyToMany(mappedBy = "productAttributes")
	private Collection<ProductVariantEntity> productVariants;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public Collection<ProductVariantEntity> getProductVariants() {
		return productVariants;
	}

	public void setProductVariants(Collection<ProductVariantEntity> productVariants) {
		this.productVariants = productVariants;
	}

}
