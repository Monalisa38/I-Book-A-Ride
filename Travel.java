/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public abstract class Travel /* abstract travel class, for all travel kinds*/ {
    public String travelType = "";
    public double price = 0;
    int customer;
    String membership;


    public Travel(String type, int customer) {
        this.travelType = type;
        this.customer = customer;

    }

    public void printDetails() {
        System.out.println(this.travelType);
        System.out.println(this.price);
        System.out.println(this.customer);
    }

    public void modeOfTransportName(String newName) {
        this.travelType = newName;
    }

    public abstract double CaculatePrice();


}
