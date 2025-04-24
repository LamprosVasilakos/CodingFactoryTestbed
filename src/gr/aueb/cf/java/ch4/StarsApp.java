package gr.aueb.cf.java.ch4;

import java.util.Scanner;

/**
 * Prints a sequence of stars '*' using the
 * for loop.
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("* ");
        }

        System.out.println("\n---------------");

        for(int i=0; i<n; i++){
            System.out.println('*');
        }

        System.out.println("---------------");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        for (int i = 0; i < n; i++) {

            for (int j = 0 ; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        for(int i = n ; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




