package gr.aueb.cf.java.ch6;

public class Exercise1 {

    public static void main(String[] args) {
//        System.out.println(getMaxPosition(new int[]{1,10,3,4,5},0,4));
        System.out.println(findSecondSmallest(new int[]{1, 10, 20, 4, -1, -1}));
    }

    public static int getMaxPosition(int[] arr, int low, int high) {

        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int maxPos = low;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Ο πίνακας πρέπει να έχει τουλάχιστον 2 στοιχεία");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Ελέγχουμε αν όλα τα στοιχεία είναι ίδια
        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Όλα τα στοιχεία του πίνακα είναι ίδια");
        }

        return secondSmallest;
    }

}