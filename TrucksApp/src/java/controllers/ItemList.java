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
import model.Item;

/**
 *
 * @author Mazen
 */
public class ItemList {

    Main1 main = new Main1();

    public ArrayList<Item> getItems(String itemID) throws Exception {

        Connection con = Main1.getConnection();
        PreparedStatement selectComments = con.prepareStatement("select itemID,itemName,itemDescription,quantity,price from     "
                + "item where itemID = '" + itemID + "'");

        ResultSet rs = selectComments.executeQuery();
        ArrayList<Item> items = new ArrayList<>();

        while (rs.next()) {
            Item itm = new Item();
            
            
            itm.setItemID(rs.getString("itemID"));
            itm.setItemName(rs.getString("itemName"));
            itm.setItemDescription(rs.getString("itemDescription"));
            itm.setQuantity(rs.getString("quantity"));
            itm.setPrice(rs.getString("price"));
           
      

            items.add(itm);
        }

        return items;
    }

}
