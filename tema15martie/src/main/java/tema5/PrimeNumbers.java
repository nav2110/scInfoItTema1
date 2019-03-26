package tema5;

import java.util.Scanner;

/**
 * Property of Alex V
 */
public class PrimeNumbers {
    /**
     * Display all the prime numbers lower than a given number
     */
    public static void main(String[] args) {
        /**
         * A prime number is divisible only by itself and 1.
         * We create a loop until the given number and check whether each element isPrime.
         * For each loop we call a method isPrime that reaturns boolean.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your number ");
        int n = scanner.nextInt();

        System.out.println("The list of prime numbers smaller than " + n + " is: ");

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i); 
            }
        }
    }

    //this method checks if the counter i is divisible only by itself and 1
    public static boolean isPrime(int i) {
        boolean prime = true;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
