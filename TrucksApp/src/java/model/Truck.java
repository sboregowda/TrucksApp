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
public class Truck {
    private String truckID;
    private String VIN;
    private String makeYear;
    private String model;
    private String licensePlateNumber;
    //F key
    private String employeeID;
    private String color;
    private String cost;
    
    
    @Override
    public String toString() {
        return "Truck{" + "truckID=" + getTruckID() + ", VIN=" + getVIN() + ", makeYear=" + getMakeYear() + 
                ", model=" + getModel() + ", licensePlateNumber=" + getLicensePlateNumber() + ", employeeID=" 
                + getEmployeeID() + ", color=" + getColor() + ", cost=" + getCost()  + '}';
    }

    public Truck(){
        
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
     * @return the VIN
     */
    public String getVIN() {
        return VIN;
    }

    /**
     * @param VIN the VIN to set
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * @return the makeYear
     */
    public String getMakeYear() {
        return makeYear;
    }

    /**
     * @param makeYear the makeYear to set
     */
    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the licensePlateNo
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * @param licensePlateNumber
     */
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }
}
