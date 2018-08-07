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
import model.Order;

/**
 *
 * @author Mazen
 */
public class OrderList {

    Main1 main = new Main1();

    public ArrayList<Order> getOrders(String isSpecial) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selesctOrders = con.prepareStatement("select orderID, orderDate, customerID, employeeID,truckID,PONumber,orderTotalAmount from "
                + "orders where isSpecial = '" + isSpecial + "'");

        ResultSet rs = selesctOrders.executeQuery();
        ArrayList<Order> orders = new ArrayList<>();

        while (rs.next()) {
            Order ord = new Order();
          ord.setOrderID(rs.getString("orderID"));
          ord.setOrderDate(rs.getString("orderDate"));
          ord.setCustomerID(rs.getString("customerID"));
          ord.setEmployeeID(rs.getString("employeeID"));
          ord.setTruckID(rs.getString("truckID"));
          ord.setPONumber(rs.getString("PONumber"));
          ord.setOrderTotalAmount(rs.getString("orderTotalAmount"));

//            cus.setEmailAddress(rs.getString("emailAddress"));
//
//            cus.setCompanyName(rs.getString("companyName"));
//            cus.setContactName(rs.getString("contactName"));
orders.add(ord);

//            customers.add(cus);
        }

      return orders;
    }

}
