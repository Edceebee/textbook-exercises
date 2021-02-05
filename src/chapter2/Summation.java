package Excercises;   /*Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient 		(division) */


import java.util.Scanner;

		public class Summation      {
		
		public static void main(String[] args)  {

			Scanner mathGame = new Scanner(System.in);

			int number1;
			int number2;
			
		System.out.print(" Enter first integer. ");
		number1 = mathGame.nextInt();

		System.out.print(" Enter second integer. ");
		number2 = mathGame.nextInt();


			int sum;
			int product;
			int division;

		sum = number1 + number2;
		System.out.printf("Sum is %d%n", sum);
		
		product = number1 * number2;
		System.out.printf("Product is %d%n", product);
		
		division = number1 / number2;
		System.out.printf("Division is %d%n", division);

		}
				}

		

		