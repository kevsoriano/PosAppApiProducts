package com.jkngil.PosAppApiProducts.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//@Entity(name = "brands")
public class BrandEntity implements Serializable {

	private static final long serialVersionUID = -3079617280181906378L;
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 50, nullable = false)
	private String name;
//	@OneToMany(mappedBy="brand", cascade = CascadeType.ALL)
//	private List<ProductEntity> products;

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

}
