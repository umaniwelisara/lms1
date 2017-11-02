/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.Label;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.proteanit.sql.DbUtils;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import lms.DBconnect;

/**
 *
 * @author Umani Welisara
 */
public class ReturnBooksModel {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private String book1;
    private String book2;
    //private String memid;
    private Date cdate;
    private String rdate;
    private String fineday;
    private String totfine;
    private String today;
    private String rmemid;
    private String rnote;
    private Double rdayfine;
    private String lrtotfine;

    private String rbid1;
    private String rbid2;

    public ReturnBooksModel() {
    }

    ReturnBooksModel(String rmemid, String book1, String book2, Date cdate, String rdate, String fineday, String totfine, String today, String note) {

        this.rmemid = rmemid;
        this.book1 = book1;
        this.book2 = book2;
        this.cdate = cdate;
        this.rdate = rdate;
        this.fineday = fineday;
        this.totfine = totfine;
        this.today = today;
        this.rnote = note;

    }

    ReturnBooksModel(String memid, String book1, String book2, String dayfine, String totfine) {

        this.rmemid = memid;
        this.book1 = book1;
        this.book2 = book2;
        this.fineday = dayfine;
        this.totfine = totfine;
    }

    public boolean insertReturnBook() {
        try {
            String rbook = "insert into issuebooks(memid,book1,book2,cdate,rdate,rnote) values (?,?,?,?,?,?)";
            PreparedStatement pst = DBconnect.connect().prepareStatement(rbook);
            pst.setString(1, this.rmemid);
            pst.setString(2, this.book1);
            pst.setString(3, this.book2);
//            pst.setString(4, this.cdate.toString());
//            pst.setString(5, this.rdate.toString());
            pst.setDate(4, (java.sql.Date) this.cdate);
            pst.setString(5, this.rdate);
            pst.setString(6, this.rnote);

            pst.execute();

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public String showBooks1() throws SQLException {

        try {
            String q = "select book1 from issuebooks where memid=?";
            pst = DBconnect.connect().prepareStatement(q);
            pst.setString(1, this.rmemid);
            rs = pst.executeQuery();

            if (rs.next()) {
                String b1 = rs.getString("book1");
                // rbid1.setText(b1);
                //rbid1=(b1);
                return b1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }

    public String showBooks2() throws SQLException {

        try {
            String q = "select book2 from issuebooks where memid=?";
            pst = DBconnect.connect().prepareStatement(q);
            pst.setString(1, this.rmemid);
            rs = pst.executeQuery();

            if (rs.next()) {

                String b2 = rs.getString("book2");
                // rbid2.setText(b1);
                //rbid2=(b2);
                return b2;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }

//    public float countdays() throws SQLException {
//        //float a = rdayfine;
//        // double tfine = a*7;
//
//        Date dbDate = cdate;
//
//        //today
//        Date currentDate = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(dateFormat.format(currentDate));
//
//        //count seconds between dates
//        long diffDay = currentDate.getTime() - dbDate.getTime();
//        TimeUnit.DAYS.convert(diffDay, TimeUnit.MILLISECONDS);
//
//        float totdays = (float) (diffDay / (1000 * 60 * 60 * 24));
////...................
//        // lrtotfine.(count);
//
//        return totdays;
//    }
    //private static SimpleDateFormat = simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
    public static long getDayCount(String s,String e){
    
    long diff = -1;
        try {
            
            Date currentDate = new Date();
            Date dStart = currentDate;
            

//get the dbdate
            Date dEnd = SimpleDateFormat.parse(e);
            
            diff=Math.round((dEnd.getTime()-dStart.getTime()) / (double) 86400000);
            
        } catch (Exception e) {
        }
    
    return diff;
    }

    public String getBook1() {
        return book1;
    }

    public void setBook1(String book1) {
        this.book1 = book1;
    }

    public String getBook2() {
        return book2;
    }

    public void setBook2(String book2) {
        this.book2 = book2;
    }

    public String getMemid() {
        return rmemid;
    }

    public void setMemid(String rmemid) {
        this.rmemid = rmemid;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getFineday() {
        return fineday;
    }

    public void setFineday(String fineday) {
        this.fineday = fineday;
    }

    public String getTotfine() {
        return totfine;
    }

    public void setTotfine(String totfine) {
        this.totfine = totfine;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

}
