package Chapter7;

//public class ArrayExample {
//
//    public static void main(String[] args) {
//        //final int array_length = 10;
//
//
//        int c [] = new int[10];
//
//        System.out.println("  Index" + "    " + "Value");
//
//        for (int i = 0; i < c.length; i++ )
//        {
//            c[i] = 2 + 2 * i;
//            System.out.printf("%5d%8d%n", i, c[i]);
//
//        }
//    }
//}

//        class BarChart {
//
//        public static void main(String[] args) {
//
//         int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
//
//         System.out.println("Grade distribution:");
//
//         // for each array element, output a bar of the chart
//         for (int counter = 0; counter < array.length; counter++)
//         {
//         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
//
//         System.out.printf("%02d - %02d: ", counter * 10, counter * 10 + 9);
//             if (counter == 10)
//                 System.out.printf("%4d: ", 100);
//
//         for (int stars = 0; stars < array[counter]; stars++)
//             System.out.print("*");
//
//         System.out.println();
//
//         }
//         }
//         } // end class BarChart

//import java.security.SecureRandom;
//
// class RollDie {
//        public static void main(String[] args) {
//            SecureRandom randomNumbers = new SecureRandom();
//            int[] frequency = new int[7]; // array of frequency counters
//
//            // roll die 6,000,000 times; use die value as frequency index
//            for (int roll = 0; roll < 6000000; roll++)
//                ++frequency[1 + randomNumbers.nextInt(6)];
//
//                System.out.printf("%s%10s%n", "Face", "Frequency");
//
//                // output each array element's value
//                for (int face = 0; face < frequency.length; face++)
//                    System.out.printf("%4d%10d%n", face, frequency[face]);
//
//
//        }
//        } // end class RollDie

//class EnhancedForTest {
//         public static void main(String[] args)
//         {
//         int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//         int total = 0;
//
//             // add each element's value to total
//            for (int number : array)
//           //  for(int counter = 0; counter < array.length; counter++ )
//                 total += number;
//
//         System.out.printf("Total of array elements: %d%n", total);
//         }

 class InitArray{
public static void main(String[] args){

    int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

    System.out.println("Values in array1 by row are");
     outputArray(array1); // displays array1 by row

     System.out.printf("%nValues in array2 by row are%n");
     outputArray(array2); // displays array2 by row
     }

    private static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
// loop through columns of current row
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d ", array[row][column]);
            System.out.println();
        }

        // output rows and columns of a two-dimensional array}
    }
    }

