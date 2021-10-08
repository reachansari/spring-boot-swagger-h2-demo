package com.progressivecoder.demo.springbootstarter.dto;

import java.util.UUID;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Model to query mobile")
public class MobileQueryDTO {

	@ApiModelProperty(notes = "mobile id", example = "1758f59-393d-4565-af53-e96144998364", position = 1)
	private UUID id;

	@ApiModelProperty(notes = "mobile IMEI", example = "Reg#4321", position = 2)
	private String mobileIMEI;

	@ApiModelProperty(notes = "mobile make", example = "Apple", position = 3)
	private String make;

	@ApiModelProperty(notes = "mobile model", example = "13", position = 4)
	private String model;

	public MobileQueryDTO(UUID id, String mobileIMEI, String make, String model) {
		this.id = id;
		this.mobileIMEI = mobileIMEI;
		this.make = make;
		this.model = model;
	}

	public UUID getId() {
		return id;
	}

	public String getMobileIMEI() {
		return mobileIMEI;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "MobileQueryDTO{" + "id=" + id + ", mobileIMEI='" + mobileIMEI + '\'' + ", make='" + make + '\''
				+ ", model='" + model + '\'' + '}';
	}
}
