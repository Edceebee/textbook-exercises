package chapter6;

/* (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
       2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
        a) Write a method that determines whether a number is prime.
        b) Use this method in an application that determines and displays all the prime numbers
        less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
        you’ve found all the primes?
        c) Initially, you might think that n/2 is the upper limit for which you must test to see
        whether a number n is prime, but you need only go as high as the square root of n. Rewrite
        the program, and run it both ways. */
import java.util.Scanner;

public class PrimeNumbers {

    public static String findPrimeNumber(int number) {

        if (number % 2 == 0){
            return "(Number is even)";
        }
        else{
            return "(Number is prime)";
        }

        }
    }

    class PrimeNumbersTest {

        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);

            int number;

            System.out.println("Enter number to decide if number is an odd or even number");
            number = input.nextInt();

            System.out.println(PrimeNumbers.findPrimeNumber(number));

        }
    }

    class PrimeNumberTest{
        public static void main(String[] args) {

            int counter;
            int number;


            for (counter = 1; counter <= 1000; counter++) {
                number = counter;

                System.out.print(number);

                System.out.println(PrimeNumbers.findPrimeNumber(number));
            }

        }
    }


