/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public abstract class IntercityOptions /*intercity methods*/

{
    public String travelCity = "";
    public double price = 0;
    int customer;


    public IntercityOptions(String city, int customer) {
        this.travelCity = city;
        this.customer = customer;

    }

    public void printDetails() {
        System.out.println(this.travelCity);
        System.out.println(this.price);
    }

    public void modeOfTransportName(String newName) {
        this.travelCity = newName;
    }



    public abstract void CalculateTotal();


}