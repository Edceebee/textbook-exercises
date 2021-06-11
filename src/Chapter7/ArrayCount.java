package Chapter7;

/*  Write statements that perform the following one-dimensional-array operations:
        a) Set the 10 elements of integer array counts to zero.
        b) Add one to each of the 15 elements of integer array bonus.
        c) Display the five values of integer array bestScores in column format. */

import java.util.Arrays;

public class ArrayCount { // begin class

        public static void main(String[] args ) { // begin the main method

            // part     a
            int[] array = new int[10];
            // declaring and setting 10 elements in the
            for(int i=0; i < array.length; i++){
                array[i] = 0;
            }
            System.out.println(Arrays.toString(array));
            // array with zero

            // part b
            int[] bonus = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};// declaring array bonus with 15 elements

            for(int x=0; x<15; x++){ // adding 1 to each element
                bonus[x] *= 2;
                }
            System.out.println(Arrays.toString(bonus));


            // part c
            int[] bestScores = {10,20,30,40,50}; // declaring the array bestScores of
            // 5 elements
            for (int j=0; j<5; j++){
                System.out.printf("%d\t", bestScores[j]); // displaying them in a
                // column format
            }
        }
    }

