package Excercises;

/*Write a program that inputs five numbers and determines and prints the number of negative numbers input, the
number of positive numbers input and the number of zeros input */

				import java.util.Scanner;
					
					public class Cypher 	{

					public static void main(String[] args)	{

				Scanner sign = new Scanner(System.in);

				int number1;
				int number2;
				int number3;
				int number4;
				int number5;

					System.out.print("Enter first integer: ");
					number1 = sign.nextInt();

					System.out.print("Enter second integer: ");
					number2 = sign.nextInt();

					System.out.print("Enter third integer: ");
					number3 = sign.nextInt();

					System.out.print("Enter fourth integer: ");
					number4 = sign.nextInt();

					System.out.print("Enter fifth integer: ");
					number5 = sign.nextInt();


			if(number1 > 0)
			System.out.println("number1 is positive ");  		

			else if (number1 < 0){
			System.out.println("number1 is negative. ");
			}
			else  {
			System.out.println("number1 is 0. ");}


			if(number2 > 0){
			System.out.println("number2 is positive ");  		
			}
			else if (number2 < 0){
			System.out.println("number2 is negative. ");
			}
			else  {
			System.out.println("number2 is 0. ");}

			
			if(number3 > 0){
			System.out.println("number3 is positive ");  		
			}
			else if (number3 < 0){
			System.out.println("number3 is negative. ");
			}
			else  {
			System.out.println("number3 is 0. ");}

			
			if(number4 > 0){
			System.out.println("number4 is positive ");  		
			}
			else if (number4 < 0){
			System.out.println("number4 is negative. ");
			}
			else  {
			System.out.println("number4 is 0. ");}


			if(number5 > 0){
			System.out.println("number5 is positive ");  		
			}
			else if (number5 < 0){
			System.out.println("number5 is negative. ");
			}
			else  {
			System.out.println("number5 is 0. ");}
			

			


			}

						}

			

			

					
