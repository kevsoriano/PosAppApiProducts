package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class SupplierDto implements Serializable {

	private static final long serialVersionUID = 3520923069073137486L;
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
