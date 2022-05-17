package pkg603_assignment2;
/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Monalisa
 */
public class TravelGui extends JFrame implements ActionListener {
    
   JRadioButton bus, train, ferry, taxi, premiumTaxi,intercityBus ;
   JButton b;
   JPanel p; 
   JLabel label;
    
public TravelGui(String name){

    super(name);
    
    setLayout(null);
    
    //label at the top of the GUI//
   label = new JLabel("Welcome to I Book A Ride!");
   label.setSize(20,20);
   label.setBounds(10,10,100,30);
   label.setVisible(true);

    
    bus = new JRadioButton("Bus");
    bus.setBounds(100, 60, 150, 30);
    
    train = new JRadioButton("Train");
    train.setBounds(100,75,150,30);
    
    ferry = new JRadioButton("Ferry");
    ferry.setBounds(100,90,150,30);
    
    taxi = new JRadioButton("Taxi");
    taxi.setBounds(100, 105, 150, 30);
    
    premiumTaxi = new JRadioButton("Premium Taxi");
    premiumTaxi.setBounds(100,120,150,30);
    
    intercityBus = new JRadioButton("Intercity Bus");
    intercityBus.setBounds(100,135,150,30);
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(bus);
    bg.add(train);
    bg.add(ferry);
    bg.add(taxi);
    bg.add(premiumTaxi);
    bg.add(intercityBus);
    b = new JButton("Confirm");
    b.setBounds(200,170,80,30);
    b.addActionListener(this);
    add(bus);
    add(train);
    add(ferry);
    add(taxi);
    add(premiumTaxi);
    add(intercityBus);
    add(b);
    
    ///Panel//
  //  p  = new JPanel();
    
   // p.add(bus);
   


}

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(bus.isSelected())
    {
        JOptionPane.showMessageDialog(this,"You have selected a day bus package");
    }
     if(train.isSelected())
    {
        JOptionPane.showMessageDialog(this,"You have selected a day train package");
    }
         if(ferry.isSelected())
    {
        JOptionPane.showMessageDialog(this,"You have selected a day ferry package");
    }
     if(taxi.isSelected())
    {
        JOptionPane.showMessageDialog(this,"You have selected a day taxi package");
    }
     
     if(premiumTaxi.isSelected())
    {
        JOptionPane.showMessageDialog(this,"You have selected a day premium taxi package");
    }
     if(intercityBus.isSelected())
    {
        JOptionPane.showMessageDialog(this,"You have selected a day intercity bus package");
    }
     
         
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


            
}
