package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static boolean randomAddition(int number3){

        SecureRandom addition = new SecureRandom();

        int number1 = 1 + addition.nextInt(9);
        int number2 = 1 + addition.nextInt(9);

        if (number3 == number1 + number2){
            System.out.println("Correct Answer, nice work");
        }
        else {
            System.out.println("Incorrect answer, try again");
        }

        return true;
    }

    public static void randomSubtraction(int number1, int number2, int number3) {

        SecureRandom subtraction = new SecureRandom();

        number1 = 1 + subtraction.nextInt(9);
        number2 = 1 + subtraction.nextInt(9);

        if(number3 == number1 - number2) {
            System.out.println("Correct Answer, nice work");
        }
        else{
            System.out.println("Incorrect Answer, try again ");

        }
    }

    public static void randomMultiplication(int number1, int number2, int number3){

        SecureRandom multiplication = new SecureRandom();

        number1 = 1 + multiplication.nextInt(9);
        number2 = 1 + multiplication.nextInt(9);

        if(number3 == number1 * number2) {
            System.out.println("Correct Answer, nice work");
        }
        else{
            System.out.println("Incorrect Answer, try again ");

        }
    }

    public static void randomDivision(int number1, int number2, int number3) {
        SecureRandom division = new SecureRandom();

        number1 = 1 + division.nextInt(9);
        number2 = 1 + division.nextInt(9);

        if(number3 == number1 / number2) {
            System.out.println("Correct Answer, nice work");
        }
        else {
            System.out.println("Incorrect Answer, try again ");
        }
    }

    }

    class ComputerAssistedMain{
        public static void main(String[] args) {
            Scanner input = new  Scanner (System.in);

            System.out.println("Enter answer");
            int number3 = input.nextInt();

            System.out.println(ComputerAssistedInstruction.randomAddition(number3));
        }
    }



