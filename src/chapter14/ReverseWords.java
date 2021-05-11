package chapter14;

/*(Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
        text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
        characters as delimiters. */

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text");
        String text = input.next();

        reveresedWord(text);
    }

    private static void reveresedWord(String text) {
        String[] words = text.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println("your text is " + text);
        System.out.println("reversed text is: " + reversedString);
    }

}

