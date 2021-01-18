package chapter6;
/* (Separating Digits) Write methods that accomplish each of the following tasks:
        a) Calculate the integer part of the quotient when integer a is divided by integer b.
        b) Calculate the integer remainder when integer a is divided by integer b
        c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer and calls display-
Digits by passing the method the integer entered. Display the results. */

public class SeparatingDigits {
   public static int intQuotient(int number1, int number2) {
    int quotient;
    quotient = number1 / number2;
        return quotient;
    }

    public static int intRemainder(int number1, int number2) {
       int remainder;
       remainder = number1 % number2;
        return remainder;
    }



}
