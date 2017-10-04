/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	private String cdate;
	private String rdate;
        private String fineday;
        private String totfine;
        private String today;
   private String rmemid;     
   private String mregID;
    
         public ReturnBooksModel() {
	}

    ReturnBooksModel(String rmemid,String book1,String book2,String cdate,String rdate,String fineday,String totfine,String today) {

        this.rmemid=rmemid;
    this.book1=book1;
    this.book2=book2;
    this.cdate=cdate;
    this.rdate=rdate;
    this.fineday=fineday;
    this.totfine=totfine;
    this.today=today;
   
    }

    ReturnBooksModel(String memid, String book1, String book2, String dayfine, String totfine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public boolean insertReturnBook(){
       try {
           
           
           
           
           
           
           
           return true;
       } catch (Exception e) {
           return false;
       }
        
   }
   
   public boolean checkID(){
       try {
           SELECT id, name FROM manager WHERE name = "somename"
           if(){
           
           }
           
           return true;
           
       } catch (Exception e) {
           return false;
       }
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

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
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
