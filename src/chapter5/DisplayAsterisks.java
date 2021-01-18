package chapter5;
 /* One interesting application of computers is to display graphs and bar charts. Write an application that reads
        five numbers between 1 and 30. For each number that’s read, your program should display the same number
        of adjacent asterisks. For example,if your program reads the number 7, it should display *******.
        Display the bars of asterisks after you read all five numbers. */

import java.util.Scanner;

    public class DisplayAsterisks {

    public static void main(String[] args) {    // declare main method

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int counter;

        System.out.println("Enter first number between 1 - 30");
        number1 = input.nextInt();


            if (number1 <= 30) {
                for (counter = 1; counter <= number1; counter++) {

                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("You entered an invalid number");
            }



        System.out.println("Enter second number between 1 - 30");
        number2 = input.nextInt();

        if (number2 <= 30){
            for (counter = 1; counter <= number2; counter++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        else {
            System.out.println("You entered an invalid number");
        }

        System.out.println("Enter third number between 1 - 30");
        number3 = input.nextInt();

        if (number3 <= 30){
            for (counter = 1; counter <= number3; counter++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        else {
            System.out.println("You entered an invalid number");
        }

        System.out.println("Enter fourth number between 1 - 30");
        number4 = input.nextInt();
        if (number4 <= 30){
            for (counter = 1; counter < number2; counter++ ){
                System.out.print("*");
            }
        }
        else {
            System.out.println("You entered an invalid number");
        }

        System.out.println("Enter fifth number between 1 - 30");
        number5 = input.nextInt();
        if (number5 <= 30){
            for (counter = 1; counter < number5; counter++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        else {
            System.out.println("You entered an invalid number");
        }
    }
    }










