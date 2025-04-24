package gr.aueb.cf.java.ch4;

public class Exercise2 {

    public static void main(String[] args) {

        // 2.1
        for( int i = 1; i <= 20; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }


        // 2.2
        int sum = 0;
        for(int i=1; i<=50; i++){
            sum += i;
        }
        System.out.println(sum);

        // 2.3
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        // 2.4
        int rows = 4; // Αριθμός σειρών

        for (int i = 1; i <= rows; i++) {
            // Εκτύπωση κενών πριν από τα αστερίσκια
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Εκτύπωση αστεριών
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Νέα γραμμή μετά από κάθε σειρά
            System.out.println();
        }
    }
}


