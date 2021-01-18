package chapter5;

/* (Calculating the Product of Odd Integers) Write an application that calculates the product
        of the odd integers from 1 to 15. */

public class OddNumberProduct {
    public static void main(String[] args) {

        int counter;
        int product = 1;

        for (counter = 1; counter <= 15; counter+= 2){

            product *= counter;
        }
        System.out.printf("Product is: %d%n", product);

    }
    }

