/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg603_assignment2;

import java.sql.Connection;
import java.sql.ResultSet;
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
public class DBManagerTest {
    
    public DBManagerTest() {
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
     * Test of main method, of class DBManager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DBManager.main(args);

    }

    /**
     * Test of test_queryPerson method, of class DBManager.
     */
    @Test
    public void testTest_queryPerson() {
        System.out.println("test_queryPerson");
        DBManager instance = new DBManager();
        instance.test_queryPerson();


    }

    /**
     * Test of test_queryTravel method, of class DBManager.
     */
    @Test
    public void testTest_queryTravel() {
        System.out.println("test_queryTravel");
        DBManager instance = new DBManager();
        instance.test_queryTravel();


    }

    /**
     * Test of test_queryPayment method, of class DBManager.
     */
    @Test
    public void testTest_queryPayment() {
        System.out.println("test_queryPayment");
        DBManager instance = new DBManager();
        instance.test_queryPayment();


    }

    /**
     * Test of getConnection method, of class DBManager.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DBManager instance = new DBManager();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);


    }

    /**
     * Test of establishConnection method, of class DBManager.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        DBManager instance = new DBManager();
        instance.establishConnection();


    }

    /**
     * Test of closeConnections method, of class DBManager.
     */
    @Test
    public void testCloseConnections() {
        System.out.println("closeConnections");
        DBManager instance = new DBManager();
        instance.closeConnections();


    }

    /**
     * Test of queryDB method, of class DBManager.
     */
    @Test
    public void testQueryDB() {
        System.out.println("queryDB");
        String sql = "";
        DBManager instance = new DBManager();
        ResultSet expResult = null;
        ResultSet result = instance.queryDB(sql);
        assertEquals(expResult, result);


    }

    /**
     * Test of addPersonalDetails method, of class DBManager.
     */
    @Test
    public void testAddPersonalDetails() {
        System.out.println("addPersonalDetails");
        String name = "";
        String email = "";
        String phone = "";
        String age = "";
        DBManager instance = new DBManager();
        Data expResult = null;
        Data result = instance.addPersonalDetails(name, email, phone, age);
        assertEquals(expResult, result);

    }

    /**
     * Test of addTravelDetails method, of class DBManager.
     */
    @Test
    public void testAddTravelDetails() {
        System.out.println("addTravelDetails");
        String travelType = "";
        String peoples = "";
        String date = "";
        String month = "";
        String year = "";
        DBManager instance = new DBManager();
        Data expResult = null;
        Data result = instance.addTravelDetails(travelType, peoples, date, month, year);
        assertEquals(expResult, result);

    }

    /**
     * Test of addPaymentDetails method, of class DBManager.
     */
    @Test
    public void testAddPaymentDetails() {
        System.out.println("addPaymentDetails");
        String PaymentDetails = "";
        String cardName = "";
        String cardNumber = "";
        String MM = "";
        String YY = "";
        DBManager instance = new DBManager();
        Data expResult = null;
        Data result = instance.addPaymentDetails(PaymentDetails, cardName, cardNumber, MM, YY);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateDB method, of class DBManager.
     */
    @Test
    public void testUpdateDB() {
        System.out.println("updateDB");
        String sql = "";
        DBManager instance = new DBManager();
        instance.updateDB(sql);


    }
    
}
