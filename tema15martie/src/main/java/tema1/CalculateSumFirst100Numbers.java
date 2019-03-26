package tema1;

/**
 * Property of Alex Virastau
 */
public class CalculateSumFirst100Numbers {
    /**
     * this method calculates the sum of the first 100 numbers higher than 0
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of the first 100 numbers higher than 0 is " + sum);


    }
}