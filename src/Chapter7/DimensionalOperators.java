package Chapter7;

/* Write statements that perform the following one-dimensional-array operations:
        a) Set the 10 elements of integer array counts to zero.
        b) Add one to each of the 15 elements of integer array bonus.
        c) Display the five values of integer array bestScores in column format. */


public class DimensionalOperators {

    public static void main(String [] args){
        // a) Set the 10 elements of integer array counts to zero.
        int [] newArray = new int[10];
        for (int i = 10; i == 0; i--) {
            System.out.println("Count to zero from 10 elements" + newArray);
        }


        // b) Add one to each of the 15 elements of integer array bonus.
        int [] arrayBonus = new int[15];
        for (int i = 0; i <arrayBonus.length; i++) {
            System.out.println("Bonus array values "+ arrayBonus[i]);
        }


        //c) Display the five values of integer array bestScores in column format.
        int [] bestScores = {15,10,20,30,40};
        System.out.printf("%n%s%12s %n", "Value", "BestScores");
        for (int counter = 0; counter < bestScores.length ; counter++) {

            System.out.printf( "%d%9d%n" , counter , bestScores[counter]);
        }
    }
}

