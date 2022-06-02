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


/**
 *
 * @author Monalisa
 */
public class PersonalDetailsDBTest {
    
    public PersonalDetailsDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception
        {

            
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
     * Test of connectTravelDB method, of class PersonalDetailsDB.
     */
    @Test
    public void testConnectTravelDB() {
        System.out.println("connectTravelDB");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.connectTravelDB();


    }

    /**
     * Test of createPersonalDetailsTable method, of class PersonalDetailsDB.
     */
    @Test
    public void testCreatePersonalDetailsTable() {
        System.out.println("createPersonalDetailsTable");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.createPersonalDetailsTable();


    }

    /**
     * Test of addPersonalDetails method, of class PersonalDetailsDB.
     */
    @Test
    public void testAddPersonalDetails() {
        System.out.println("addPersonalDetails");
        String name = "";
        String email = "";
        String phone = "";
        String age = "";
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.addPersonalDetails(name, email, phone, age);

    }

    /**
     * Test of queryName method, of class PersonalDetailsDB.
     */
    @Test
    public void testQueryName() throws Exception {
        System.out.println("queryName");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.queryName();

    }

    /**
     * Test of queryEmail method, of class PersonalDetailsDB.
     */
    @Test
    public void testQueryEmail() throws Exception {
        System.out.println("queryEmail");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.queryEmail();


    }

    /**
     * Test of queryPhoneNumber method, of class PersonalDetailsDB.
     */
    @Test
    public void testQueryPhoneNumber() throws Exception {
        System.out.println("queryPhoneNumber");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.queryPhoneNumber();


    }

    /**
     * Test of queryAge method, of class PersonalDetailsDB.
     */
    @Test
    public void testQueryAge() throws Exception {
        System.out.println("queryAge");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.queryAge();

    }

    /**
     * Test of checkExistedTable method, of class PersonalDetailsDB.
     */
    @Test
    public void testCheckExistedTable() {
        System.out.println("checkExistedTable");
        String name = "";
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.checkExistedTable(name);


    }

    /**
     * Test of closeConnection method, of class PersonalDetailsDB.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        PersonalDetailsDB instance = new PersonalDetailsDB();
        instance.closeConnection();

    }
    
}
