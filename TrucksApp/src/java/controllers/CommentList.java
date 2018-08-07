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
import model.Comment;

/**
 *
 * @author Mazen
 */
public class CommentList {

    Main1 main = new Main1();

    public ArrayList<Comment> getComments(String transactionID) throws Exception {

        Connection con = Main.getConnection();
        PreparedStatement selectComments = con.prepareStatement("select commentDateTime, comment from     "
                + "comments where transactionID = '" + transactionID + "'");

        ResultSet rs = selectComments.executeQuery();
        ArrayList<Comment> comments = new ArrayList<>();

        while (rs.next()) {
            Comment com = new Comment();
            com.setCommentDateTime(rs.getString("commentDateTime"));
       
            com.setComments(rs.getString("comment"));
      

            comments.add(com);
        }

        return comments;
    }

}
