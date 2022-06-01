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
public Data data;
public String name;
public String email;
public String phone;
public String age;
private Statement statement;



public PersonalDetailsDB() {
    
this.dbManager = new DBManager();
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


        String sqlCreateTable = "CREATE TABLE "+newTable+" (Name VARCHAR(100),"+"Email VARCHAR(50)," +"PhoneNumber VARCHAR(50),"+ "Age VARCHAR(20))";

        
        this.statement = conn.createStatement();
        this.statement.addBatch(sqlCreateTable);
        this.statement.executeBatch();
        
        }
       catch(SQLException ex)
        {
        System.err.println("SQLException: "+ ex.getMessage());

        }   

}

/**
 * 
 * @param name
 * @param email
 * @param phone
 * @param age 
 */

public void addPersonalDetails(String name, String email, String phone, String age)
{
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.email = email;
    this.age = age;
    
    this.data = this.dbManager.addPersonalDetails(name, email, phone, age);
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

