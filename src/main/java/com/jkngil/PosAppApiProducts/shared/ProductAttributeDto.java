package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;

public class ProductAttributeDto implements Serializable {

	private static final long serialVersionUID = 98296883409344910L;
	private long id;
	private String attributeType;
	private String attributeValue;

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

}
