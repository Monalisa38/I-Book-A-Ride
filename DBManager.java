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
        dbManager.test_queryPerson();
        dbManager.test_queryTravel();
        dbManager.test_queryPayment();
    }
    
    public void test_queryPerson()
    {
        
        String queryPerson = "select * from PERSONALDETAILS";
        ResultSet rs = this.queryDB(queryPerson);
        try {
            while(rs.next())
            {
                String name = rs.getString("Name");
                String email = rs.getString("Email");
                String phoneNumber = rs.getString("PhoneNumber");
                String age = rs.getString("Age");
                System.out.println("[Name]: " + name);
                System.out.println("[Email]: "+ email);
                System.out.println("[Phone]: " + phoneNumber);
                System.out.println("[Age]: "+age);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void test_queryTravel()
    {
        
        String queryTravel = "select * from TRAVELDETAILS";
        ResultSet rs = this.queryDB(queryTravel);
        try {
            while(rs.next())
            {
                String people = rs.getString("People");
                String travel = rs.getString("TravelType");
                String day = rs.getString("Day");
                String month = rs.getString("Month");
                String year = rs.getString("TravelYear");
      
                System.out.println("[People]: " + people);
                System.out.println("[Travel Type]: " + travel);
                System.out.println("[Travel Date]: " + day+""+month+""+year);

   
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void test_queryPayment()
    {
        
        String queryPayment = "select * from PAYMENTDETAILS";
        ResultSet rs = this.queryDB(queryPayment);
        try {
            while(rs.next())
            {
                String PaymentType= rs.getString("PaymentMethod");
                String cardName = rs.getString("CardHoldersName");
                String cardNumber = rs.getString("CardNumber");
                String MM = rs.getString("CardExpiryMonth");
                String YY = rs.getString("CardExpiryYear");
      
                System.out.println("[PaymentType]: " + PaymentType);
                System.out.println("[Card Name]: " + cardName);
                System.out.println("[Card Number]: " + cardNumber);
                System.out.println("[MM/YY]: " + MM+"/"+YY);

                
   
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    



    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        try {
            if(conn == null)
            {conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);}
            else
            {
                System.out.println("connected already");
            }  
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

        //Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = this.conn.createStatement();
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
            String sqlInsert = "INSERT INTO PERSONALDETAILS VALUES( '"+name+"', '"+email+"','"+ phone+"', '"+age+"' )";
            statement.executeUpdate(sqlInsert);
        }catch(SQLException ex)
        {
             Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data; 
    }
      
       public Data addTravelDetails(String travelType,String peoples, String date, String month, String year)
    {
        Data data = new Data();
        try{
            Statement statement = conn.createStatement();
            String sqlInsert = "INSERT INTO TRAVELDETAILS VALUES( '"+travelType+"', '"+peoples+"','"+ date+"', '"+month+"', '"+year+"' )";
            statement.executeUpdate(sqlInsert);
        }catch(SQLException ex)
        {
             Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data; 
    } 
    
      
       public Data addPaymentDetails(String PaymentDetails,String cardName, String cardNumber, String MM, String YY)
    {
        Data data = new Data();
        try{
            Statement statement = conn.createStatement();
            String sqlInsert = "INSERT INTO PAYMENTDETAILS VALUES( '"+PaymentDetails+"', '"+cardName+"','"+ cardNumber+"', '"+MM+"', '"+YY+"' )";
            statement.executeUpdate(sqlInsert);
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
