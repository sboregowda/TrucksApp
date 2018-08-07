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

/**
 *
 * @author Mazen
 */
public class CustomerList {

    Main1 main = new Main1();

    public ArrayList<Customer> getCustomers(String city) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selesctCustomers = con.prepareStatement("select customerID, companyName, contactName, emailAddress from "
                + "customers where city = '" + city + "'");

        ResultSet rs = selesctCustomers.executeQuery();
        ArrayList<Customer> customers = new ArrayList<>();

        while (rs.next()) {
            Customer cus = new Customer();
            cus.setCustomerID(rs.getString("customerID"));

            cus.setEmailAddress(rs.getString("emailAddress"));

            cus.setCompanyName(rs.getString("companyName"));
            cus.setContactName(rs.getString("contactName"));


            customers.add(cus);
        }

        return customers;
    }

}
