package Chapter7;

/*  Write statements that perform the following one-dimensional-array operations:
        a) Set the 10 elements of integer array counts to zero.
        b) Add one to each of the 15 elements of integer array bonus.
        c) Display the five values of integer array bestScores in column format. */

public class ArrayCount { // begin class

        public static void main(String[] args ) { // begin the main method

            // part     a
            int array[] = {0,0,0,0,0,0,0,0,0,0}; // declaring and setting 10 elements in the
            // array with zero

            // part b
            int bonus[];
            bonus = new int[15];  // declaring array bonus with 15 elements

            for(int i=0; i<15; i++){ // adding 1 to each element
                bonus[i] += 1;
            }

            // part c
            int bestScores[] = {10,20,30,40,50}; // declaring the array bestScores of
            // 5 elements
            for (int j=0; j<5; j++){
                System.out.printf("%d\t", bestScores[j]); // displaying them in a
                // column format
            }
        }
    }

