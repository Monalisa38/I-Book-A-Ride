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
public class DatabaseTables {

private final DBManager dbManager;
private final Connection conn;
private Statement statement;



public DatabaseTables() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        
}





public void createPersonalDetailsTable() {

        try{

        Statement statement = conn.createStatement();
        this.checkExistedTable("PersonalDetails");
        String newTable = "Personal |''| Details";


        String sqlCreateTable = "CREATE TABLE "+newTable+" (Name VARCHAR(50),"+ "Email(VARCHAR(255), (Phone Number INT (10), (Age INT (4)";

        this.statement = conn.createStatement();
        this.statement.addBatch(sqlCreateTable);
        this.statement.executeBatch();
        }
       catch(SQLException ex)
        {
        System.err.println("SQLException: "+ ex.getMessage());

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
        System.out.println(table_name);
        if(table_name.equalsIgnoreCase(name))
        {
        statement.executeUpdate("Drop table "+ name);
        System.out.println("\nTable " + name + " has been deleted");
        break;
        }
        }

        }catch(SQLException ex)
        {
        System.out.println("SQL exception: "+ex.getMessage());
        }
}



/*public ResultSet getWeekSpecial() {

        ResultSet rs = null;
        try {
            rs = this.statement.executeQuery("SELECT TITLE, PRICE, DISCOUNT "
                    + "FROM BOOK, PROMOTION "
                    + "WHERE BOOK.CATEGORY=PROMOTION.CATEGORY");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;




}



public void createWeekSpecialTable(ResultSet rs) {



        try{
        this.checkExistedTable("WEEKSPECIAL");
        this.statement = conn.createStatement();
        this.statement.addBatch("CREATE TABLE WEEKSPECIAL (TITLE VARCHAR(50), SPECIALPRICE FLOAT)");
        while(rs.next())
        {
        String title = rs.getString("TITLE");
        Float price =- rs.getFloat("DISCOUNT");
        int discount = rs.getInt("DISCOUNT");
        float new_price = price * (100-discount) /100;
        this.statement.addBatch("INSERT INTO WEEKSPECIAL VALUES('" + title + "'," + new_price + ")");
        }

        this.statement.executeBatch();
        rs.close();
        } catch(SQLException ex)
        {
        System.out.println(ex.getMessage());
        }



}
*/
public void closeConnection()
{
    this.dbManager.closeConnections();
}



}

