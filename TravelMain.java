/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

import java.sql.SQLException;

/**
 *
 * @author Monalisa
 */
public class TravelMain {
    
    public static void main(String[] args) throws SQLException
    {
    TravelApp ta = new TravelApp();
    PersonalDetailsDB pddb = new PersonalDetailsDB();
    TravelDetailsDB td = new TravelDetailsDB();
    PaymentDetailsDB pd = new PaymentDetailsDB();
    DatabaseMain dbm = new DatabaseMain();
    Controller controller = new Controller(ta,pddb,td,pd);    
    
    }
    

}
