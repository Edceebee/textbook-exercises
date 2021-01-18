package chapter3;

import java.util.Scanner;

public class EmployeeTest{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Employee employee1 = new Employee("Anthony", "Michael", 200_000);
        Employee employee2 = new Employee("John", "Jones", 200_000);

        System.out.printf("Employee first name is %s%n, Employee last name is %s%n, Employee monthly salary is %f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary());


        System.out.print("Enter first name");
        //String firstName = input.nextLine(); // obtain user input
        employee1.setFirstName(input.nextLine());

        System.out.print("Enter last name");
        employee1.setLastName(input.nextLine());

        System.out.print("Enter monthly salary");
        employee1.setMonthlySalary(input.nextDouble());

        System.out.println("Yearly Salary" + employee1.displayYearlySalary());


    }


    }

