/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import database.Main;
import database.Main1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;
import model.Location;

/**
 *
 * @author Mazen
 */
public class LocationList {
    Main1 main = new Main1();
    
    public ArrayList<Location> getLocations(String locationCode) throws Exception {
        
        Connection con = main.getConnection();
        PreparedStatement selesctCustomers = con.prepareStatement("select locationID, customerID, locationCode, city, state from "
                + "locations where locationCode = '" + locationCode + "'");
        
        ResultSet rs = selesctCustomers.executeQuery();
        ArrayList<Location> locations = new ArrayList<>();
        
        while (rs.next()) {
            Location loc = new Location();
            loc.setCustomerID(rs.getString("customerID"));
            loc.setLocationID(rs.getString("locationID"));
            loc.setLocationCode(rs.getString("locationCode"));
            loc.setCity(rs.getString("city"));
            loc.setState(rs.getString("state"));

            locations.add(loc);
        }

        return locations;
    }

        
    }

