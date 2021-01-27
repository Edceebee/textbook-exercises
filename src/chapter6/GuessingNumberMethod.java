package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingNumberMethod {

    public static String letsGuess(int userInput) {

        SecureRandom randomGenerator = new SecureRandom();
        int randomNumber = 1 + randomGenerator.nextInt(10);

        if (userInput == randomNumber) {
            System.out.println("You are correct");

        }

        else {
            System.out.println("Incorrect Answer");
        }


        if (userInput < randomNumber) {
            System.out.println("input is greater than the secret answer");
        }

        if (userInput > randomNumber) {
            System.out.println("input is less than the secret number");
        }
        return " ";


    }
}

class GuessingNumberMain {

    public static void main(String[] args) {
        int userInput;

        Scanner input = new Scanner(System.in);

        System.out.println("please Enter number between 1 - 10 or -1 to quit");
        userInput = input.nextInt();

        while (userInput != 1) {

        System.out.println(GuessingNumberMethod.letsGuess(userInput));

        System.out.println(GuessingNumberMethod.letsGuess(userInput));


            }
        while (userInput != 1) {

            System.out.println("please Enter number between 1 - 10 or -1 to quit");
            userInput = input.nextInt();

            System.out.println(GuessingNumberMethod.letsGuess(userInput));

            System.out.println(GuessingNumberMethod.letsGuess(userInput));
        }

        }
    }
