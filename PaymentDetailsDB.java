/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Monalisa
 */
public class PaymentDetailsDB {

private final DBManager dbManager;
private final Connection conn;
private Statement statement;
public Data data;
private String PaymentMethod;
    private String cardName;
    private String cardNumber;
    private String MM;
    private String YY;



public PaymentDetailsDB() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        
}

public void connectTravelDB() {

try {
          this.statement = conn.createStatement();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


}
public void checkExistedTable(String name)
{
        try{
        DatabaseMetaData dbmd = this.conn.getMetaData();
        String[] types = {"TABLE"};
        statement = this.conn.createStatement();
        ResultSet rs = dbmd.getTables(null, null, null, types);

        while(rs.next())
        {
        String table_name = rs.getString("TABLE_NAME");

        if(table_name.equalsIgnoreCase(name))
        {
        statement.executeUpdate("Drop table "+ name);

        break;
        }
        }

        }catch(SQLException ex)
        {
        System.out.println("SQL exception: "+ex.getMessage());
        }
}

public void createPaymentDetailsTable() {

        try{

        Statement statement = conn.createStatement();
        this.checkExistedTable("PaymentDetails");
        String newTable2 = "PAYMENTDETAILS";


        String sqlCreateTable2 = "CREATE TABLE "+newTable2+" (PaymentMethod VARCHAR(20),"+ "CardholdersName VARCHAR(255),"+ "CardNumber VARCHAR(255), "+"CardExpiryMonth VARCHAR(20),"+ "CardExpiryYear VARCHAR(20))";


        this.statement = conn.createStatement();
        this.statement.addBatch(sqlCreateTable2);
        this.statement.executeBatch();
        }
       catch(SQLException ex)
        {
        System.err.println("SQLException: "+ ex.getMessage());

        }   

        


}



public void queryPaymentType() throws SQLException
    {
        ResultSet rs = null;
        try{
            rs = this.statement.executeQuery("SELECT PaymentMethod from PAYMENTDETAILS");
            while(rs.next())
            {
                String PaymentType= rs.getString("PaymentMethod");
                System.out.println("Payment Method: " +(PaymentType));
            }
        }
        catch(SQLException ex)
        {
            System.out.println("[queryPaymentMethod]:"+ex.getMessage());
        }
    }

public void queryCardHolderName() throws SQLException
    {
        ResultSet rs = null;
        try{
            rs = this.statement.executeQuery("SELECT CardholdersName from PAYMENTDETAILS");
            while(rs.next())
            {
                String CardHolderName= rs.getString("CardholdersName");
                System.out.println("Cardholder's Name: " +(CardHolderName));
            }
        }
        catch(SQLException ex)
        {
            System.out.println("[queryCardholdersName]:"+ex.getMessage());
        }
    }

public void queryCardNumber() throws SQLException
    {
        ResultSet rs = null;
        try{
            rs = this.statement.executeQuery("SELECT CardNumber from PAYMENTDETAILS");
            while(rs.next())
            {
                String cardNumber= rs.getString("CardNumber");
                System.out.println("Card Number: " +(cardNumber));
            }
        }
        catch(SQLException ex)
        {
            System.out.println("[querycardNumber]:"+ex.getMessage());
        }
    }


           
     public void addPaymentDetails(String PaymentMethod, String cardName, String cardNumber, String MM, String YY)
     {
         this.PaymentMethod = PaymentMethod;
         this.cardName = cardName;
         this.cardNumber = cardNumber;
         this.MM = MM;
         this.YY = YY;
         
         this.data = this.dbManager.addPaymentDetails(PaymentMethod, cardName, cardNumber, MM, YY);
         
     }

public void closeConnection()
{
    this.dbManager.closeConnections();
}
}
