package chapter14;

import java.util.Scanner;

public class CompareStrings2 {

    public static void main(String[] args) {

        // prompted user input
        Scanner input = new Scanner(System.in);
        int firstIndex;
        int secondIndex;

        System.out.print("Enter First String:"); // prompt user
        String stringNumberOne = input.next(); // assigns stringNumberOne to user input
        System.out.print("Enter Second String:"); // prompt
        String stringNumberTwo = input.next(); // assigns stringNumberTwo to user input


        System.out.print("Enter Starting Index for First String:"); // prompt
        firstIndex = input.nextInt(); // assigns firstIndex to user input
        System.out.print("Enter Starting Index for Second String:"); // prompt
        secondIndex = input.nextInt(); // assigns secondIndex to user input
        System.out.print("Enter Number of Characters to be Compared:"); // prompt
        int numberCompared = input.nextInt(); // assigns numberCompared to user input

        boolean results = stringNumberOne.regionMatches(firstIndex,
                stringNumberTwo, secondIndex, numberCompared);

        if (results)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
