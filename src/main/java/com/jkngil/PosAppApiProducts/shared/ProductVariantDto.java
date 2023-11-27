package com.jkngil.PosAppApiProducts.shared;

import java.io.Serializable;
import java.util.List;

public class ProductVariantDto implements Serializable {

	private static final long serialVersionUID = 3335437015991531897L;
	private long id;
	private String SKU;
	private List<ProductAttributeDto> productAttributes;
	private ProductDto productDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String SKU) {
		this.SKU = SKU;
	}

	public List<ProductAttributeDto> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributeDto> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public ProductDto getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDto productDetails) {
		this.productDetails = productDetails;
	}

}
