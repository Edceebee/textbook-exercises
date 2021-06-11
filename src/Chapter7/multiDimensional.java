package Chapter7;

//Consider a two-by-three integer array t.
// a)   Write a statement that declares and creates t.
// b)   How many rows does t have?
// c)   How many columns does t have?
// d)   How many elements does t have?
// e)   Write access expressions for all the elements in row 1 of t.
// f)   Write access expressions for all the elements in column 2 of t.
// g)   Write a single statement that sets the element of t in row 0 and column 1 to zero.
// h)   Write individual statements to initialize each element of t to zero.
// i)   Write a nested for statement that initializes each element of t to zero.
// j)   Write a nested for statement that inputs the values for the elements of t from the user.
// k)   Write a series of statements that determines and displays the smallest value in t.
// l)    Write a single printf statement that displays the elements of the first row of t.
// m)    Write a statement that totals the elements of the third column of t. Do not use repetition.
// n)   Write a series of statements that displays the contents of t in tabular format. List the column
//      indices as headings across the top, and list the row indices at the left of each row.

public class multiDimensional {
    public static void main(String[] args) {
        int [][] t = new int[3][7];
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++)
             System.out.printf("%d  ", t[row][column]);
             System.out.println();


     }

   }

}
