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
public class Expense {
    private String expenseID;
    private String employeeID;
    private String truckID;
    private String expenseType;
    private String expenseCategoty;
    private String amount;
    private String description;
    private String datePurchased;
    private String dateSubmitted;
    private String advanceAmount;
    private String paymentMethod;
    
    
    @Override
    public String toString() {
        return "Expense{" + "expenseID=" + getExpenseID() + ", employeeID=" + getEmployeeID() + ", truckid=" + getTruckID() + 
                ", expenseType=" + getExpenseType() + ", expenseCategory=" + getExpenseCategoty() + ", amount=" 
                + getAmount() + ", description=" + getDescription() + ", datePurchased=" + getDatePurchased() +  ", dateSubmitted=" 
                + getDateSubmitted() + ", advanceAmount=" + getAdvanceAmount() + ", paymentMethod=" + getPaymentMethod() + '}';
    }

    public Expense(){
        
    }

    /**
     * @return the expenseID
     */
    public String getExpenseID() {
        return expenseID;
    }

    /**
     * @param expenseID the expenseID to set
     */
    public void setExpenseID(String expenseID) {
        this.expenseID = expenseID;
    }

    /**
     * @return the employeeID
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the truckID
     */
    public String getTruckID() {
        return truckID;
    }

    /**
     * @param truckID the truckID to set
     */
    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    /**
     * @return the expenseType
     */
    public String getExpenseType() {
        return expenseType;
    }

    /**
     * @param expenseType the expenseType to set
     */
    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    /**
     * @return the expenseCategoty
     */
    public String getExpenseCategoty() {
        return expenseCategoty;
    }

    /**
     * @param expenseCategoty the expenseCategoty to set
     */
    public void setExpenseCategoty(String expenseCategoty) {
        this.expenseCategoty = expenseCategoty;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the datePurchased
     */
    public String getDatePurchased() {
        return datePurchased;
    }

    /**
     * @param datePurchased the datePurchased to set
     */
    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    /**
     * @return the dateSubmitted
     */
    public String getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * @param dateSubmitted the dateSubmitted to set
     */
    public void setDateSubmitted(String dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    /**
     * @return the advanceAmount
     */
    public String getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * @param advanceAmount the advanceAmount to set
     */
    public void setAdvanceAmount(String advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
