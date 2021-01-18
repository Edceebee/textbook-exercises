package chapter3;

import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Anthony", 100_000.00);

        System.out.printf("Account name is %s%n Account balance is %f%n", account1.getName(), account1.getBalance());

        System.out.print("Enter amount to withdraw");   //prompt
        account1.withdraw(input.nextDouble());


        System.out.printf("%f%n", account1.getBalance());


    }
}