
package controllers;

import database.Main1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Expense;


public class ExpenseList {

    Main1 main = new Main1();

    public ArrayList<Expense> getExpenses(String paymentMethod) throws Exception {

        Connection con = Main1.getConnection();
        PreparedStatement selectExpenses = con.prepareStatement("select expenseID, employeeID, description, amount from "
                + "expenses where paymentMethod = '" + paymentMethod + "'");

        ResultSet rs = selectExpenses.executeQuery();
        ArrayList<Expense> exp= new ArrayList<>();

        while (rs.next()) {
            Expense ex = new Expense();
            ex.setExpenseID(rs.getString("expenseID"));

            ex.setEmployeeID(rs.getString("employeeID"));

            ex.setTruckID(rs.getString("description"));
            ex.setAmount(rs.getString("amount"));



            exp.add(ex);
        }

        return exp;
    }

}
