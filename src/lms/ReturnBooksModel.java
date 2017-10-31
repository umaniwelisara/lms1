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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public boolean showBooks() throws SQLException {

        try {
            String id = rmemid;
            // memid.getString()=id;
            // SELECT id, name FROM manager WHERE name = "somename"
            String q = "select book1 from issuebooks where memid='" + id + "'";
            PreparedStatement pst1 = DBconnect.connect().prepareStatement(q);

            String q2 = "select book2 from issuebooks where memid='" + id + "'";
            PreparedStatement pst2 = DBconnect.connect().prepareStatement(q2);

            rbid1(pst1);
            rbid2(pst2);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public double calculateFine() throws SQLException {
        Double a = rdayfine;
        // double tfine = a*7;

        Date dbDate = cdate;

        //today
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(currentDate));

        //count seconds between dates
       // Duration duration = Duration.between(dbDate, currentDate);
        //int count = duration / (60 * 60 * 24);

        //lrtotfine.setText(tfine);
        return count;
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
