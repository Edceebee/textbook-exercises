package Chapter7;
/* (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
   Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
   is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst
   case,” in which all five numbers are different. Use the smallest possible array to solve this problem.
   Display the complete set of unique values input after the user enters each new value. */

import javax.swing.*;

public class Elimination2 {

    private int[] array = new int[5];

    public void acceptInput() {
        int input;
        for (int i = 0; i < 5; i++) {
            input = readInput();
            if(takeUniqueInput(input)) {
                array[i] = printUniqueValues();
            }
        }
    }

    public int[] getInput() {
        return array;
    }

    public boolean shouldTakeInput(int input) {
        if (input >= 10 && input <= 100) {
            return true;
        }
        return false;
    }


    private int readInput() {
        int input = 0;
        do {
            Integer.parseInt(JOptionPane.showInputDialog("Enter Input"));
        }
        while (input < 10 );
        return input;
    }

    public boolean takeUniqueInput(int input) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input)
                return false;
        }
        return true;
    }


    public int printUniqueValues() {

        System.out.printf("\n Unique values: \n");

        System.out.print(array[0] + " ");


        int unique = 0;
        for (int j = 0; j < array.length; j++) {

            if (array[j] > 0) {
                for (int i = j - 1; i >= 0; i--) {
                    if (array[j] == array[i]) {
                        unique = 0;
                        break;
                    }
                    else {
                        unique = array[j];
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

        return unique;
    }

    public int[] getPrintUniqueValues() {
        return array;

    }
}


