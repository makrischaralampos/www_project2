/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import com.example.web.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author makri
 */
public class MyDb {
    
    Connection con;
    public Connection getCon() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/product_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "ronaldocr7juve");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return con;
    }
    
}
