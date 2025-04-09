package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * App that emulates a running menu where the user
 * can enter keyboard commands.
 */
public class MenuApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String menu = """
                1. Εισαγωγή
                2. Διαγραφή
                3. Ενημέρωση
                4. Αναζήτηση
                5. Έξοδος""";
        System.out.println("Καλωσήρθατε στο μενού.");


        while (true) {
            System.out.println(menu);
            System.out.print("Διαλέξτε μία από τις παραπάνω επιλογές (1-5): ");

            int userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("Επιλέξατε Εισαγωγή.");
                continue;
            }
            if (userInput == 2) {
                System.out.println("Επιλέξατε Διαγραφή.");
                continue;
            }
            if (userInput == 3) {
                System.out.println("Επιλέξατε Ενήμερωση.");
                continue;
            }
            if (userInput == 4) {
                System.out.println("Επιλέξατε Αναζήτηση.");
                continue;
            }
            if (userInput == 5) {
                System.out.println("Έξοδος από το μενού.");
                break;

            }

            System.out.printf("Η επιλογή %d δεν υπάρχει στο μενού.\n", userInput);


        }
    }
}