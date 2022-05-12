/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public class Bus extends Travel /* bus method*/ {

    double cost = 25.00;


    public Bus(int customer) {
        super("Bus", customer);


    }

    public void printDetails() {
        System.out.println(this.travelType);
        System.out.println(this.price);
        System.out.println(this.customer);
    }

    @Override
    public void CaculatePrice() {
        this.price = customer * cost;
    }

}
