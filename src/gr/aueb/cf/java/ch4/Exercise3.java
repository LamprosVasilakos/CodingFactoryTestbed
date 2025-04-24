package gr.aueb.cf.java.ch4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3.1
        System.out.println("Παρακαλώ επιλέξτε έναν αριθμό από το 1 έως το 7.");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> System.out.println("Δευτέρα");
            case 2 -> System.out.println("Τρίτη");
            case 3 -> System.out.println("Τετάρτη");
            case 4 -> System.out.println("Πέμπτη");
            case 5 -> System.out.println("Παρασκευή");
            case 6 -> System.out.println("Σάββατο");
            case 7 -> System.out.println("Κυριακή");
            default -> System.out.println("Λάθος επιλογή. Παρακαλώ επιλέξτε έναν αριθμό από το 1 έως το 7.");
        }

        // 3.2
        System.out.println("Παρακαλώ δώστε δύο ακεραίους αριθμούς.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Παρακαλώ παραθέστε ένα από τα παρακάτω σύμβολα: +, -, *, /.");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            default -> System.out.println("Μη έγκυρο σύμβολο. Παρακαλώ παραθέστε ένα από τα παραπάνω σύμβολα.");
        }

        // 3.3
        System.out.println("Παρακαλώ παραθέστε ένα φωνήεν.");
        char letter = Character.toUpperCase(scanner.next().charAt(0));
        boolean bool;
        bool = switch (letter){
            case 'A' -> true;
            case 'Ο' -> true;
            case 'Ι' -> true;
            case 'Η' -> true;
            case 'Υ' -> true;
            case 'Ω' -> true;
            default -> false;
        };
        System.out.println(bool);

    }
}
