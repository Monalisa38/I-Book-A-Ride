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


        String sqlCreateTable2 = "CREATE TABLE "+newTable2+" (PaymentMethod VARCHAR(4),"+ "CardholdersName VARCHAR(255), CardNumber INT, CVV INT, CardExpiryDate DATE, ID INT)";

        this.statement = conn.createStatement();
        this.statement.addBatch(sqlCreateTable2);
        this.statement.executeBatch();
        }
       catch(SQLException ex)
        {
        System.err.println("SQLException: "+ ex.getMessage());

        }   



}

public void closeConnection()
{
    this.dbManager.closeConnections();
}
}