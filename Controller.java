package pkg603_assignment2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Monalisa
 */
public class Controller implements ActionListener {

      public TravelApp travelApp;
      public PersonalDetailsDB pd;
      public TravelDetailsDB td;
      public PaymentDetailsDB pymd;
      public MembershipDetailsDB md;
      
      /**
      * @param travelApp
      * @param pd
     * @param td
     * @param pymd
     * @param md
      */
      
        public Controller(TravelApp travelApp, PersonalDetailsDB pd, TravelDetailsDB td, PaymentDetailsDB pymd, MembershipDetailsDB md )
        {
            this.travelApp = travelApp; // travel gui
            this.pd = pd; // personaldetails
            this.td = td;  //traveldetails
            this.pymd = pymd; // paymentdetails
            this.md = md; //membershipdetails
            this.travelApp.addActionListener(this); //add action listener of this class to the travelapp
        }
        
      /**
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println("action command " +command );
        switch(command){
            case "CONFIRM STEP1":
                String name = this.travelApp.nameField.getText();
                String email = this.travelApp.emailField.getText();
                String phone = this.travelApp.phoneField.getText();
                String age = this.travelApp.ageField.getText();
                this.pd.addPersonalDetails(name,email,phone,age);
                break;
            case "CONFIRM STEP2":
                break;
            case "CONFIRM STEP3":
                break;
            case "CONFIRM STEP4":
                break;
                
                
        }
    }
    
}
