package chapter4;

  /*Drivers are concerned with the mileage their automobiles get. One driver has kept track of several
   trips by recording the miles driven and gallons used for each tankful. Develop a Java application
   that will input the miles driven and gallons used (both as integers) for each trip.The program
   should calculate and display the miles per gallon obtained for each trip and print the combined miles
    per gallon obtained for all trips up to this point. All averaging calculations should produce
    floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the data
    from the user. */


import java.util.Scanner;

public class GasMileage{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int milesDriven = 0;
        int gallonsUsed = 0;
        int totalMilesDriven = 0;
        int totalGallonsUsed = 0;
        double milesPerGallon  = 0.0;
        double totalMilesPerGallon = 0.0;

        System.out.println("Enter miles driven or -1 to end program");
        milesDriven = sc.nextInt();

        System.out.println("Enter gallons used or -1 to end program");
        gallonsUsed = sc.nextInt();

        while (milesDriven != -1) {

            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;
            milesPerGallon = milesDriven / gallonsUsed;
            totalMilesPerGallon = totalMilesDriven / totalGallonsUsed;

            System.out.println("miles Per Gallon is:" + milesPerGallon);

            System.out.println("Enter miles driven or -1 to end program");
            milesDriven = sc.nextInt();

            System.out.println("Enter gallons used or -1 to end program");
            gallonsUsed = sc.nextInt();
        }

        System.out.println("total miles per gallon is %.2f%n:" + totalMilesPerGallon);

    }
}