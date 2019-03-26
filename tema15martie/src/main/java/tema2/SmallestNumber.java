package tema2;
/**
 * Property of Alex Virastau
 */

import java.util.Scanner;
/**
 *  Calculate the smallest number in the array 
 */

public class SmallestNumber {

    public static void main(String[] args) {
        //First gather the length of the array and populate the array from user's input
        System.out.println("Introduce the number of numbers in your array: ");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int [] array=new int[length-1];

        for (int i=0;i<array.length;i++){
            System.out.println("Introduce number at position "+(i+1)+".");
            array[i]=scanner.nextInt();
        }

        /*
        *Assign min value to first element and
        * compare with the rest of the elements in the array
         */
        int min=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
            
        }

        System.out.println("The smallest number is "+min);

    }



}
