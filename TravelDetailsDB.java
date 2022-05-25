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
public class TravelDetailsDB {
  
private final DBManager dbManager;
private final Connection conn;
private Statement statement;



public TravelDetailsDB() {
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

public void createTravelDetailsTable()
{
    try{
        Statement statement = conn.createStatement();
        this.checkExistedTable("TravelDetails");
        String newTable1 = "TRAVELDETAILS";
        
        String sqlCreateTable1 = "CREATE TABLE "+newTable1+" (Name VARCHAR(255),"+"TravelType VARCHAR(50),"+ "City VARCHAR(255),"+ "People INT,"+ "Date Date)";
        String sqlAddRecord1 = "INSERT INTO TRAVELDETAILS VALUES('Monalisa','Bus', 'NA',27, 2024-10-22)";
        
        this.statement = conn.createStatement();
        this.statement.addBatch(sqlCreateTable1);
        this.statement.addBatch(sqlAddRecord1);
        this.statement.executeBatch();

    }
    catch(SQLException ex)
    {
         System.err.println("SQLException: "+ ex.getMessage());
    }
}

public void queryName() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT Name from TRAVELDETAILS");
        while(rs.next())
        {
            String name= rs.getString("Name");
            System.out.println("Name: " +(name));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryName]:"+ex.getMessage());
    }
}

public void queryTravelType() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT TravelType from TRAVELDETAILS");
        while(rs.next())
        {
            String travelType= rs.getString("TravelType");
            System.out.println("TravelType: " +(travelType));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryTravelType]:"+ex.getMessage());
    }
}

public void queryCity() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT City from TRAVELDETAILS");
        while(rs.next())
        {
            String city= rs.getString("City");
            System.out.println("City: " +(city));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryCity]:"+ex.getMessage());
    }
}

 public void queryPeople() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT People from TRAVELDETAILS");
        while(rs.next())
        {
            int people = rs.getInt("People");
            System.out.println("People: " + Integer.toString(people));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryPeople]:"+ex.getMessage());
    }
}
 
  public void queryDate() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT Date from TRAVELDETAILS");
        while(rs.next())
        {
            int date = rs.getInt("Date");
            System.out.println("Date: " + Integer.toString(date));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryDate]:"+ex.getMessage());
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

public void closeConnection()
{
    this.dbManager.closeConnections();
}

}

