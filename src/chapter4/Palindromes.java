package chapter4;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int counter = 0;
//        int reverse = 0;
//
//        int temp = 0;
//        while (counter <= 5) {
//            System.out.println("Enter number");
//            int num = input.nextInt();
//            temp = num;
//            int pal = num % 10;
//            reverse = reverse * 10 + pal;
//
//            counter++;
//        }
//
//        if (temp == reverse) {
//            System.out.println("The number is a palindrome!");
//        } else {
//            System.out.println("The number isn't a palindrome!");
//        }
        int r;
        int sum = 0;
        int temp = 0;
        int counter = 0;
        int num = 0;

        while (counter < 5) {
            System.out.println("Enter number");
            num = input.nextInt();
            counter++;
        }
        temp = num;
            if (num > 0) {
                r = num % 10;  //getting remainder
                sum = (sum * 10) + r;
                temp /= 10;
            }
            counter++;

            if (temp == sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
}


