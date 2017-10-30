/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.Label;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import lms.DBconnect;
/**
 *
 * @author Umani Welisara
 */
public class BookModel {

    private String bid;
    private String bname;
    private String bauthor;
    private String bcategory;
    private String bqty;
    private String txtsearch;

    public BookModel(String bid, String bname, String bauthor, String bcategory, String bqty) {
        this.bid = bid;
        this.bname = bname;
        this.bauthor = bauthor;
        this.bcategory = bcategory;
        this.bqty = bqty;
    }

    public BookModel(String pbid) {
        this.bid = pbid;
    }

    public BookModel(String bname, String bauthor, String bcategory, String bqty) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.bcategory = bcategory;
        this.bqty = bqty;
    }

//    public BookModel(String bbname) {
//        this.txtsearch = bbname;
//    }
    public boolean insertBook() {
        try {
            String s = "insert into books(bname,bauthor,bcategory,bqty) values (?,?,?,?)";
            PreparedStatement pst = DBconnect.connect().prepareStatement(s);
            
            pst.setString(1, this.bname);
            pst.setString(2, this.bauthor);
            pst.setString(3, this.bcategory);
            pst.setString(4, this.bqty);

            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean deleteBook() {

        try {
            //String bid = this.bid.getText();
            String qr = "delete from books where bid= ?";
            PreparedStatement pst = DBconnect.connect().prepareStatement(qr);
            pst.setString(1, this.bid);

            pst.execute();

            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean updateBook() {

        try {
            //Label lblbid = null;
            
            //String bid = lblbid.getText();
            
            String q = "update books "
                    + "set bname=?,bauthor=?,bcategory=? , bqty=?  "
                    + "where bid=?";

            PreparedStatement pst = DBconnect.connect().prepareStatement(q);

            // pst = conn.prepareStatement(qr);
           // pst.setString(1, this.bid);
            pst.setString(1, this.bname);
            pst.setString(2, this.bauthor);
            pst.setString(3, this.bcategory);
            pst.setString(4, this.bqty);
            pst.setString(5, this.bid);

            pst.execute();

            return true;

        } catch (Exception e) {
            return false;
        }

    }

// public boolean searchBook(String bname){
//        
//this.txtsearch = bname;
//        try {
//             String name = txtsearch.getText();
//             String n = "Select bid,bname,bauthor,bcategory,bqty from books where bname like '%" + name + "%'";
//             PreparedStatement pst = DBconnect.connect().prepareStatement(n);
//            tblbooks.setModel(DbUtils.resultSetToTableModel(pst));
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//
//
// }
    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    public String getBqty() {
        return bqty;
    }

    public void setBqty(String bqty) {
        this.bqty = bqty;
    }

}
