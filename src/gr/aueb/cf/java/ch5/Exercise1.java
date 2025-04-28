package gr.aueb.cf.java.ch5;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int starsNum = getStarsNum();
        int choice;

        do {
            System.out.println("------------------------------------------");
            printMenu(starsNum);
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> printStarsHorizontally(starsNum);
                case 2 -> printStarsVertically(starsNum);
                case 3 -> printStars3(starsNum, starsNum);
                case 4 -> printStars4(starsNum);
                case 5 -> printStars5(starsNum);
                case 6 -> System.out.println("Επιτυχής Έξοδος");
                default -> System.out.println("Λάθος επιλογή");
            }
        } while (choice != 6);

    }

    public static int getStarsNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ παραθέστε τον αριθμό των αστεριών");
        int starsNum = scanner.nextInt();

        while (starsNum <= 1){
            System.out.println("Παρακαλώ παραθέστε έναν αριθμό αστεριών μεγαλύτερο του 1\n");
            starsNum = scanner.nextInt();
        }
        return starsNum;
    }

    public static void printMenu(int starsNum){

        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
        System.out.printf("1. Εμφάνισε %d αστεράκια οριζόντια\n",starsNum);
        System.out.printf("2. Εμφάνισε %d αστεράκια κάθετα\n",starsNum);
        System.out.printf("3. Εμφάνισε %d γραμμές με %d αστεράκια\n",starsNum, starsNum);
        System.out.printf("4. Εμφάνισε %d γραμμές με αστεράκια 1 έως %d\n",starsNum, starsNum);
        System.out.printf("5. Εμφάνισε %d γραμμές με αστεράκια %d έως 1\n",starsNum, starsNum);
        System.out.println("6. Έξοδος από το πρόγραμμα");

    }

    public static void printStarsHorizontally(int starsNum){

        for(int i=0; i<starsNum; i++){
            System.out.print("* ");
        }

    }

    public static void printStarsVertically(int starsNum){
        for(int i=0; i<starsNum; i++){
            System.out.println("*");
        }
    }

    public static void printStars3(int starsNum, int rows){
        for(int i = 0; i < rows; i++) {
            printStarsHorizontally(starsNum);
            System.out.println();
        }
    }

    public static void printStars4(int rows){
        for(int i = 1; i <= rows; i++) {
            printStarsHorizontally(i);
            System.out.println();
        }
    }

    public static void printStars5(int rows){
        for(int i = rows; i >= 1; i--) {
            printStarsHorizontally(i);
            System.out.println();
        }
    }

}
