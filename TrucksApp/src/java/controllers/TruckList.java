/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import database.Main1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Truck;

/**
 *
 * @author
 */
public class TruckList {

    Main1 main = new Main1();

    public ArrayList<Truck> getTrucks(String employeeID) throws Exception {

        Connection con = Main1.getConnection();
        PreparedStatement selecttrucks = con.prepareStatement("select truckID, employeeID, makeYear, model from "
                + "trucks where employeeID = '" + employeeID + "'");

        ResultSet rs = selecttrucks.executeQuery();
        ArrayList<Truck> trucks = new ArrayList<>();

        while (rs.next()) {
            Truck cus = new Truck();
            cus.setTruckID(rs.getString("truckID"));
//        cus.setCustomerName(rs.getString("customerName"));
//        cus.setState(rs.getString("state"));
//        cus.setBusinessName(rs.getString("businessName"));
//        cus.setBillingAddress(rs.getString("billingAddress"));
//        cus.setCity(rs.getString("city"));
//        cus.setPostalCode(rs.getString("postalCode"));
//        cus.setCountry(rs.getString("country"));
//        cus.setOtherNumber(rs.getString("otherNumber"));
//        cus.setFaxNumber(rs.getString("faxNumber"));
cus.setTruckID(rs.getString("employeeID"));
//            cus.setVIN(rs.getString("VIN"));
//        cus.setCustomerType(rs.getString("customerType"));
            cus.setMakeYear(rs.getString("makeYear"));
            cus.setModel(rs.getString("model"));
//        cus.setDate(rs.getString("date"));

            trucks.add(cus);
        }

        return trucks;
    }

}
