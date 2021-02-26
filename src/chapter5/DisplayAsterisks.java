package chapter5;
 /* One interesting application of computers is to display graphs and bar charts. Write an application that reads
        five numbers between 1 and 30. For each number that’s read, your program should display the same number
        of adjacent asterisks. For example,if your program reads the number 7, it should display *******.
        Display the bars of asterisks after you read all five numbers. */

import java.util.Scanner;

    public class DisplayAsterisks {

        public static void main(String[] args) {    // declare main method

            Scanner input = new Scanner(System.in);
            int number = 0;


            for (int counter = 1; counter <= 5; counter++) {
                System.out.println("Enter number between 1 - 30");
                number = input.nextInt();

                if (number <= 30) {
                    for (int j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    System.out.println("invalid input");
                    System.out.println("Enter number between 1 - 30, wimp");

                    int num = input.nextInt();
                    if (num <= 30) {
                        for (int k = 1; k <= num; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                        // continue;
                    }
                }
                //  break;


            }
        }
    }















