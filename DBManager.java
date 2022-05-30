/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monalisa
 */
public class DBManager {
    private static final String USER_NAME = "pdc2"; //your DB username
    private static final String PASSWORD = "pdc2"; //your DB password
    private static final String URL = "jdbc:derby:603_Travel;create=true";  
    Connection conn;

    public DBManager() {
        establishConnection();
    }

    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        System.out.println(dbManager.getConnection());
    }

    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println(URL+"connected....");
        } catch (SQLException ex) {
           System.err.println("SQL Exception: "+ex.getMessage());
        }
        
        
    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
              
    public ResultSet queryDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }
    
    public Data addPersonalDetails(String name, String email, String phone, String age)
    {
        Data data = new Data();
        try{
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("INSERT INTO name, email,phoneNumber, age FROM PersonalDetails");
        }catch(SQLException ex)
        {
             Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data; 
    }
      


    public void updateDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
