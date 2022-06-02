/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg603_assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Monalisa
 */
public class TravelDetailsDBTest {
    
    public TravelDetailsDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of connectTravelDB method, of class TravelDetailsDB.
     */
    @Test
    public void testConnectTravelDB() {
        System.out.println("connectTravelDB");
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.connectTravelDB();


    }

    /**
     * Test of createTravelDetailsTable method, of class TravelDetailsDB.
     */
    @Test
    public void testCreateTravelDetailsTable() {
        System.out.println("createTravelDetailsTable");
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.createTravelDetailsTable();
    }

    /**
     * Test of addTravelDetails method, of class TravelDetailsDB.
     */
    @Test
    public void testAddTravelDetails() {
        System.out.println("addTravelDetails");
        String travelType = "";
        String peoples = "";
        String date = "";
        String month = "";
        String year = "";
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.addTravelDetails(travelType, peoples, date, month, year);

    }

    /**
     * Test of queryTravelType method, of class TravelDetailsDB.
     */
    @Test
    public void testQueryTravelType() throws Exception {
        System.out.println("queryTravelType");
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.queryTravelType();

    }

    /**
     * Test of queryPeople method, of class TravelDetailsDB.
     */
    @Test
    public void testQueryPeople() throws Exception {
        System.out.println("queryPeople");
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.queryPeople();


    }

    /**
     * Test of checkExistedTable method, of class TravelDetailsDB.
     */
    @Test
    public void testCheckExistedTable() {
        System.out.println("checkExistedTable");
        String name = "";
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.checkExistedTable(name);


    }

    /**
     * Test of closeConnection method, of class TravelDetailsDB.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        TravelDetailsDB instance = new TravelDetailsDB();
        instance.closeConnection();

    }
    
}
