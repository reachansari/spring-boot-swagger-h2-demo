package com.example.demo.swagger.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Model to create mobile")
public class MobileCreateDTO {

    @NotNull
    @Size(min = 8, message = "Mobile IMEI should have at least 8 characters")
    @ApiModelProperty(notes="mobile IMEI", example="Reg#4321", position=1)
    private String mobileIMEI;

    @NotNull
    @Size(max = 10, message = "Make of Mobile cannot have more than 10 characters")
    @ApiModelProperty(notes="mobile make", example="Apple", position=2)
    private String make;

    @NotNull
    @Size(max = 10, message = "Model of Mobile cannot have more than 10 characters")
    @ApiModelProperty(notes="mobile model", example="13", position=3)
    private String model;

   

    public String getMobileIMEI() {
		return mobileIMEI;
	}

	public void setMobileIMEI(String mobileIMEI) {
		this.mobileIMEI = mobileIMEI;
	}

	public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "MobileCreateDTO{" +
                "mobileIMEI='" + mobileIMEI + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
