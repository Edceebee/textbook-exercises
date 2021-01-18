package chapter3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HeartRateTest {


    public static void main(String[] args) {

        HeartRates john = new HeartRates("John", "Michael", "January",
                                                    "3rd", 1992);

        Scanner input = new Scanner(System.in);


        System.out.printf("John first name is %s%n, John last name is %s%n, John month of birth is %s%n, John" +
                "day of birth is %s%n, John year of birth is %d%n, John age is %d%n, John maximum heart is %f%n," +
                        "John target heart rate is %f%n", john.getFirstName(), john.getLastName(),
                john.getDayOfBirth(), john.getMonthOfBirth(), john.getYearOfBirth(), john.age(),
                john.maximumHeartRate(), john.targetHeartRate());

        System.out.println("Enter first name");
        john.setFirstName(input.nextLine());

        System.out.println("Enter last name");
        john.setLastName(input.nextLine());

        System.out.println("Enter month of birth");
        john.setMonthOfBirth(input.nextLine());

        System.out.println("Enter day of birth");
        john.setDayOfBirth(input.nextLine());

        System.out.println("Enter year of birth");
        john.setYearOfBirth(input.nextInt());


        System.out.println("Age" + john.age());
        System.out.println("Maximum heart rate " + john.maximumHeartRate());
        System.out.println("Target heart rate " + john.targetHeartRate());


    }


}
