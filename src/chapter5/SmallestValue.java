package chapter5;

/* (Find the Smallest Value) Write an application that finds the smallest of several integers.
        Assume that the first value read specifies the number of values to input from the user. */

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digit;
        int counter;
        int smallestNumber = 0;
        int initialNumber;

        System.out.println("Enter a digit to know the number of input to display");
        initialNumber = input.nextInt();


        for (counter = 1; counter < initialNumber; counter++) {

            smallestNumber = initialNumber;


            System.out.println("Enter next digit");
            digit = input.nextInt();

            if (digit < smallestNumber) {
                smallestNumber = digit;
            }

        }
        System.out.printf("Smallest number is %d\n", smallestNumber);

    }
}
