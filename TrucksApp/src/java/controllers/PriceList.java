
package controllers;

import database.Main1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Price;


public class PriceList {

    Main1 main = new Main1();

    public ArrayList<Price> getPrices(String priceID) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selectPrices = con.prepareStatement("select locationID, price from "
                + "prices where priceID = '" + priceID + "'");

        ResultSet rs = selectPrices.executeQuery();
        ArrayList<Price> prices = new ArrayList<>();

        while (rs.next()) {
            Price pc = new Price();
            pc.setLocationID(rs.getString("locationID"));

            pc.setPrice(rs.getString("price"));

          



            prices.add(pc);
        }

        return prices;
    }

}
