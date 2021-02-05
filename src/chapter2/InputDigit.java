package Excercises;

/* Write an application that inputs one number consisting of five digits from the user, separates the number
   into its individual digits and prints the digits separated from one another by three spaces each. For
   example, if the user types in the number 42339, the program should print. Assume that the user enters the
   correct number of digits. What happens when you enter a number with more than five digits? What happens
   when you enter a number with fewer than five digits? [Hint: It’s possible to do this exercise with the
   techniques you learned in this chapter. You’ll need to use both division and remainder operations to
    “pick off ” each digit.] */

import java.util.Scanner;

public class InputDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int reverse = 1;



        System.out.println("Kindly enter number");
        number = input.nextInt();

        reverse = (reverse * 10) + (number % 10);
        number /= 10;

        System.out.println("Reverse number is" + reverse);





    }


}
