package chapter3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      HealthProfile john = new HealthProfile("John", "Michael", "Male", "March", 6, 1990,
                                                                    6, 100.00);


      System.out.printf("first name: %s%n last name %s%n gender:  %s%n month of birth: %s%n day of birth: %s%n" +
              "year of birth: %d%n age: %d%n maximum heart rate: %d%n target heart rate: %f%n weight: %f%n height: %d%n " +
              "BMI: %f%n" , john.getFirstName(), john.getLastName(), john.getGender(), john.getMonthOfBirth(), john.getDayOfBirth(), john.getYearOfBirth(),
              john.age(), john.getHeightInInches(), john.getWeightInPounds(), john.targetHeartRate(), john.maximumHeartRate(), john.BMI() );


        System.out.println("Enter first name");
        john.setFirstName(input.nextLine());

        System.out.println("Enter last name");
        john.setLastName(input.nextLine());

        System.out.println("Enter gender");
        john.setGender(input.nextLine());

        System.out.println("Enter month of birth");
        john.setMonthOfBirth(input.nextLine());

        System.out.println("Enter day of birth");
        john.setDayOfBirth(input.nextInt());

        System.out.println("Enter year of birth");
        john.setYearOfBirth(input.nextInt());

        System.out.println("Enter height");
        john.setHeightInInches(input.nextInt());

        System.out.println("Enter weight in pounds");
        john.setWeightInPounds(input.nextDouble());


        System.out.println("Age" + john.age());
        System.out.println("Maximum Heart rate" + john.maximumHeartRate());
        System.out.println("targetHeartRate" + john.targetHeartRate());
        System.out.println("BMI" + john.BMI());

















    }

}