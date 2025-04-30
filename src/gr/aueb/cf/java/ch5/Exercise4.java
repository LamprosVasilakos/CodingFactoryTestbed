package gr.aueb.cf.java.ch5;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }


    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
