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
public class Location {
    private String locationID;
    private String locationName;
    private String locationCode;
    private String isAuction;
    //F key
    private String customerID;
    private String addressStreet1;
    private String addressStreet2;
    private String city;
    private String state;
    private String postalcode;
    private String locationContactName;
    private String locationPhone;
    private String locationFaxNumber;
    private String locationEmail;

    @Override
    public String toString() {
        return "Location{" + "locationID=" + locationID + ", locationName=" + locationName + ", locationCode=" + locationCode 
                + ", isAuction=" + isAuction + ", customerID=" + customerID + ", addressStreet1=" + addressStreet1 + ", addressStreet2=" 
                + addressStreet2 + ", city=" + city + ", state=" + state + ", postalcode=" + postalcode + ", locationContactName=" + locationContactName 
                + ", locationPhone=" + locationPhone + ", locationFaxNumber=" + locationFaxNumber + ", locationEmail=" + locationEmail + '}';
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getIsAuction() {
        return isAuction;
    }

    public void setIsAuction(String isAuction) {
        this.isAuction = isAuction;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddressStreet1() {
        return addressStreet1;
    }

    public void setAddressStreet1(String addressStreet1) {
        this.addressStreet1 = addressStreet1;
    }

    public String getAddressStreet2() {
        return addressStreet2;
    }

    public void setAddressStreet2(String addressStreet2) {
        this.addressStreet2 = addressStreet2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getLocationContactName() {
        return locationContactName;
    }

    public void setLocationContactName(String locationContactName) {
        this.locationContactName = locationContactName;
    }

    public String getLocationPhone() {
        return locationPhone;
    }

    public void setLocationPhone(String locationPhone) {
        this.locationPhone = locationPhone;
    }

    public String getLocationFaxNumber() {
        return locationFaxNumber;
    }

    public void setLocationFaxNumber(String locationFaxNumber) {
        this.locationFaxNumber = locationFaxNumber;
    }

    public String getLocationEmail() {
        return locationEmail;
    }

    public void setLocationEmail(String locationEmail) {
        this.locationEmail = locationEmail;
    }
    
    public Location(){
        
    }
}
