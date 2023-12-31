package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class BrandDto implements Serializable {

	private static final long serialVersionUID = -4939713803728797222L;
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
