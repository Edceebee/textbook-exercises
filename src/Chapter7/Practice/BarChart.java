package Chapter7.Practice;

public class BarChart {
    public static void main(String[] args) {

        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Grade distribution:");

        // for each array element, output a bar of the chart
        for (int counter = 0; counter < array.length; counter++)
        {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")

            System.out.printf("%02d - %02d: ", counter * 10, counter * 10 + 9);
            if (counter == 10)
                System.out.printf("%4d: ", 100);

            for (int stars = 0; stars < array[counter]; stars++)
                System.out.print("*");

            System.out.println();

        }
    }
} // end class BarChart


