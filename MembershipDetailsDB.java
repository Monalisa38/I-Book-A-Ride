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
    public class MembershipDetailsDB {

    private final DBManager dbManager;
    private final Connection conn;
    private Statement statement;



    public MembershipDetailsDB() {
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




    public void createMembershipTable() {

            try{

            Statement statement = conn.createStatement();
            this.checkExistedTable("MembershipTable");
            String newTable3 = "MEMBERSHIPTABLE";


            String sqlCreateTable3 = "CREATE TABLE "+newTable3+" (YesorNo VARCHAR(4),ID INT)";

            this.statement = conn.createStatement();
            this.statement.addBatch(sqlCreateTable3);
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
