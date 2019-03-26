package tema3;

import java.util.Scanner;

/**
 *Property of Alex V
 */
public class MaxDigit {
    /**
     * the method returns the smallest digit in a number
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your number ");
        int n = scanner.nextInt();

        /**
         * we are going to obtain each digit by dividing the number "n" by 10 and storing the modulus value into a @digit var;
         * we also need to initialize the "max" value so we set it to the lowest digit possible i.e. 0.
         */
        int max = 0;
        int digit;

        while (n!=0){
            digit=n%10;
            if(digit>max){
                max=digit;
            }
            n=n/10;

        }

        System.out.println("The greatest digit is "+max);

    }
}
