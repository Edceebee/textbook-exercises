package chapter4;

/* (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find the two largest values of the 10
    values entered. [Note: You may input each number only once.]  */


import java.util.Scanner;

public class FindTwoLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largestNumber = 0;
        int secondLargestNumber = 0;
        int counter = 1;

        while (counter <= 4) {

            System.out.println("Enter number to compare");
            number = input.nextInt();

            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            }

            if (number < largestNumber) {
                if (number > secondLargestNumber) {
                    secondLargestNumber = number;
                }
            }

            counter++;
        }
        System.out.printf("largest Number is %d%n", largestNumber);
        System.out.printf("second Largest Number is %d%n", secondLargestNumber);

    }
}
