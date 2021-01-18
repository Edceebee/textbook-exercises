package chapter5;
/* (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
        integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
        1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
        results in tabular format. What difficulty might prevent you from calculating the factorial of 100? */
public class Factorials {

    public static void main(String[] args) {

        int counter;
        long factorial = 1;

        for(counter =1; counter <=20; factorial *= counter, counter++) {

        }
        System.out.println(factorial);
    }
}
