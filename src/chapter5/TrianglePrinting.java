package chapter5;

/* (Triangle Printing Program) Write an application that displays the following patterns separately,
        one below the other. Use for loops to generate the patterns. All asterisks (*) should be printed
        by a single statement of the form System.out.print('*'); which causes the asterisks to print side
        by side. A statement of the form System.out.println(); can be used to move to the next line. A
        statement of the form System.out.print(' '); can be used to display a space for the last two patterns.
        There should be no other output statements in the program. [Hint: The last two patterns require
        that each line begin with an appropriate number of blank spaces.] */

public class TrianglePrinting {

    public static void main(String[] args) {

        int row;
        int column;

        for (column = 0; column <= 10; column++) {
            System.out.println("*");
            System.out.println(" ");
            for (row = 0; row<10; row--){
                System.out.print("*");
                break;
            }
        }

    }
}