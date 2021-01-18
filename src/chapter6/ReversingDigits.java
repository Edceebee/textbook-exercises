package chapter6;

/* (Reversing Digits) Write a method that takes an integer value and returns the number with
        its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
        the method into an application that reads a value from the user and displays the result. */

import java.util.Scanner;

public class ReversingDigits {

    public static int reverseDigit(int num) {

        int reverse = 0;
        while(num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }
}

class ReversingDigitTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.println("Enter number you want to reverse");
        number = input.nextInt();

        System.out.println(ReversingDigits.reverseDigit(number));

    }
}
