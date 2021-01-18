package chapter6;

/* Circle Area) Write an application that prompts the user for the radius of a circle and uses
        a method called circleArea to calculate the area of the circle. */

import java.util.Scanner;

public class CircleArea {

    public static double calculateCircleArea(double radius) {

        double area;
        area = 3.14 * radius *radius;
        return  area;
    }

}

class CircleAreaTest {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int radius;

        System.out.println("Enter radius of your circle");
        radius = input.nextInt();

        System.out.println("Area is:");
        System.out.println((CircleArea.calculateCircleArea(radius)));



    }


}
