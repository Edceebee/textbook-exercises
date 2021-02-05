package Excercises;


// program that display the sum, average, product, smallest and largest numbers


	import java.util.Scanner;

			public class Digits   {      // class declaration
	
	public static void main(String[] args)   {       // main method

				Scanner symbol = new Scanner(System.in);

			int symbol1;
			int symbol2;
			int symbol3;


			System.out.print("Enter first integer");
			symbol1 = symbol.nextInt();

			System.out.print("Enter second integer");
			symbol2 = symbol.nextInt();

			System.out.print("Enter third integer");
			symbol3 = symbol.nextInt();


			int sum;
			int average;
			int product;

			sum = symbol1 + symbol2 + symbol3;
			System.out.printf("Sum is %d%n", sum);

			product = symbol1 * symbol2 * symbol3;
			System.out.printf("Product is %d%n", product);

			average = (symbol1 + symbol2 + symbol3) / 3;
			System.out.print("The average of entered numbers is:" + average );
    


	if(symbol1 > symbol2 && symbol1 > symbol3)
	System.out.printf("Smallest number is: %d%n", symbol1);
	 
	if(symbol2 > symbol1 && symbol2 > symbol3)
	System.out.printf("%d", symbol2);
	
	if(symbol3 > symbol1 && symbol3 > symbol2)
	System.out.printf("%d", symbol3);

	

	if(symbol1 < symbol2 && symbol1 < symbol3)
	System.out.printf("%d", symbol1);
	
	if(symbol2 < symbol1 && symbol2 < symbol3)
	System.out.printf("%d", symbol2);
	
	if(symbol3 < symbol1 && symbol3 < symbol2)
	System.out.printf("%d", symbol3);

}
		}
			


				
			






























				

				

