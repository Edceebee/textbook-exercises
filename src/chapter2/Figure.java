package Excercises;
//  Write an application that reads an integer and determines and prints whether it’s odd or even.


		import java.util.Scanner;

	 public class Figure	{

	public static void main(String[] args)	{

		Scanner input = new Scanner(System.in);

	int number1;
	int number2;

	System.out.print("Enter first number");
	number1 = input.nextInt(); 

	System.out.print("Enter second number");
	number2 = input.nextInt(); 


	if(number1 % 2 == 0)
	System.out.print("Number1 is an even number");

	if(number1 % 2 == 1)
	System.out.print("Number1 is an odd number");

	if(number2 % 2 == 0)
	System.out.print("Number2 is an even number");

	if(number2 % 2 == 1)
	System.out.print("Number2 is an even number");

		}

			}

	

	