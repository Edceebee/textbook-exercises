package chapter6;


import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom randomGenerator = new SecureRandom();
        int randomNumber = 1 + randomGenerator.nextInt(10);


        System.out.println("Enter random number between 1 - 10, or -1 to quit");
        int userInput = input.nextInt();

        while ((userInput != -1)) {

            if (userInput == randomNumber) {
                System.out.println("You are correct");
            } else {
                System.out.println("Incorrect Answer");
            }

            if (userInput < randomNumber) {
                System.out.println("input is greater than the secret answer");
            }

            if (userInput > randomNumber) {
                System.out.println("input is less than the secret number");
            }
            while (userInput != -1) {

                System.out.println("Enter random number between 1 - 10, or -1 to quit");
                userInput = input.nextInt();

                if (userInput == randomNumber) {
                    System.out.println("You are correct");
                } else {
                    System.out.println("Incorrect Answer");
                }

                if (userInput < randomNumber) {
                    System.out.println("input is greater than the secret answer");
                }

                if (userInput > randomNumber) {
                    System.out.println("input is lesser than the secret number");
                }
                if (userInput == randomNumber) {
                    System.out.println("You are correct");
                }


            }


        }
    }
}
