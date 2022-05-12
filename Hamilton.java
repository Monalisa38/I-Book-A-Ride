/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public class Hamilton extends IntercityOptions /* hamilton intercity method*/

{

    double cost = 30;

    public Hamilton(int customer)

    {
        super("Hamilton", customer);
    }

    public void printCityDetails() {
        System.out.println(this.travelCity);
        System.out.println(this.price);
        System.out.println(this.customer);
    }

    @Override
    public void CalculateTotal() {
        this.price = customer * cost;
    }

}