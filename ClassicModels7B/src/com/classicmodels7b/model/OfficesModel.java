/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.model;

/**
 *
 * @author Luis
 */
public class OfficesModel {
    private String officeCode;
    private String city;
    private String phone;
    private String addressLIne1;
    private String addressLIne2;
    private String state;
    private String country;
    private String postalCode;
    private String territory; 
    
    public OfficesModel(){
        
    }

    public OfficesModel(String officeCode, String city, String phone, String addressLIne1, String addressLIne2, String state, String country, String postalCode, String territory) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.addressLIne1 = addressLIne1;
        this.addressLIne2 = addressLIne2;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.territory = territory;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLIne1() {
        return addressLIne1;
    }

    public void setAddressLIne1(String addressLIne1) {
        this.addressLIne1 = addressLIne1;
    }

    public String getAddressLIne2() {
        return addressLIne2;
    }

    public void setAddressLIne2(String addressLIne2) {
        this.addressLIne2 = addressLIne2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }
    
    
}
