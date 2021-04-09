package chapter14;

import java.util.Scanner;

public class pigLatin {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            System.out.println("Please enter the sequence of text (Then press the 'enter' key): ");
            String text = input.nextLine();

            // Tokenize the text
            String[] words = text.split(" ");


            for (int i = 0; i < words.length; i++) {
                printLatinWord(words[i]);
            }
        }

        // Method printLatinWord to convert each word into pig Latin
        public static void printLatinWord(String token) {

            char firstchar = token.charAt(0);


            String newToken = "";

            for (int i = 1; i < token.length(); i++) {
                newToken += token.charAt(i);
            }

            newToken += firstchar + "ay";



            System.out.print(newToken.toLowerCase());


            System.out.print(" ");
        }

    }


