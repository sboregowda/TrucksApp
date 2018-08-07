/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mazen
 */
public class Customer {
    private String customerID;
    private String state;
    private String customerName;
    private String businessName;
    private String billingAddress;
    private String city;
    private String postalCode;
    private String country;
    private String otherNumber;
    private String phoneNumber;
    private String faxNumber;
    private String emailAddress;
    private String customerType;

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", state=" + state + 
                ", customerName=" + customerName + ", businessName=" + businessName + ", billingAddress=" +
                billingAddress + ", city=" + city + ", postalCode=" + postalCode + ", country=" + country + ", otherNumber=" + 
                otherNumber + ", phoneNumber=" + phoneNumber + ", faxNumber=" + faxNumber + ", emailAddress=" + emailAddress + ", customerType=" +
                customerType + ", CompanyName=" + CompanyName + ", contactName=" + contactName + ", date=" + date + '}';
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    private String CompanyName;
    private String contactName;
    private String date;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBusinessName() {
        return businessName;
    }

     public String getOtherNumber() {
        return otherNumber;
    }

    public void setOtherNumber(String otherNumber) {
        this.otherNumber = otherNumber;
    }
    
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public Customer(){
        
    }
    
//    @Override
//    public String toString() {
//        return "Customer{" + "customerID=" + customerID + ", city=" + city + ", emailAddress=" + emailAddress 
//                + ", CompanyName=" + CompanyName + ", contactName=" + contactName + '}';
//    }
    
    
}
