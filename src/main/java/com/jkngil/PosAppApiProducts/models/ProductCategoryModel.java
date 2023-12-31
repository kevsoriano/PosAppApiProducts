package com.jkngil.PosAppApiProducts.models;

import java.io.Serializable;

public class ProductCategoryModel implements Serializable {

	private static final long serialVersionUID = -2999108754732274064L;
	private long id;
	private String name;

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
