package chapter8;



import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

       // Account account1 = new Account("Anthony", 100_000.00);
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);


        System.out.println("saver1 acct balance is: " + saver1.calculateMonthlyInterest());
        System.out.println("saver2 acct balance is: " + saver2.calculateMonthlyInterest());
    }
}
