/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg603_assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Monalisa
 */
public class PaymentMethodDetails {
    public PaymentMethodDetails() { /* user payment details class*/
        Scanner scan = new Scanner(System.in);
        String cardNumber = "";
        String cardName = "";
        String cardType = "";
        int cardCvv = 0;
        String cardExpiryDate = "";
        String membershipQuery = "";
        boolean valid;


        try {
            System.out.println("\n");
            do {
                System.out.println("Please select a payment method. V for Visa, M for Mastercard and A for American Express: "); /* card type options*/
                cardType = scan.nextLine();
                valid = ("V".equals(cardType) || ("v".equals(cardType) || ("m".equals(cardType) || ("A".equals(cardType) || ("a".equals(cardType) || ("M".equals(cardType)))))));
                if (!valid) {
                    System.out.println("Invalid Input");
                }
            }
            while (!valid); /*prompt the user again if invalid input is entered*/

            System.out.println("Card holder's name: ");
            cardName = scan.nextLine();
            System.out.println("\n");

            System.out.println("Please enter your card number (16 Digits): ");
            do {
                cardNumber = scan.nextLine();
                valid = cardNumber.length() == 16;
                if (!valid) {
                    System.out.println("Invalid Input");
                }
            }
            while (!valid);


            do {
                System.out.println("Expiration Date(MM/YY): ");
                cardExpiryDate = scan.nextLine();
                valid = cardExpiryDate.length() == 5;
                if (!valid) {
                    System.out.println("Invalid Input");
                }
            }
            while (!valid);


            System.out.println("CVV (3 digits): ");
            cardCvv = ScannerUtil.getUserInputInt(scan, 001, 999);

            System.out.println("\n");

            try {
                FileReader fr1 = new FileReader("./Text_Files/Contact_Us");
                BufferedReader inputStream1 = new BufferedReader(fr1);
                String line = null;
                while ((line = inputStream1.readLine()) != null)
                    System.out.println(line);

                inputStream1.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            } catch (IOException e) {
                System.out.println("Error reading theis file!");
            }

            try {
                FileReader fr = new FileReader("./Text_Files/Membership_Soon");
                BufferedReader inputStream = new BufferedReader(fr);
                String line = null;
                while ((line = inputStream.readLine()) != null)
                    System.out.println(line);

                inputStream.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            } catch (IOException e) {
                System.out.println("Error reading this file!");
            }


            membershipQuery = scan.nextLine();
            System.out.println("Thank you choosing I Book A Ride!");
            System.out.println("\n");


            try {
                FileWriter fw = new FileWriter("./Text_Files/Details.txt", true); /* write the details into the text file */
                try (BufferedWriter bf = new BufferedWriter(fw)) {
                    bf.write("\n");
                    bf.write("Payment Details : " + cardType + "\n");
                    bf.write("Card Name: " + cardName.toUpperCase() + "\n");
                    bf.write("Card Number " + cardNumber + "\n");
                    bf.write("Card Expiry Date: " + cardExpiryDate + "\n");
                    bf.write("Card CVV: " + cardCvv + "\n");
                    bf.write("Keen on membership?  " + membershipQuery + "\n");
                    bf.write("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                    bf.write("\n");

                }

            } catch (IOException e) {
                System.err.println("Error while writing to file: " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }

}