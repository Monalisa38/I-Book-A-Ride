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
          Travel[] travel = new Travel[6];


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
                         int people = 0;
                    if(this.travelApp.BusRB.isSelected())
                    {
                          travelType = "0";
           
              this.travelApp.totalCost.addActionListener(this);  travel[0] = new Bus(people);

                travel[0].CaculatePrice();

                System.out.printf("You have booked a " + travel[0].travelType);
                System.out.println("The total cost is $" + travel[0].price + "0");
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

    }
