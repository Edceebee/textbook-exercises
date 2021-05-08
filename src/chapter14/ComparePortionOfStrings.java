package chapter14;

/*(Comparing Portions of Strings) Write an application that uses String method region-
        Matches to compare two strings input by the user. The application should input the number of characters
        to be compared and the starting index of the comparison. The application should state
        whether the strings are equal. Ignore the case of the characters when performing the comparison.*/
import java.util.Scanner;

public class ComparePortionOfStrings {
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

