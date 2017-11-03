/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Umani Welisara
 */
public class DBconnect {

    public static Connection connect() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        } catch (Exception e) {

            System.out.println(e);
        }

        return conn;
    }

    static Connection conn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
