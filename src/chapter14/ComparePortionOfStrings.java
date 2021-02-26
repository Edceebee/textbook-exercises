package chapter14;

/*(Comparing Portions of Strings) Write an application that uses String method region-
        Matches to compare two strings input by the user. The application should input the number of characters
        to be compared and the starting index of the comparison. The application should state
        whether the strings are equal. Ignore the case of the characters when performing the comparison.*/
import java.util.Scanner;

public class ComparePortionOfStrings {
    private String input;
    private int index;
    private int noOfChar;

    public ComparePortionOfStrings(String input, int index, int noOfChar) {
        this.input = input;
        this.index = index;
        this.noOfChar = noOfChar;
    }

    public ComparePortionOfStrings() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNoOfChar() {
        return noOfChar;
    }

    public void setNoOfChar(int noOfChar) {
        this.noOfChar = noOfChar;
    }
}

