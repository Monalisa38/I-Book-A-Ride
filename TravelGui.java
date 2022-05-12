package pkg603_assignment2;
/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Monalisa
 */
public class TravelGui extends JFrame implements ActionListener {
    
   TextField text = new TextField(20);
    
    
public TravelGui(String name){

    super(name);
    
    setLayout(null);
    
    JButton busButton = new JButton("Bus");
    busButton.setLocation(0,10);
    busButton.setSize(100, 50);
    busButton.setFont(new Font("Courier", Font.BOLD,10));
    busButton.setForeground(Color.pink);
    getContentPane().add(busButton);
    
    JButton trainButton = new JButton("Train");
    trainButton.setLocation(100,10);
    trainButton.setSize(100, 50);
    trainButton.setFont(new Font("Courier", Font.BOLD,10));
    trainButton.setForeground(Color.blue);
    getContentPane().add(trainButton);
    
    JButton ferryButton = new JButton("Ferry");
    ferryButton.setLocation(200,10);
    ferryButton.setSize(100, 50);
    ferryButton.setFont(new Font("Courier", Font.BOLD,10));
    ferryButton.setForeground(Color.orange);
    getContentPane().add(ferryButton);
    
    JButton taxiButton = new JButton("Taxi");
    taxiButton.setLocation(300,10);
    taxiButton.setSize(100, 50);
    taxiButton.setFont(new Font("Courier", Font.BOLD,10));
    taxiButton.setForeground(Color.gray);
    getContentPane().add(taxiButton);
    
    JButton PremiumTaxiButton = new JButton("Premium Taxi");
    PremiumTaxiButton.setLocation(400,10);
    PremiumTaxiButton.setSize(100, 50);
    PremiumTaxiButton.setFont(new Font("Courier", Font.BOLD,10));
    PremiumTaxiButton.setForeground(Color.black);
    getContentPane().add(PremiumTaxiButton);
    
    JButton IntercityBusButton = new JButton("Intercity Bus");
    IntercityBusButton.setLocation(500,10);
    IntercityBusButton.setSize(100, 50);
    IntercityBusButton.setFont(new Font("Courier", Font.BOLD,10));
    IntercityBusButton.setForeground(Color.magenta);
    getContentPane().add(IntercityBusButton);
    
    busButton.addActionListener(this);
    trainButton.addActionListener(this);
    ferryButton.addActionListener(this);
    taxiButton.addActionListener(this);
    PremiumTaxiButton.addActionListener(this);
    IntercityBusButton.addActionListener(this);
}

public static void main(String[] args)
{
    JFrame frame = new TravelGui("I Book A Ride");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane();
    frame.pack();
    frame.setSize(700,600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Button pressed by user");
         
    }
            
}
