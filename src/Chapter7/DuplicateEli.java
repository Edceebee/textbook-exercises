package Chapter7;

/* (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
        Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
        is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst
        case,” in which all five numbers are different. Use the smallest possible array to solve this problem.
        Display the complete set of unique values input after the user enters each new value. */

import java.util.Scanner;

public class DuplicateEli {

    private static int[] myArray = new int[5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;

        while (counter != 5) {
            System.out.println("Enter number between 10 - 100: ");
            int number = input.nextInt();

            if (number < 10 || number > 100)
                continue;
            ;

            if (isUnique(number))
                System.out.print("number is unique:" + " " + number);

            try {
                // add to array and increase counter
                myArray[counter++] = number;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            printUniqueNumbers();
        }
        counter++;

    }


    private static boolean isUnique(int number) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                return true;
            }
        }
        return true;
    }

    private static void printUniqueNumbers() {

        System.out.printf("\n Unique values: \n");

        System.out.print(myArray[0] + " ");


        int unique = 0;
        for (int j = 0; j < myArray.length; j++) {

            if (myArray[j] > 0) {
                for (int i = j - 1; i >= 0; i--) {
                    if (myArray[j] == myArray[i]) {
                        unique = 0;
                        break;
                    }
                    else {
                        unique = myArray[j];
                    }
                }

            if (unique > 0) {
                System.out.print(unique + " ");
            }

        }
        else{
            continue;
        }
    }
        System.out.println();

        }

    }




