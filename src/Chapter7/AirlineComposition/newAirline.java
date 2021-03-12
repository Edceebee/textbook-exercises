package Chapter7.AirlineComposition;

import java.util.Scanner;

/*(Airline Reservations System) A small airline has just purchased a computer for its new automated
        reservations system. You’ve been asked to develop the new system. You’re to write an application
        to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
        Your application should display the following alternatives: Please type 1 for First Class and
        Please type 2 for Economy. If the user types 1, your application should assign a seat in the first class
        section (seats 1–5). If the user types 2, your application should assign a seat in the economy
        section (seats 6–10). Your application should then display a boarding pass indicating the person’s
        seat number and whether it’s in the first-class or economy section of the plane.
        Use a one-dimensional array of primitive type boolean to represent the seating chart of the
        plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
        each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
        no longer available.
        Your application should never assign a seat that has already been assigned. When the economy
        section is full, your application should ask the person if it’s acceptable to be placed in the first-class
        section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
        "Next flight leaves in 3 hours." */
public class newAirline {



    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        boolean[] seating = new boolean[11];

        int[] newArray = new int[10];


        for (int counter = 0; counter < newArray.length; counter++) {
            System.out.println("Please type 1 for First Class or type 2 for Economy");
            int choice = input.nextInt();

            if (choice == 1) {
                firstClass(seating);
            } else {
                economySeat(seating);
            }
        }


    }

    private static void economySeat(boolean seating[]) {

        for ( int count = 6; count <= 10; count++ )
        {
            if ( seating[count] == false ) // if false, then a seat is available for assignment
            {
                seating[count] = true; // assign seat
                System.out.printf("You've booked for Economy. Seat# %d\n", count);break;
            }
            else if ( seating[10] == true ) // If seating[10] is true then economy is fully booked
            {
                if ( seating[5] == true) // If seating[5] is true then first class (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }
                else // ask if passenger would like a first class ticket instead
                {
                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        firstClass(seating);

                    }
                    else
                    {
                        System.out.println("please be patient, Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }



    public static void firstClass(boolean[] seating) {

       // Scanner input = new Scanner(System.in);
        for (int counter = 1; counter <= 5; counter++) {
            if (seating[counter] == false)  // if false, then a seat is available for assignment
            {
                seating[counter] = true;  // assign seat
                System.out.printf("You've booked for first class. Seat# %d\n", counter);
                break;
            } else if (seating[5] == true) // If seating[5] is true then first class is fully booked
            {
                if (seating[10] == true) // If seating[10] is true then economy (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else // ask passenger if they would like an economy ticket instead
                {
                    System.out.println("First Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {economySeat(seating);
                    }
                    else
                    {
                        System.out.println("Please be patient, Next flight is in 3 hours.");
                        System.exit(0);
                    }
            }
        }
    }
}
}