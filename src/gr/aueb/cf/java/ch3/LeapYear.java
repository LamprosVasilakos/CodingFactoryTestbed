package gr.aueb.cf.java.ch3;

import java.util.Scanner;

/**
 * App that tests if the year that a user inputs,
 * is a leap year (366 days) or not.
 */
public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the year: ");
        int inputYear = scanner.nextInt();

        if((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0) {
            System.out.printf("The year %d is a leap year.", inputYear);
        }
        else {
            System.out.printf("The year %d is not a leap year.", inputYear);
        }
    }
}
