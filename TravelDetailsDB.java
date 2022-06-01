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
    private String people;
    private String month;
    private String year;
    private String date;
    private String total;
    public Data data;
    private String peoples;
    private String travelType;



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

            String sqlCreateTable1 = "CREATE TABLE "+newTable1+" (travelType VARCHAR(50),"+ "People VARCHAR(255),"+ "Day VARCHAR(255), " +"Month VARCHAR(255),"+"TravelYear VARCHAR(255))";


            this.statement = conn.createStatement();
            this.statement.addBatch(sqlCreateTable1);
            this.statement.executeBatch();

        }
        catch(SQLException ex)
        {
             System.err.println("SQLException: "+ ex.getMessage());
        }
    }
    
    public void addTravelDetails(String travelType,String peoples, String date, String month, String year)
    {
        this.travelType = travelType;
        this.peoples = peoples;
        this.date = date;
        this.month = month;
        this.year = year;

        
       this.data = this.dbManager.addTravelDetails(travelType,peoples, date, month, year);
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

