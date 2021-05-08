package chapter14;
/*(Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a
        string in the form (555) 555-5555. The application should use String method split to extract the
        area code as a token, the first three digits of the phone number as a token and the last four digits of
        the phone number as a token. The seven digits of the phone number should be concatenated into
        one string. Both the area code and the phone number should be printed. Remember that you’ll have
        to change delimiter characters during the tokenization process. */

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizingPhoneNo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter phone number");
        String number = input.next();

        tokenizeNumbers(number);
    }

    private static void tokenizeNumbers(String sentence) {
//        String[] tokens = sentence.split(" ");
//        System.out.println("Number of elements: " + tokens.length + "\n" +"The tokens are: " +sentence );
//
//        for (String token : tokens)
//            System.out.println(token);
//    }
        StringTokenizer tokenizer = new StringTokenizer( sentence );
        String areaCode = tokenizer.nextToken( "()" );
        String number =
                tokenizer.nextToken( ") -" ) + tokenizer.nextToken( "-" );
        System.out.printf(
                "Area Code: %s\nPhone Number: %s\n", areaCode, number );
    } // end main
}
