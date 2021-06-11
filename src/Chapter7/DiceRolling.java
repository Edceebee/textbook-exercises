package Chapter7;
/*(Dice Rolling) Write an application to simulate the rolling of two dice. The application
        should use an object of class Random once to roll the first die and again to roll the second die. The
        sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
        the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
        least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
         should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
        each possible sum appears. Display the results in tabular format.
         */
import java.util.Random;

public class DiceRolling {
    static Random randomNumbers = new Random();

    public static void main(String[] args) {

        int [] a = new int[36000001];
        
        int [] frequency = new int[37];
        
        for(int i=0;i<a.length;i++){
        
            ++frequency[sum(rollDice1(),rollDice2())];
        
        }


        for(int j=2;j<frequency.length;j++){
        
            System.out.printf("%4d%10d\n",j,frequency[j]);
                }

    }

    private static int sum(int rollDice1, int rollDice2) {
        int sum = rollDice1+ rollDice2;
        return sum;
    }

    public static int rollDice2 (){
        int dice2 = 1+randomNumbers.nextInt(6);


        return dice2;

    }

    private static int rollDice1() {
        int dice1= 1+randomNumbers.nextInt(6);

        return dice1;
    }
}

