/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public class Ferry extends Travel /* ferry method*/

{
    
    double cost = 50.00;
    
    
    public Ferry(int customer)
    {
        super("Ferry",customer);
       
        
    }
    
    /**
     *
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.travelType);
        System.out.println(this.price);
        System.out.println(this.customer);
    }

    @Override
    public double CaculatePrice() 
    {
       this.price = customer * cost;   
       return this.price;
    }   
}
    
    

