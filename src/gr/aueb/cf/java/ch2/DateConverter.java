package gr.aueb.cf.java.ch2;

import java.util.Scanner;

/**
 * Accepts the integer values of day, month, year from the user and
 * returns the date in the following format DD/MM/YY.
 */
public class DateConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the integer value of the day: ");
        int day = scanner.nextInt();
        System.out.print("Please provide the integer value of the month: ");
        int month = scanner.nextInt();
        System.out.print("Please provide the integer value of the year: ");
        int year = scanner.nextInt();

        int dayLeftDigit = day / 10;
        int dayRightDigit = day % 10;

        int monthLeftDigit = month  / 10;
        int monthRightDigit = month % 10;

        int yearDigits = year % 100;

        int yearLeftDigit = yearDigits  / 10;
        int yearRightDigit = yearDigits % 10;

        System.out.printf("The date is %d%d/%d%d/%d%d", dayLeftDigit, dayRightDigit, monthLeftDigit, monthRightDigit, yearLeftDigit, yearRightDigit);
    }

}
