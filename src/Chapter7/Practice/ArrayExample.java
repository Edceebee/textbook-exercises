package Chapter7.Practice;

public class ArrayExample {


    public static void main(String[] args) {
        //final int array_length = 10;


        int c [] = new int[10];

        System.out.println("  Index" + "    " + "Value");

        for (int i = 0; i < c.length; i++ )
        {
            c[i] = 2 + 2 * i;
            System.out.printf("%5d%8d%n", i, c[i]);

        }
    }
}
