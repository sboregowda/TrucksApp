/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mazen
 */
public class Comment {
    private String commentID;
    private String commentDateTime;
    private String comment;
    //F key
    private String customerID;
    //F key
    private String locationID;
    //F key
    private String transactionID;
    //F key 
    private String truckID;
    
    @Override
    public String toString() {
        return "Comment{" + "CommentID=" + getCommentID() + ", commentDateTime=" + getCommentDateTime() + ", comment=" + getComment() + 
                ", customerID=" + getCustomerID() + ", locationID=" + getLocationID() + ", transactionID=" 
                + getTransactionID() + ", truckID=" + getTruckID() +')';
    }

    
    
    public Comment(){
        
    }

    /**
     * @return the commentID
     */
    public String getCommentID() {
        return commentID;
    }

    /**
     * @param commentID the commentID to set
     */
    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    /**
     * @return the commentDateTime
     */
    public String getCommentDateTime() {
        return commentDateTime;
    }

    /**
     * @param commentDateTime the commentDateTime to set
     */
    public void setCommentDateTime(String commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComments(String comment) {
        this.comment = comment;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the locationID
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * @param locationID the locationID to set
     */
    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    /**
     * @return the transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * @param transactionID the transactionID to set
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * @return the truckID
     */
    public String getTruckID() {
        return truckID;
    }

    /**
     * @param truckID the truckID to set
     */
    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }
}
