package pkg603_assignment2;

import java.util.Scanner;

/**
 *
 * @author Monalisa
 */

public class ScannerUtil {
    public static int getUserInputInt(Scanner scan, int min, int max) { /* a class for scaning invalid userin int input and re-prompt them*/
        boolean isValid = false;


        while (!isValid) {
            String userinput = userinput = scan.nextLine();

            Integer num;
            try {
                if (userinput.equalsIgnoreCase("q")) {
                    System.out.println("You have exited the system.");
                    System.exit(0);
                }
                num = Integer.parseInt(userinput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! your input needs to be between " + min + " and " + max);
                continue;
            }



            if (num == null) {
                System.out.println("\n");
                System.out.println("Invalid input! your input needs to be between " + min + " and " + max);
                continue;
            } else if (num < min || num > max) {
                System.out.println("Invalid input! your input needs to be between " + min + " and " + max);
                continue;

            }
            isValid = true;
            return num;

        }
        return 0;
    }



}