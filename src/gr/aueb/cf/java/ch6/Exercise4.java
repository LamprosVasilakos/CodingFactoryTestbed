package gr.aueb.cf.java.ch6;

public class Exercise4 {

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = -1;
        int high = -1;

        // Ψάχνουμε το πρώτο εμφάνιση του κλειδιού
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        // Αν βρέθηκε το κλειδί, ψάχνουμε την τελευταία εμφάνιση
        if (low != -1) {
            high = low;
            for (int i = low + 1; i < arr.length; i++) {
                if (arr[i] == key) {
                    high = i;
                } else {
                    break; // Ο πίνακας είναι ταξινομημένος, οπότε σταματάμε
                }
            }
        }

        return new int[]{low, high};
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] result = getLowAndHighIndexOf(arr, key);

        if (result[0] == -1) {
            System.out.println("Το κλειδί " + key + " δεν βρέθηκε στον πίνακα.");
        } else {
            System.out.println("Για το κλειδί " + key + " τα indexes είναι: {" + result[0] + ", " + result[1] + "}");
        }
    }

}
