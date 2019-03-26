package tema4;

import java.util.Scanner;

/**
 * Property of Alex V
 */

public class Palindrom {
    /**
     * Check if a number is a palindrom( e.g palindrom 1221, 34143)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number ");
        int n = scanner.nextInt();

        /**
         * parse the number into a String array and compare the i and length-i+1 characters in a for loop
         */

        String characters = Integer.toString(n);
        boolean isAPalindrom = true;

        for (int i = 0; i < characters.length(); i++) {

            if (characters.charAt(i) != characters.charAt(characters.length() - 1 - i)) {
                isAPalindrom = false;
            }
        }

        if (isAPalindrom) {
            System.out.println(n + " is a palindrom.");
        } else {
            System.out.println(n + " is NOT a palindrom.");
        }


    }
}
