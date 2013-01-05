package com.company.carrental.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UsersCodes")
public class UsersCodes {
    
    private User user;
    private Codifiers Codifier;
    @Id private String Code;
    
    @OneToOne(mappedBy = "User", cascade=CascadeType.ALL)
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    
    @Column(name= "Code",nullable=false)
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }


    @OneToOne(mappedBy = "Codifiers", cascade=CascadeType.ALL)
    public Codifiers getCodifier() {
        return Codifier;
    }

    public void setCodifier(Codifiers codifier) {
        Codifier = codifier;
    }
    
    

}
