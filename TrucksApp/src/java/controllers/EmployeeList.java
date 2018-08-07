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
import model.Employee;

/**
 *
 * @author Mazen
 */
public class EmployeeList {

    Main1 main = new Main1();

    public ArrayList<Employee> getEmployees(String extension ) throws Exception {

        Connection con = Main1.getConnection();
        PreparedStatement selectEmployees = con.prepareStatement("select employeeID, firstName, lastName, email from "
                + "employees where extension  = '" + extension + "'");

        ResultSet rs = selectEmployees.executeQuery();
        ArrayList<Employee> employees = new ArrayList<>();

        while (rs.next()) {
            Employee emp = new Employee();
            emp.setEmployeeID(rs.getString("employeeID"));

            emp.setEmailAddress(rs.getString("email"));

            emp.setFirstName(rs.getString("firstName"));
            emp.setLastName(rs.getString("lastName"));


            employees.add(emp);
        }

        return employees;
    }

}
