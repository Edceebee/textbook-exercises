package Chapter7.Practice;

public class InitArray {
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
