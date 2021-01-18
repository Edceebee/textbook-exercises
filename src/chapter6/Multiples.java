package chapter6;

/* (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the second integer is a
multiple of the first. The method should take two integer arguments and return true if the second is a multiple of
the first and false otherwise. [Hint: Use the remainder operator.] Incorporate this method into an application
that inputs a series of pairs of integers (one pair at a time) and determines whether the second value in each
pair is a multiple of the first. */

import java.util.Scanner;

public class Multiples {



        public static boolean isMultiple(int firstInt, int secondInt)
        {
            if (secondInt % firstInt == 0)
                return true;
            else
                return false;
        }
    }

class MultiplesTest{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number1;
        int number2;

        System.out.println("Enter first number");
        number1 = input.nextInt();

        System.out.println("Enter second number");
        number2 = input.nextInt();



        System.out.println((Multiples.isMultiple(number1, number2)));


    }

}