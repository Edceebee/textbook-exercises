package chapter4;

/* (Credit Limit Calculator) Develop a Java application that determines whether any of several
    department-store customers has exceeded the credit limit on a charge account. For each
    customer, the following facts are available:
      a) account number
      b) balance at the beginning of the month
      c) total of all items charged by the customer this month
      d) total of all credits applied to the customer’s account this month
      e) allowed credit limit.

      The program should input all these facts as integers, calculate the new balance (= beginning
      balance + charges – credits), display the new balance and determine whether the new balance
      exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
      program should display the message "Credit limit exceeded". */


import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber = 0;
        int beginningBalance = 0;
        int totalItemsCharged = 0;
        int totalCredits = 0;
        int allowedCredit = 0;
        int newBalance = 0;
        int totalNewBalance = 0;


        System.out.println("Enter account number or -1 to quit");
        accountNumber = input.nextInt();

        System.out.println("Enter Beginning Balance or -1 to quit");
        beginningBalance = input.nextInt();

        System.out.println("Enter total items Charged or -1 to quit");
        totalItemsCharged = input.nextInt();


        System.out.println("Enter allowed credits or -1 to quit");
        allowedCredit = input.nextInt();


        System.out.println("Enter total credits or -1 to quit");
        totalCredits = input.nextInt();


        while (accountNumber != -1) {

            beginningBalance += beginningBalance;
            totalItemsCharged += totalItemsCharged;
            totalCredits += totalCredits;
            allowedCredit += allowedCredit;

            newBalance = (beginningBalance + totalItemsCharged - totalCredits);
            System.out.printf("new balance is %d%n", newBalance);
            if (newBalance > allowedCredit) {
                System.out.println("you are eligible for credit");
            }
            else {
                System.out.println("you are not eligible for credit");

            }

            System.out.println("Enter account number or -1 to quit");
            accountNumber = input.nextInt();

            System.out.println("Enter Beginning Balance or -1 to quit");
            beginningBalance = input.nextInt();

            System.out.println("Enter total items Charged");
            totalItemsCharged = input.nextInt();


            System.out.println("Enter allowed credits");
            allowedCredit = input.nextInt();


            System.out.println("Enter total credits");
            totalCredits = input.nextInt();

        }

        System.out.printf("Total new balance is %f%n", totalNewBalance);


        }


    }













