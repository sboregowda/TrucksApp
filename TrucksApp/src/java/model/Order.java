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
public class Order {

    /**
     * @param orderID the orderID to set
     */
   

    /**
     * @param orderTotalAmount the orderTotalAmount to set
     */
    public void setOrderTotalAmount(String orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }
    private String orderID; 
    private String orderDate;
    private String customerID;
    private String employeeID;
    private String truckID;
    private String isSpecial;
    private String PONumber;
    private String orderTotalAmount;

    public String getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getTruckID() {
        return truckID;
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public String getPON() {
        return PONumber;
    }

    public String getOrderTotalAmount() {
        return orderTotalAmount;
    }
    
 public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @param truckID the truckID to set
     */
    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    /**
     * @param isSpecial the isSpecial to set
     */
    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }

    /**
     * @param PONumber the PONumber to set
     */
    public void setPONumber(String PONumber) {
        this.PONumber = PONumber;
    }
    
    public Order(){
        
    }

    @Override
    public String toString() {
        return "Order{" + "orderDate=" + orderDate + ", customerID=" + customerID + ", employeeID=" + employeeID + ", truckID=" + truckID + ", isSpecial=" + isSpecial + ", PON=" + PONumber + ", orderTotalAmount=" + orderTotalAmount + '}';
    }
    
    
    
    
}
