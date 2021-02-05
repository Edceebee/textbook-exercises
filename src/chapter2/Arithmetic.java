package chapter2;


//write a program that calculate the sum, product,average and quotient of three integers.

			import java.util.Scanner;

			public class Arithmetic		{
			public static void main(String[] args)  {

			Scanner maths = new Scanner(System.in);

			int number1;
			int number2;
			int number3;

			System.out.print("Enter first integer" );
			number1 = maths.nextInt();

			System.out.print("Enter second integer" );
			number2 = maths.nextInt();

			System.out.print("Enter third integer" );
			number3 = maths.nextInt();

				int sum;
				int product;
				int average;
				int quotient;

			sum = number1 + number2 + number3;
			System.out.printf("Sum is %d%n", sum);

			product = number1 * number2 * number3;
			System.out.printf("Product is %d%n", product);

			quotient = number1 / number2 / number3;
			System.out.printf("Quotient is %d%n", quotient);

			average = (number1 + number2) / number3;
			System.out.printf("Average is %d%n", average);

			}
						}




			


				