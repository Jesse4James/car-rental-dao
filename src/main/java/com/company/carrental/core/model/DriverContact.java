package com.company.carrental.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Contact")
public class DriverContact {

	private Integer driverContactId;
	
	private String contactType;
	
	private Integer contactNumber;
	
	private Boolean isPrimary;

	private DriverMaster driverMaster;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Driver_Contact_Id")
	public Integer getDriverContactId() {
		return driverContactId;
	}

	public void setDriverContactId(Integer driverContactId) {
		this.driverContactId = driverContactId;
	}

	@Column(name = "Contact_Type")
	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	@Column(name = "Contact_Number")
	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "Is_Primary")
	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	@ManyToOne
	@JoinColumn(name = "Driver_Id")
	public DriverMaster getDriverMaster() {
		return driverMaster;
	}

	public void setDriverMaster(DriverMaster driverMaster) {
		this.driverMaster = driverMaster;
	}

}
