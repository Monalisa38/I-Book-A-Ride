/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;


/**
 *
 * @author Monalisa
 */
public class Wellington extends IntercityOptions /* wellington intercity method*/

{

    double cost = 50.00;

    public Wellington(int customer)

    {
        super("Wellington", customer);
    }

    public void printCityDetails() {
        System.out.println(this.travelCity);
        System.out.println(this.price);
        System.out.println(this.customer);
    }

    @Override
    public double CalculateTotal() {
        this.price = customer * cost;
        return this.price;
    }

}
