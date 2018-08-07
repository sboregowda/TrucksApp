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
import model.Transaction;

/**
 *
 * @author Mazen
 */
public class TransactionList {
    Main1 main = new Main1();
    
    public ArrayList<Transaction> getTransaction(int orderID) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selesctCustomers = con.prepareStatement("select transactionID, transactionDate, transactionDescription, "
                + "transactionAmount, discount, unitPrice, quantity from transactions where orderID = '" + orderID + "'");

        ResultSet rs = selesctCustomers.executeQuery();
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (rs.next()) {
            Transaction tran = new Transaction();
            tran.setTransactionID(rs.getString("transactionID"));
            tran.setTransactionDate(rs.getString("transactionDate"));
            tran.setTransactionDescription(rs.getString("transactionDescription"));
            tran.setTransactionAmount(rs.getString("transactionAmount"));
            tran.setDiscount(rs.getString("discount"));
            tran.setUnitPrice(rs.getString("unitPrice"));
            tran.setQuantity(rs.getString("quantity"));

            transactions.add(tran);
        }

        return transactions;
    }
}
