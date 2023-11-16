package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class ProductCategoryDto implements Serializable {

	private static final long serialVersionUID = 2989232535715737298L;
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
