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
public class PaymentDetailsDBTest {
    
    public PaymentDetailsDBTest() {
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
     * Test of connectTravelDB method, of class PaymentDetailsDB.
     */
    @Test
    public void testConnectTravelDB() {
        System.out.println("connectTravelDB");
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.connectTravelDB();

    }

    /**
     * Test of checkExistedTable method, of class PaymentDetailsDB.
     */
    @Test
    public void testCheckExistedTable() {
        System.out.println("checkExistedTable");
        String name = "";
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.checkExistedTable(name);

    }

    /**
     * Test of createPaymentDetailsTable method, of class PaymentDetailsDB.
     */
    @Test
    public void testCreatePaymentDetailsTable() {
        System.out.println("createPaymentDetailsTable");
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.createPaymentDetailsTable();

    }

    /**
     * Test of queryPaymentType method, of class PaymentDetailsDB.
     */
    @Test
    public void testQueryPaymentType() throws Exception {
        System.out.println("queryPaymentType");
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.queryPaymentType();

    }

    /**
     * Test of queryCardHolderName method, of class PaymentDetailsDB.
     */
    @Test
    public void testQueryCardHolderName() throws Exception {
        System.out.println("queryCardHolderName");
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.queryCardHolderName();

    }

    /**
     * Test of queryCardNumber method, of class PaymentDetailsDB.
     */
    @Test
    public void testQueryCardNumber() throws Exception {
        System.out.println("queryCardNumber");
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.queryCardNumber();

    }

    /**
     * Test of addPaymentDetails method, of class PaymentDetailsDB.
     */
    @Test
    public void testAddPaymentDetails() {
        System.out.println("addPaymentDetails");
        String PaymentMethod = "";
        String cardName = "";
        String cardNumber = "";
        String MM = "";
        String YY = "";
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.addPaymentDetails(PaymentMethod, cardName, cardNumber, MM, YY);

    }

    /**
     * Test of closeConnection method, of class PaymentDetailsDB.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        PaymentDetailsDB instance = new PaymentDetailsDB();
        instance.closeConnection();

    }
    
}
