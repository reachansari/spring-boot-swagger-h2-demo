package com.progressivecoder.demo.springbootstarter.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Model to update mobile")
public class MobileUpdateDTO {

    @NotNull
    @Size(max = 10, message = "Make of Mobile cannot have more than 10 characters")
    @ApiModelProperty(notes = "mobile make", example = "Apple", position = 1)
    private String make;

    @NotNull
    @Size(max = 10, message = "Model of Mobile cannot have more than 10 characters")
    @ApiModelProperty(notes = "mobile model", example = "13", position = 2)
    private String model;

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
        return "MobileUpdateDTO{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
