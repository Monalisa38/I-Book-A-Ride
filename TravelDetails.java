package pkg603_assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Monalisa
 */
public class TravelDetails {
    public TravelDetails() /*travel details class*/ {

        PrintWriter pw = null;
        Scanner scan = new Scanner(System.in); /* create scanner*/
        Travel[] travel = new Travel[6]; /* travel array */

        IntercityOptions[] city = new IntercityOptions[4];

        int userinput = 0; /* varaible for the end user to input*/
        int people = 0;
        String month = "";
        int date = 0;
        int year = 0;
        int location = 0;

        System.out.println("\n");

        try {
            FileReader fr = new FileReader("./Text_Files/TravelOptions");
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


        try { /* try catch for any strings inputted by user*/
            userinput = ScannerUtil.getUserInputInt(scan, 1, 6);

            /* allow user to enter input/*
               
               */
            if (userinput == 1) /* depending on the users input, the results for the booking will be printed*/ {
                System.out.println("Please enter the number of people");

                people = ScannerUtil.getUserInputInt(scan, 1, 250);

                System.out.print("Enter Date: ");
                System.out.println("Enter Day(DD): ");
                date = ScannerUtil.getUserInputInt(scan, 1, 31);

                System.out.print("Enter Month: ");
                month = scan.nextLine();

                System.out.print("Enter Year: ");
                year = ScannerUtil.getUserInputInt(scan, 2022, 2025);


                travel[0] = new Bus(people);

                travel[0].CaculatePrice();

                System.out.printf("You have booked a " + travel[0].travelType + " day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                System.out.println("The total cost is $" + travel[0].price + "0");
            }

            if (userinput == 2) {
                System.out.println("Please enter the number of people");

                people = ScannerUtil.getUserInputInt(scan, 1, 250);

                System.out.print("Enter Date ");
                System.out.println("Enter Day(DD): ");
                date = ScannerUtil.getUserInputInt(scan, 1, 31);

                System.out.print("Enter Month: ");
                month = scan.nextLine();

                System.out.print("Enter Year: ");
                year = ScannerUtil.getUserInputInt(scan, 2022, 2025);


                travel[1] = new Train(people);

                travel[1].CaculatePrice();

                System.out.printf("You have booked a " + travel[1].travelType + " day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                System.out.println("The total cost is $" + travel[1].price + "0");

            }


            if (userinput == 3) {
                System.out.println("Please enter the number of people");
                people = ScannerUtil.getUserInputInt(scan, 1, 250);

                System.out.print("Enter Date: ");
                System.out.println("Enter Day(DD): ");
                date = ScannerUtil.getUserInputInt(scan, 1, 31);


                scan.nextLine();

                System.out.print("Enter Month: ");
                month = scan.nextLine();

                System.out.print("Enter Year: ");
                year = ScannerUtil.getUserInputInt(scan, 2022, 2025);


                travel[2] = new Ferry(people);

                travel[2].CaculatePrice();

                System.out.printf("You have booked a " + travel[2].travelType + " day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                System.out.println("The total cost is $" + travel[2].price + "0");

            }


            if (userinput == 4) {
                System.out.println("Please enter the number of people");
                people = ScannerUtil.getUserInputInt(scan, 1, 1000);

                System.out.print("Enter Date: ");
                System.out.println("Enter Day(DD): ");
                date = ScannerUtil.getUserInputInt(scan, 1, 31);

                System.out.print("Enter Month: ");
                month = scan.nextLine();

                System.out.print("Enter Year: ");
                year = ScannerUtil.getUserInputInt(scan, 2022, 2025);



                travel[3] = new Taxi(people);

                travel[3].CaculatePrice();

                System.out.printf("You have booked a " + travel[3].travelType + " day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                System.out.println("The total cost is $" + travel[3].price + "0");

            }



            if (userinput == 5) {
                System.out.println("Please enter the number of people");

                people = ScannerUtil.getUserInputInt(scan, 1, 250);

                System.out.print("Enter Date: ");
                System.out.println("Enter Day(DD): ");
                date = ScannerUtil.getUserInputInt(scan, 1, 31);

                System.out.print("Enter Month: ");
                month = scan.nextLine();

                System.out.print("Enter Year: ");
                year = ScannerUtil.getUserInputInt(scan, 2022, 2025);


                travel[4] = new PremiumTaxi(people);

                travel[4].CaculatePrice();

                System.out.printf("You have booked a " + travel[4].travelType + " day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                System.out.println("The total cost is $" + travel[4].price + "0");
            }


            if (userinput == 6) {
                System.out.println("Where would you like to travel in The North Island?");
                System.out.println("1 Hamilton");
                System.out.println("2 Rotorua");
                System.out.println("3 Napier");
                System.out.println("4 Wellington");
                System.out.println("PS: More cities can be available on demand, contact us for details");

                location = ScannerUtil.getUserInputInt(scan, 1, 4);

                if (location == 1) {

                    people = ScannerUtil.getUserInputInt(scan, 1, 250);

                    System.out.print("Enter Date: ");
                    System.out.println("Enter Day(DD): ");
                    date = ScannerUtil.getUserInputInt(scan, 1, 31);

                    System.out.print("Enter Month: ");
                    month = scan.nextLine();

                    System.out.print("Enter Year: ");
                    year = ScannerUtil.getUserInputInt(scan, 2022, 2025);



                    city[0] = new Hamilton(people);

                    city[0].CalculateTotal();

                    System.out.printf("You have booked a Intercity bus to " + city[0].travelCity + ", a day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                    System.out.println("The total cost is $" + city[0].price + "0");
                }



                if (location == 2) {
                    System.out.println("Please enter the number of people");

                    people = ScannerUtil.getUserInputInt(scan, 1, 250);

                    System.out.print("Enter Date: ");
                    System.out.println("Enter Day(DD): ");
                    date = ScannerUtil.getUserInputInt(scan, 1, 31);

                    scan.nextLine();

                    System.out.print("Enter Month: ");
                    month = scan.nextLine();

                    System.out.print("Enter Year: ");
                    year = ScannerUtil.getUserInputInt(scan, 2022, 2025);



                    city[1] = new Rotorua(people);

                    city[1].CalculateTotal();

                    System.out.printf("You have booked a Intercity bus to " + city[1].travelCity + ", a day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                    System.out.println("The total cost is $" + city[1].price + "0");
                }





                if (location == 3) {
                    System.out.println("Please enter the number of people");

                    people = ScannerUtil.getUserInputInt(scan, 1, 250);

                    System.out.print("Enter Date: ");
                    System.out.println("Enter Day(DD): ");
                    date = ScannerUtil.getUserInputInt(scan, 1, 31);

                    System.out.print("Enter Month: ");
                    month = scan.nextLine();

                    System.out.print("Enter Year: ");
                    year = ScannerUtil.getUserInputInt(scan, 2022, 2025);



                    city[2] = new Napier(people);

                    city[2].CalculateTotal();

                    System.out.printf("You have booked an Intercity bus to " + city[2].travelCity + ", a day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                    System.out.println("The total cost is $" + city[2].price + "0");
                }






                if (location == 4) {
                    System.out.println("Please enter the number of people");

                    people = ScannerUtil.getUserInputInt(scan, 1, 250);

                    System.out.print("Enter Date: ");
                    System.out.println("Enter Day(DD): ");
                    date = ScannerUtil.getUserInputInt(scan, 1, 31);

                    scan.nextLine();

                    System.out.print("Enter Month: ");
                    month = scan.nextLine();

                    System.out.print("Enter Year: ");
                    year = ScannerUtil.getUserInputInt(scan, 2022, 2025);



                    city[3] = new Wellington(people);

                    city[3].CalculateTotal();

                    System.out.printf("You have booked a Intercity bus to " + city[3].travelCity + ", a day pass for " + date + " " + month.toUpperCase() + " " + year + "\n");
                    System.out.println("The total cost is $" + city[3].price + "0");
                }


            }



            try {
                FileWriter fw = new FileWriter("./Text_Files/Details.txt", true);
                try (BufferedWriter bf = new BufferedWriter(fw)) {
                    bf.write("Mode of transport selected: " + userinput + "\n");
                    bf.write("Number of people: " + people + "\n");
                    bf.write("Booking Date: " + date + " " + month.toUpperCase() + " " + year + "\n");
                    bf.write("Booking City: " + location + "\n");
                    bf.write("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                }

            } catch (IOException e) {
                System.err.println("Error while writing to file: " + e.getMessage());
            }


        } catch (InputMismatchException e) {
            System.out.println("No booking made, as you have exited the system.");
            System.exit(0);
        }
    }
}