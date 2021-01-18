package chapter6;

/* (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
        square (the same number of rows and columns) of asterisks whose side is specified in integer parameter
        side. For example, if side is 4, the method should display
        ****
        ****
        ****
        ****
        Incorporate this method into an application that reads an integer value for side from the user and
        outputs the asterisks with the squareOfAsterisks method. */

import java.util.Scanner;


class DisplaySquareOfAsterisks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DisplaySquareOfAsterisks newLevels = new DisplaySquareOfAsterisks();


        int number = 0;


        DisplaySquareOfAsterisks.squareOfAsterisks(number);

        System.out.println("Enter number to display box of asterisks");
        number = input.nextInt();

        System.out.print((newLevels.squareOfAsterisks(number)));

    }



    public static String squareOfAsterisks(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++)

                System.out.print("*");
            System.out.println();

        }

        return ("the box of number input");

    }
}

//    public static void SquareOfCharacters (int side, char fillCharacter){
//        for (int i=1; i<=side;i++){
//            for(int j=1; j<=side;j++)
//                System.out.print(fillCharacter);
//            System.out.println();
//        }
//    }
//

