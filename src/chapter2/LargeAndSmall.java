package Excercises;


    // Write an application that reads five integers and determines and prints the largest and smallest integers
// in the group.

		import java.util.Scanner;

    public class LargeAndSmall {

        public static void main (String [] args) {

            Scanner input = new Scanner(System.in);

            int num = 0;
            int counter = 1;
            int largestNumber = 0;// = Integer.MIN_VALUE;
            int smallestNumber = 0;


            while (counter <= 5) {

                System.out.print("Enter number to compare");  // prompt
                num = input.nextInt();

                if (counter == 1) {
                    largestNumber = num;
                }

                if (num > largestNumber) {

                    largestNumber = num;
                }

                if(counter ==1) {
                    smallestNumber = num;
                }
                if (num < smallestNumber){
                    smallestNumber = num;
                }

            counter++;
        }
         System.out.printf("Largest number is: %d%n "   ,largestNumber);
            System.out.printf("Smallest number is: %d%n "  ,smallestNumber);

            }





        }


