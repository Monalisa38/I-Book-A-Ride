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
public class Details {

    Scanner scan = new Scanner(System.in); /*create scanner*/


    public Details() {

        /*variables*/
        String fname = "";
        String lname = "";
        String phone = "";
        String email = "";
        boolean valid;


        /*read and print input about the services provided */
        try {
            FileReader fr = new FileReader("./Text_Files/I_Book_A_Ride");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;
            while ((line = inputStream.readLine()) != null)
                System.out.println(line);

            inputStream.close();

        }
        /*exceptions*/
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading theis file!");
        }



        /* read and print from the file to understand how the system works*/
        try {
            FileReader fr1 = new FileReader("./Text_Files/Help");
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

        System.out.println("\n");
        System.out.println("Welcome to I Book a Ride!");
        System.out.println("Input 'q' to exit at any time.");
        System.out.println("\n");
        System.out.println("Please enter your name");

        /* start the CUI, prompt users for the personal details regarding their booking*/

        try {
            System.out.println("First Name: ");
            fname = scan.nextLine();
            System.out.println("Last Name: ");
            lname = scan.nextLine();
            System.out.println("\n");

            System.out.println("Please enter your contact details");
            System.out.println("Phone number (10 digits):");
            do {
                phone = scan.nextLine();
                valid = phone.length() == 10;
                if (!valid) {
                    System.out.println("Invalid Input"); /* if the user inputs something else, they will be prompted again*/
                }
            }
            while (!valid);


            System.out.println("Email address:");
            email = scan.nextLine();


            /* write the inputs from the user in the file to save their data*/
            try {
                FileWriter fw = new FileWriter("./Text_Files/Details.txt", true);
                try (BufferedWriter bf = new BufferedWriter(fw)) {
                    bf.write("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                    bf.write("\n");
                    bf.write("Booking entered on: " + new java.util.Date()); /*the date and the time of the booking*/
                    bf.write("\n");
                    bf.write("Personal Details: " + fname.toUpperCase() + " " + lname.toUpperCase());
                    bf.write("\n");
                    bf.write("Contact Details: " + phone + "\n" + email + "\n");
                    bf.write("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                    bf.write("\n");
                }

            } catch (IOException e) {
                System.err.println("Error while writing to file: " + e.getMessage()); /*exceptions*/
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
            System.exit(0);
        }





    }


}