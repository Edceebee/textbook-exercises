package Chapter7;

/*Use a one-dimensional array to solve the following problem: A company
        pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
        their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives
        $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
        that determines how many of the salespeople earned salaries in each of the following ranges (assume
        that each salesperson’s salary is truncated to an integer amount):
        a) $200–299
        b) $300–399
        c) $400–499
        d) $500–599
        e) $600–699
        f) $700–799
        g) $800–899
        h) $900–999
        i) $1,000 and over
        Summarize the results in tabular format */

public class SalesCommission {
        public static void main (String args [])
        {

            double[] salary = { 0, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200};
            int[] value = new int [11];
            System.out.printf( "%s:%20s:\n", "Index", " Value");

            for (double v : salary) {
                if (10 <= (int) Math.floor(((v * (.9) + 200) * .01)))
                    ++value[10];

                else
                    ++value[(int) Math.floor(((v * (.9) + 200) * .01))];
            }

            for (int index1 =2; index1<value.length-1; index1++)
                System.out.printf("$%5d-%5d: %10d\n",
                        index1 *100,index1 * 100 + 99, value[index1]);



            for (int index2 =11; index2<= value.length; index2++ )
                System.out.printf( "$%5d%5s: 20d\n", index2*100-100, "& more", value[10]);

        }
    }

