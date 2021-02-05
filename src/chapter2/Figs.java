package chapter2;// Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result.

	import javax.swing.*;

		public class Figs	{

		public static void main(String[] args)	{		//beginning of main method


		int number1;
		int number2;

	//System.out.print("Enter first number");		//prompt
	number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Input"));

	System.out.print("Enter second number");
	number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Input"));

	if(number1 * number1 == number2)
		JOptionPane.showInputDialog("First number is a multiple of number2");
	// System.out.print( "First number is a multiple of number2");

		else
		System.out.println("First number is not a multiple of number2");

	//System.out.print("First number is not a multiple of number2");

		}
}

