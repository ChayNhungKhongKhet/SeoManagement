/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MyConnection {

    private final String url = "jdbc:postgresql://5432/SeoManagement";
    private final String user = "postgres";
    private final String password = "123456";
    
    private Connection conn;
    
    
    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url,user,password);            
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    
}
