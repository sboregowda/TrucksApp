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
public class Transaction {
    private String transactionID;
    //F key
    private String orderID;
    //F key
    private String priceID;
    private String transactionDate;
    private String transactionAmount;
    private String transactionDescription;
    //F Key
    //private String VIN;
    //F key
    private String truckID;
    //F key
    private String employeeID;
    private String discount;
    private String quantity;
    private String unitPrice;

    @Override
    public String toString() {
        return "Transaction{" + "transactionID=" + transactionID + ", orderID=" + orderID + ", priceID=" + priceID + 
                ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + ", transactionDescription=" 
                + transactionDescription + ", truckID=" + truckID + ", employeeID=" + employeeID + ", discount=" 
                + discount + ", quantity=" + quantity + ", unitPrice=" + unitPrice + '}';
    }

    

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
    
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPriceID() {
        return priceID;
    }

    public void setPriceID(String priceID) {
        this.priceID = priceID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

   

    public String getTruckID() {
        return truckID;
    }

    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public Transaction(){
        
    }
    
}
