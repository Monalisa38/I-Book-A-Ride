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
    
        public void createMembershipTable() {

            try{

            Statement statement = conn.createStatement();
            this.checkExistedTable("MembershipTable");
            String newTable3 = "MEMBERSHIPTABLE";


            String sqlCreateTable3 = "CREATE TABLE "+newTable3+" (Name VARCHAR(255)"+"YesorNo VARCHAR(4)";
            String sqlAddRecord1 = "INSERT INTO PERSONALDETAILS VALUES('Monalisa', 'Yes')";

            this.statement = conn.createStatement();
            this.statement.addBatch(sqlCreateTable3);
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
        rs = this.statement.executeQuery("SELECT Name from MEMBERSHIPDETAILS");
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
        
        
   public void queryMembership() throws SQLException
{
    ResultSet rs = null;
    try{
        rs = this.statement.executeQuery("SELECT YesorNo from MEMBERSHIPDETAILS");
        while(rs.next())
        {
            String yon= rs.getString("YesorNo");
            System.out.println("YesorNo: " +(yon));
        }
    }
    catch(SQLException ex)
    {
        System.out.println("[queryYesorNo]:"+ex.getMessage());
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
