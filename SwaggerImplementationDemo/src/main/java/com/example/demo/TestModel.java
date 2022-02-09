package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Test model for swagger")
public class TestModel {

	@ApiModelProperty(notes = "The database generated product ID")
	private Integer id;

	@ApiModelProperty(notes = "The version of the product")
	private Integer version;

	@ApiModelProperty(notes = "The product ID")
	private String productId;

	@ApiModelProperty(notes = "The product description")
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TestModel [id=" + id + ", version=" + version + ", productId=" + productId + ", description="
				+ description + "]";
	}

}
