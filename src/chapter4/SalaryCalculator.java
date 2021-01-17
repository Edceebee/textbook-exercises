package chapter4;

 /*(Salary Calculator) Develop a Java application that determines the gross pay for each of three
 employees. The company pays straight time for the first 40 hours worked by each employee and
 time and a half for all hours worked in excess of 40. You’re given a list of the employees,
  their number of hours worked last week and their hourly rates. Your program should input
  this information for each employee, then determine and display the employee’s gross pay. Use
   class Scanner to input the data. */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String employeeName;
        int hoursWorked = 0;
        int hourlyRates = 0;
        int grossPay = 0;
        int counter = 1;
        int totalGrossPay = 0;


        while (counter <= 3) {
            System.out.println("Enter Employee name");
           employeeName = sc.next();

            System.out.println("Enter number of hours worked");
            hoursWorked = sc.nextInt();

            System.out.println("Enter hourly rate");
            hourlyRates = sc.nextInt();


            grossPay = hourlyRates * hoursWorked;
            totalGrossPay = (hourlyRates * 40) + ((hoursWorked - 40) * hourlyRates /2);

            if (hoursWorked <= 40) {
                System.out.printf("Gross pay is: %d%n", grossPay);
            }
            else {
                System.out.printf("Total gross pay is: %d%n", totalGrossPay);
            }
            counter++;
        }

    }
}