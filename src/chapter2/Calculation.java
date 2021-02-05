package chapter2;    //program will calculate the product of three integers.

	import java.util.Scanner;
	
		public class Calculation  {
	public static void main(String[] args)   {
	
	Scanner maths = new Scanner(System.in);

		int number1;
		int number2;
		int number3;

	System.out.print("Enter first integer: ");
		number1 = maths.nextInt();

	System.out.print("Enter second integer: ");
		number2 = maths.nextInt();

	System.out.print("Enter third integer: ");
		number3 = maths.nextInt();

	int product = number1 * number2 * number3;

	System.out.printf("Product is %d%n", product);

		}

}
		
		
	 