package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "products")
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = -2676592488870068441L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 100, nullable = false)
	private String description;
	@Column
	private int amount;
	@Column
	private double cost;
	@Column
	private double markup;
	@Column
	private double retailPrice;
	@OneToOne
	private BrandEntity brand;
	@OneToMany
	private List<SupplierEntity> supplier;
	@OneToOne
	private ProductTypeEntity productType;
	@ManyToMany
	private List<ProductTagEntity> productTag;
	@ManyToMany
	private List<ProductCategoryEntity> productCategory;
	@OneToMany
	private List<ProductAttributeEntity> productAttribute;
	@OneToMany
	private List<ProductVariantEntity> productVariant;
}
