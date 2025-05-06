package gr.aueb.cf.java.ch6;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Δώστε 6 αριθμούς");

        for(int i = 0; i < 6; i++){
            System.out.print(i+1 + "ος: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(notMoreThanThreeEven(arr));
        System.out.println(notMoreThanThreeOdd(arr));
        System.out.println(notMoreThanThreeConsecutive(arr));
        System.out.println(notMoreThanThreeSameDigits(arr));

    }

    public static boolean notMoreThanThreeEven(int[] arr){

        int count = 0;

        for(int i = 0 ; i < arr.length; i++){

            if(arr[i] % 2 == 0){
                count++;
            }
        }

        if ( count > 3){
            return false;
        }

        return true;
    }

    public static boolean notMoreThanThreeOdd(int[] arr){

        int count = 0;

        for(int i = 0 ; i < arr.length; i++){

            if(!(arr[i] % 2 == 0)){
                count++;
            }
        }

        if ( count > 3){
            return false;
        }

        return true;
    }

    public static boolean notMoreThanThreeConsecutive(int[] arr) {

        int maxConsecutive = 1;
        int currentConsecutive = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                currentConsecutive++;
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
            } else {
                currentConsecutive = 1;
            }
        }

        return maxConsecutive <= 3;
    }

    public static boolean notMoreThanThreeSameDigits(int[] arr){

        // Πίνακας για να μετράμε πόσοι αριθμοί λήγουν σε κάθε ψηφίο (0-9)
        int[] lastDigitCounts = new int[10];

        for (int el : arr) {
            int lastDigit = Math.abs(el % 10); // Εξασφαλίζουμε θετικό ψηφίο
            lastDigitCounts[lastDigit]++;

            // Αν βρεθεί 4+ αριθμοί με ίδιο λήγον, επιστροφή false
            if (lastDigitCounts[lastDigit] > 3) {
                return false;
            }
        }

        System.out.println(Arrays.toString(lastDigitCounts));

        return true; // Αν όλα είναι ΟΚ

    }

    public static boolean hasNoMoreThanThreeInSameDecade(int[] numbers) {

        // Αν οι αριθμοί είναι μεταξύ 1-100, αρκούν 10 δεκάδες (1-10, 11-20, …, 91-100)
        int[] decadeCounts = new int[10]; // 10 θέσεις (0-9), όπου 0 = 1-10, 1 = 11-20, κ.λπ.

        for (int number : numbers) {
            // Υπολογίζουμε τη δεκάδα (0-9)
            int decade = (number - 1) / 10;

            // Αν ο αριθμός είναι πολύ μεγάλος (π.χ., >100), χρειαζόμαστε μεγαλύτερο πίνακα
            if (decade >= decadeCounts.length) {
                // Επεκτείνουμε τον πίνακα (εδώ απλά απορρίπτουμε μεγάλες δεκάδες)
                continue; // ή κάντε throw new IllegalArgumentException("Αριθμός εκτός εύρους");
            }

            decadeCounts[decade]++; // Αυξάνουμε τον μετρητή της δεκάδας

            // Αν βρεθεί 4+ αριθμοί στην ίδια δεκάδα, επιστροφή false
            if (decadeCounts[decade] > 3) {
                return false;
            }
        }

        return true; // Αν όλες οι δεκάδες έχουν ≤ 3 αριθμούς
    }

}
