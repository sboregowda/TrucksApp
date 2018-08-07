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
public class Price {
    private String priceID;
    //F key 
    private String locationID;
    private String locationIDFrom;
    private String locationIDTo;
    private String price;
    private String locationCodeFrom;
    private String locationCodeTo;
    //F key
    private String customerID;
    
    public String toString() {
        return "Price{" + "priceID=" + getPriceID() + ", locationID=" + getLocationID() + ", LocatinIDFrom=" + getLocationIDFrom() + 
                ", LocationIDTo=" + getLocationIDTo() + ", price=" + getPrice() + ", locationCodeFrom=" 
                + getLocationCodeFrom() + ", locationCodeTo=" + getLocationCodeTo() + ", CustomerID=" + getCustomerID() + '}';
    }

    public Price(){
        
    }

    /**
     * @return the priceID
     */
    public String getPriceID() {
        return priceID;
    }

    /**
     * @param priceID the priceID to set
     */
    public void setPriceID(String priceID) {
        this.priceID = priceID;
    }

    /**
     * @return the locationID
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * @param locationID the locationID to set
     */
    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    /**
     * @return the locationIDFrom
     */
    public String getLocationIDFrom() {
        return locationIDFrom;
    }

    /**
     * @param locationIDFrom the locationIDFrom to set
     */
    public void setLocationIDFrom(String locationIDFrom) {
        this.locationIDFrom = locationIDFrom;
    }

    /**
     * @return the locationIDTo
     */
    public String getLocationIDTo() {
        return locationIDTo;
    }

    /**
     * @param locationIDTo the locationIDTo to set
     */
    public void setLocationIDTo(String locationIDTo) {
        this.locationIDTo = locationIDTo;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the locationCodeFrom
     */
    public String getLocationCodeFrom() {
        return locationCodeFrom;
    }

    /**
     * @param locationCodeFrom the locationCodeFrom to set
     */
    public void setLocationCodeFrom(String locationCodeFrom) {
        this.locationCodeFrom = locationCodeFrom;
    }

    /**
     * @return the locationCodeTo
     */
    public String getLocationCodeTo() {
        return locationCodeTo;
    }

    /**
     * @param locationCodeTo the locationCodeTo to set
     */
    public void setLocationCodeTo(String locationCodeTo) {
        this.locationCodeTo = locationCodeTo;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
