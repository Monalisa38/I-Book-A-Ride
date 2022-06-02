    package pkg603_assignment2;


    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */

    /**
     *
     * @author Monalisa
     */
    public class Controller extends KeyAdapter implements ActionListener, KeyListener{

          public TravelApp travelApp;
          public PersonalDetailsDB pd;
          public TravelDetailsDB td;
          public PaymentDetailsDB pymd;
          public Travel travel;
          public IntercityOptions io;



          /**
          * @param travelApp
          * @param pd
         * @param td
         * @param pymd
         * @param md
          */

            public Controller(TravelApp travelApp, PersonalDetailsDB pd, TravelDetailsDB td, PaymentDetailsDB pymd )
            {
                this.travelApp = travelApp; // travel gui
                this.pd = pd; // personaldetails
                this.td = td;  //traveldetails
                this.pymd = pymd; // paymentdetails
                this.travelApp.addActionListener(this); //add action listener of this class to the travelapp
                this.travelApp.addKeyListener(this);
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
                    String peoples = this.travelApp.peopleField.getText();
                    String travelType = "0";

                    if(this.travelApp.BusRB.isSelected())
                    {
                          travelType = "0";
           
              this.travelApp.totalCost.addActionListener(this); 


                    }
                    else if(this.travelApp.trainRB.isSelected())
                    {
                           travelType  = "1";
                    }
                    else if(this.travelApp.ferryRB.isSelected())
                    {
                           travelType  = ":2";
                    }
                    else if(this.travelApp.taxiRB.isSelected())
                    {
                        travelType = "3";
                    }
                    else if (this.travelApp.premiumTaxiRB.isSelected())
                    {
                        travelType = "4";
                    }
                       else if (this.travelApp.hamiltonRB.isSelected())
                    {
                        travelType = "5";
                    }       
                    
                       else if(this.travelApp.RotoruaRB.isSelected())
                    {
                        travelType = "6";
                    }
                    else if (this.travelApp.NapierRB.isSelected())
                    {
                        travelType = "7";
                    }
                       else if (this.travelApp.WellingtonRB.isSelected())
                    {
                        travelType = "8";
                    }       
                                     
                 String date= this.travelApp.dateBox.getSelectedItem().toString();
                 String month = this.travelApp.monthbox.getSelectedItem().toString();
                 String year = this.travelApp.yearBox.getSelectedItem().toString();
                 this.td.addTravelDetails(travelType,peoples, date, month, year);
                     break;
                case "CONFIRM STEP3":
                    String PaymentMethod = "0";
                    if(this.travelApp.visaRB.isSelected())
                    {
                        PaymentMethod = "0";
                    }
                    
                    if(this.travelApp.mastercardRB.isSelected())
                    {
                        PaymentMethod = "1";
                    }
                    if(this.travelApp.aeRB.isSelected())
                    {
                        PaymentMethod = "2";
                    }
                    
                    String MM = this.travelApp.cardMM.getSelectedItem().toString();
                    String YY = this.travelApp.cardYear.getSelectedItem().toString();
                    
                    String cardName = this.travelApp.cardholdersnameField.getText();
                    String cardNumber = this.travelApp.cardNumberField.getText();
                    
                    this.pymd.addPaymentDetails(PaymentMethod, cardName, cardNumber, MM, YY);
                    break;
            }
                    

        }

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
             
        }

        @Override
        public void keyReleased(KeyEvent e) {
             String p = this.travelApp.peopleField.getText();
             if (p.length() > 0)
             {
                 int people = Integer.parseInt(p);
                  if(this.travelApp.BusRB.isSelected())
                  {
                     travel = new Bus(people);
                     String total = Double. toString(travel.CaculatePrice()) ;
                     this.travelApp.totalCost.setText(total);
                  }
             }
             if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.trainRB.isSelected())
                 {
                     travel = new Train(people);
                     String total = Double.toString(travel.CaculatePrice());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.ferryRB.isSelected())
                 {
                     travel = new Ferry(people);
                     String total = Double.toString(travel.CaculatePrice());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.taxiRB.isSelected())
                 {
                     travel = new Taxi(people);
                     String total = Double.toString(travel.CaculatePrice());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             
             if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.premiumTaxiRB.isSelected())
                 {
                     travel = new PremiumTaxi(people);
                     String total = Double.toString(travel.CaculatePrice());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             
               if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.hamiltonRB.isSelected())
                 {
                     io = new Hamilton(people);
                     String total = Double.toString(io.CalculateTotal());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             
                if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.RotoruaRB.isSelected())
                 {
                     io = new Rotorua(people);
                     String total = Double.toString(io.CalculateTotal());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             
                if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.NapierRB.isSelected())
                 {
                     io = new Napier(people);
                     String total = Double.toString(io.CalculateTotal());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             
                if(p.length() >0)
             {
                 int people = Integer.parseInt(p);
                 if(this.travelApp.WellingtonRB.isSelected())
                 {
                     io = new Wellington(people);
                     String total = Double.toString(io.CalculateTotal());
                     this.travelApp.totalCost.setText(total);
                 }
             }
             
             
             else
             {
                 this.travelApp.totalCost.setText("");
             }
        }

    }
