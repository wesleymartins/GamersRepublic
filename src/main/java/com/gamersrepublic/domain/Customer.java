/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamersrepublic.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wesley
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String custId;
    private String fName;
    private String lName;
    private String contact;
    private String address;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCustId() {
        return custId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }   
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     private Customer(Builder build) {
        id = build.id;
        custId = build.custId;
        fName = build.fName;
        lName = build.lName;
        contact = build.contact;       
        address = build.address;
       
    }
     
     public static class Builder{
        
        private Long id;
        private String custId;
        private String fName;
        private String lName;
        private String contact;
        private String address;
        
         public Builder(String custId){
            this.custId = custId;
        }
         public Builder id(Long n){            
            id = n ;
            return this;
        }
        
        public Builder fName(String n){            
            fName = n ;
            return this;
        }
        
        public Builder lName(String l){            
            lName = l ;
            return this;
        }
        
         public Builder contact(String c){            
            contact = c ;
            return this;
        }        
        
        public Builder address(String add){
            address = add;
            return this;
        }
        
        public Customer build(){
            return new Customer(this);
        }
        
     }   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gamersrepublic.domain.Customer[ id=" + id + " ]";
    }
    
}
