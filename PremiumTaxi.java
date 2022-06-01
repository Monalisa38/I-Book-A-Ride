/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public class PremiumTaxi extends Travel /*premium taxi details */ {


    double cost = 40.00;


    public PremiumTaxi(int customer) {
        super("Premium Cab", customer);

    }

    public void printDetails() {
        System.out.println(this.travelType);
        System.out.println(this.price);
        System.out.println(this.customer);
    }

    /**
     *
     */
    @Override
    public double CaculatePrice() {
        this.price = customer * cost;
        return this.price;
    }

}
