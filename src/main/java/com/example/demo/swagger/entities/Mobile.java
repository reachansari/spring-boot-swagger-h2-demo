package com.example.demo.swagger.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "mobile")
public class Mobile {

    @Id
    private UUID id;

    private String mobileIMEI;

    private String make;

    private String model;

    private String status;

    public Mobile() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getMobileIMEI() {
		return mobileIMEI;
	}

	public void setMobileIMEI(String mobileIMEI) {
		this.mobileIMEI = mobileIMEI;
	}

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", mobileIMEI='" + mobileIMEI + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

	
}
