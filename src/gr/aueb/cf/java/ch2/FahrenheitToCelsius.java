package gr.aueb.cf.java.ch2;

import java.util.Scanner;

/**
 * App that converts temperature that the user inputs,
 * from Fahrenheit to Celsius.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the temperature in degrees Fahrenheit (integer): ");
        int tempFahrenheit = scanner.nextInt();

        int tempCelsius = 5 * (tempFahrenheit - 32)/9;
        System.out.printf("The temperature in degrees Celsius is %d", tempCelsius);

    }
}
