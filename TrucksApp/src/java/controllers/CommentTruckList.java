///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controllers;
//
//
//import database.Main1;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import model.Truck;
//
///**
// *
// * @author Mazen
// */
//public class CommentTruckList {
//
//    Main1 main = new Main1();
//
//    public ArrayList<Truck> getComments(String truckID) throws Exception {
//
//        Connection con = Main1.getConnection();
//        PreparedStatement selectComments = con.prepareStatement("select truckID, VIN,employeeID,color from     "
//                + "Truck where truckID = '" + truckID + "'");
//
//        ResultSet rs = selectComments.executeQuery();
//        ArrayList<Truck> trucks = new ArrayList<>();
//
//        while (rs.next()) {
//            Truck tru = new Truck();
//            
//            tru.setTruckID(rs.getString("truckID"));
//            tru.setVIN(rs.getString("VIN"));
//            tru.setEmployeeID(rs.getString("employeeID"));
//            tru.setColor(rs.getString("color"));
////            com.setCommentDateTime(rs.getString("commentDateTime"));
////       
////            com.setComments(rs.getString("comment"));
//      
//
//            trucks.add(tru);
//        }
//
//        return trucks;
//    }
//
//}
