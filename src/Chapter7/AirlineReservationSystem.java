package Chapter7;


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
public class AirlineReservationSystem {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean seats [] = new boolean[10];
            int firstClass = 0;
            int econClass = 0;
            int option;

            for(int count = 1; count <= 10;){
                System.out.print("Where would you like to be seated? (press 1 for first class or 2 for economy): ");
                option = input.nextInt();

                if(option == 1){
                    if(firstClass <= 4){
                        seats[firstClass++] = true;
                        System.out.printf("Your seat number for First Class is: %d\n", count);
                    }
                }
                if(seats[econClass++] = false){
                    System.out.print("Sorry, but first class is full.");
                    if(firstClass > 5){
                        System.out.print("Would you like to go to Economy? (1 = yes and 2 = no): ");
                        int selection = input.nextInt();
                        if(selection == 1){
                            seats[econClass++] = true;
                            System.out.printf("You have a seat in Economy which is seat: %d\n", count);
                        }
                        else
                            System.out.print("Next flight leaves in 3 hours!");
                        break;
                    }
                }

                else if(option == 2){
                    if(econClass <= 6){
                        seats[econClass++] = true;
                        System.out.printf("Your seat number for Economy is: %d\n", count);
                    }
                }
                if(seats[econClass++] = false){
                    System.out.print("Sorry, but Economy is full.");
                    if(econClass > 6){
                        System.out.print("Would you like to go to First Class? (1 = yes and 2 = no): ");
                        int selection = input.nextInt();
                        if(selection == 1){
                            seats[firstClass++] = true;
                            System.out.printf("You have a seat in First Class which is seat: %d\n", count);
                        }
                        else
                            System.out.print("Next flight leaves in 3 hours!");
                    }
                }
            }
        }
    }
