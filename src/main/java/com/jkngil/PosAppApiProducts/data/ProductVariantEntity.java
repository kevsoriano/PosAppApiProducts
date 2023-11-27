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

@Entity(name="product_variants")
public class ProductVariantEntity implements Serializable {

	private static final long serialVersionUID = 9025621986547075301L;

	@Id
	@GeneratedValue
	private long id;
	@Column
	private String SKU;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "product_variant_attributes", joinColumns = @JoinColumn(name = "variant_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "attribute_id", referencedColumnName = "id"))
	private List<ProductAttributeEntity> productAttributes;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productDetails;

}
