package pkg603_assignment2;

/**
 *
 * @author Monalisa
 */
public class IntercityBus extends Travel /*intercity bus method*/ {

    double cost = 20;


    public IntercityBus(int customer) {
        super("Intercity Bus", customer);



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