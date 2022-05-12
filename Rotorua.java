/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

import pkg603_assignment2.IntercityOptions;

/**
 *
 * @author Monalisa
 */
public class Rotorua extends IntercityOptions /* rotorua intercity method*/

{

    double cost = 35.00;

    public Rotorua(int customer)

    {
        super("Rotorua", customer);
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