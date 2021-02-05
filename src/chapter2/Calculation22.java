package chapter2;

/*program that multiply two integers, sum two integers and subtract the integers and divide the integer */


		import java.util.Scanner;

	public class Calculation22  {

		public static void main(String[] args)   {

		
	Scanner maths = new Scanner(System.in);

		int number1;
		int number2;

			System.out.print("Enter first integer: ");
			number1 = maths.nextInt();


			System.out.print("Enter first integer: ");
			number2 = maths.nextInt();

	int sum;
	int product;
	int division;

		sum = number1 + number2; 
		System.out.printf("Sum is %d%n", sum);

		product = number1 * number2;
		System.out.printf("Product is %d%n", product);

		division = number1 / number2 ;
		System.out.printf("Division is %d%n", division);


		}

}



		
		






			
				