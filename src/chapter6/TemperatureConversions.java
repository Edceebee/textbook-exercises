package chapter6;

/*(Temperature Conversions) Implement the following integer methods:
        a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
        calculation
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
        the calculation
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        c) Use the methods from parts (a) and (b) to write an application that enables the user either
        to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
        Celsius temperature and display the Fahrenheit equivalent. */

import java.util.Scanner;

public class TemperatureConversions {

    public static double calculateCelsius (double fahrenheit) {

        double celsius;
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }

    public static double calculateFahrenheit (double celsius) {

        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }

}

class TemperatureConversionTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Enter fahrenheit to calculate celsius");
        fahrenheit = input.nextDouble();
        System.out.println("Celsius is:");
        System.out.println((TemperatureConversions.calculateCelsius(fahrenheit)));


        System.out.println("Enter celsius to calculate fahrenheit");
        celsius = input.nextDouble();
        System.out.println("fahrenheit is:");
        System.out.println((TemperatureConversions.calculateFahrenheit(celsius)));
    }

}