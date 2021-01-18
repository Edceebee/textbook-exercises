package chapter5;

/* (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
        integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
        1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
        results in tabular format. What difficulty might prevent you from calculating the factorial of 100? */

public class CalculateFactorial {
    public static void main(String[] args) {

        long counter;
        long factorial = 1;

        for(counter = 1; counter <= 20; counter++) {
            System.out.println(counter);
            factorial *= counter;

        }
        System.out.print(factorial);

    }
}
