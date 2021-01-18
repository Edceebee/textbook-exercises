package chapter6;

/* (Find the Minimum) Write a method minimum3 that returns the smallest of three floating point numbers.
Use the Math.min method to implement minimum3. Incorporate the method into an application that reads three
values from the user, determines the smallest value and displays the result. */

import java.util.Scanner;

public class FindTheMinimum {

    public static float smallestNumber(float num1, float num2, float num3) {

        return Math.min(Math.min(num1, num2), num3);
    }

}

class FindTheMinimumTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float num1;
        float num2;
        float num3;

        System.out.println("Enter first number");
        num1 = input.nextFloat();

        System.out.println("Enter second number");
        num2 = input.nextFloat();

        System.out.println("Enter third number");
        num3 = input.nextFloat();


        System.out.println("Smallest number is:");
        System.out.println(FindTheMinimum.smallestNumber(num1, num2, num3));
    }


}
