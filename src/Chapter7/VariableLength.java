package Chapter7;


/*(Variable-Length Argument List) Write an application that calculates the product of a series
   of integers that are passed to method product using a variable-length argument list. Test your method
   with several calls, each with a different number of arguments.*/


import static Chapter7.VariableLength.product;

public class VariableLength {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        System.out.println("The product of array is " + product(array));
    }



    public static int product(int... list)
    {
        int total = 1;

        // add all the values in list array
        for (int i = 1; i < list.length; i++)
        {
            total *= list[i];
        }

        return total;
    }
}











