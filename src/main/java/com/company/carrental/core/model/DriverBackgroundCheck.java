package com.company.carrental.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Driver_BackGround_Check")
public class DriverBackgroundCheck {
    
    private Integer BCId;
    private Date BCDate;
    private String identificationCode;
    private String maritalStatus;
    private String trafficViolationFlag;
    private String employmentGapFlag;
    private String financialRegChkFlag;
    
    @ManyToOne
    DriverMaster driverMaster;
    
    @ManyToOne
    @JoinColumn(name="FK_Driver_Id")
    public DriverMaster getDriverMaster() {
            return driverMaster;
    }
    public void setDriverMaster(DriverMaster driverMaster) {
            this.driverMaster = driverMaster;
    }

    
    @Id
    @Column(name = "BC_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getBCId() {
        return BCId;
    }
    public void setBCId(Integer bCId) {
        BCId = bCId;
    }
    
    @Column(name= "BC_Date",nullable=false)
    public Date getBCDate() {
        return BCDate;
    }
    public void setBCDate(Date bCDate) {
        BCDate = bCDate;
    }
    
    @Column(name= "Identification_Code",nullable=false)
    public String getIdentificationCode() {
        return identificationCode;
    }
    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }
    
    @Column(name= "Marital_Status",nullable=false)
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    @Column(name= "Traffic_Violation_Flag",nullable=false)
    public String getTrafficViolationFlag() {
        return trafficViolationFlag;
    }
    public void setTrafficViolationFlag(String trafficViolationFlag) {
        this.trafficViolationFlag = trafficViolationFlag;
    }
    
    @Column(name= "Employment_Gap_Flag",nullable=false)
    public String getEmploymentGapFlag() {
        return employmentGapFlag;
    }
    public void setEmploymentGapFlag(String employmentGapFlag) {
        this.employmentGapFlag = employmentGapFlag;
    }
    
    @Column(name= "Financial_Reg_Chk_Flag",nullable=false)
    public String getFinancialRegChkFlag() {
        return financialRegChkFlag;
    }
    public void setFinancialRegChkFlag(String financialRegChkFlag) {
        this.financialRegChkFlag = financialRegChkFlag;
    }
    
    
    

}
