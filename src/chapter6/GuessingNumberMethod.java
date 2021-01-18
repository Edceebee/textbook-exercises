package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingNumberMethod {

    public static int letsGuess(int userInput) {

        SecureRandom randomGenerator = new SecureRandom();
        int randomNumber = 1 + randomGenerator.nextInt(10);

        if (userInput == randomNumber) {
            System.out.println("You are correct");
        } else {
            System.out.println("Incorrect Answer");
        }

        if (userInput < randomNumber) {
            System.out.println("input is lesser than the secret answer");
        }

        if (userInput > randomNumber) {
            System.out.println("input is greater than the secret number");
        }
return userInput;


    }
}

class GuessingNumberMain {

    public static void main(String[] args) {
        int userInput = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("please Enter number between 1 - 10 or -1 to quit");
        userInput = input.nextInt();


        System.out.println(GuessingNumberMethod.letsGuess(userInput));

        while (userInput != -1) {
            System.out.println("please Enter number between 1 - 10 or -1 to quit");
            userInput = input.nextInt();


            System.out.println(GuessingNumberMethod.letsGuess(userInput));

        }

    }
}
