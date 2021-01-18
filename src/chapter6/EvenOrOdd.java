package chapter6;
/*(Even or Odd) Write a method isEven that uses the remainder operator (%) to determine whether an integer is even.
The method should take an integer argument and return true if the integer is even and false otherwise. Incorporate
this method into an application that inputs a sequence of integers (one at a time) and determines whether each is
even or odd. */

import java.util.Scanner;

public class EvenOrOdd {

    public static String isEven(int firstInt) {

        if (firstInt % 2 == 0) {

            return ("Number is Even");

        }
        else {

            return ("Number is Odd");
        }

    }

}

class EvenOrOddTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nums;
        int counter = 0;

        while (counter <= 5) {

            System.out.println("Enter number to decide if its even or odd");
            nums = input.nextInt();


            EvenOrOdd.isEven(nums);


            System.out.println(EvenOrOdd.isEven(nums));
            counter++;

        }
    }
}
