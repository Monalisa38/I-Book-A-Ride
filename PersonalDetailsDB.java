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
public class PersonalDetailsDB {

private final DBManager dbManager;
private final Connection conn;
private Statement statement;



public PersonalDetailsDB() {
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

public void createPersonalDetailsTable() {

        try{

        Statement statement = conn.createStatement();
        this.checkExistedTable("PersonalDetails");
        String newTable = "PERSONALDETAILS";


        String sqlCreateTable = "CREATE TABLE "+newTable+" (Name VARCHAR(255),"+"Email VARCHAR(255)," +"PhoneNumber INT,"+ "Age INT)";
        String sqlAddRecord1 = "INSERT INTO PERSONALDETAILS VALUES('Monalisa','abc@yahoo.com', 1234567890, 19)";
        String sqlAddRecord2 = "INSERT INTO PERSONALDETAILS VALUES('Alisha','abcd@yahoo.com', 1234567890, 15)";
        
        this.statement = conn.createStatement();
        this.statement.addBatch(sqlCreateTable);
        this.statement.addBatch(sqlAddRecord1);
        this.statement.addBatch(sqlAddRecord2);
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
        rs = this.statement.executeQuery("SELECT Name from PERSONALDETAILS");
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

public void queryEmail() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT Email from PERSONALDETAILS");
        while(rs.next())
        {
            String email= rs.getString("Email");
            System.out.println("Email: " +(email));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryEmail]:"+ex.getMessage());
    }
}

public void queryPhoneNumber() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT PhoneNumber from PERSONALDETAILS");
        while(rs.next())
        {
            int phoneNumber = rs.getInt("PhoneNumber");
            System.out.println("Phone Number: " + Integer.toString(phoneNumber));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryPhoneNumber]:"+ex.getMessage());
    }
}
    


public void queryAge() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT Age from PERSONALDETAILS");
        while(rs.next())
        {
            int age = rs.getInt("Age");
            System.out.println("Age: " + Integer.toString(age));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryAge]:"+ex.getMessage());
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

