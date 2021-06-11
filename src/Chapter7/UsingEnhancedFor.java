package Chapter7;


import java.util.Scanner;

public class UsingEnhancedFor {

    public static void main(String args[])
        {
            String s1;
            String s2;
            double total = 0.0;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            s1 = input.next();

            System.out.println("Enter second number");
            s2 = input.next();

            if (args.length != 3)
                System.out.println("Clueless");
            else {
                for (String s : args){
                    double d = Double.parseDouble(args[0]);
                    total += d;
                }
            }
            System.out.printf("The sum should appear here: %.2f", total);//total shows as 0.00 no matter the input
        }//end main
    }//end class DoubleTest

