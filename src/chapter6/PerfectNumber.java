package chapter6;
/* (Perfect Numbers) An integer number is said to be a perfect number if its factors, including 1 (but not the
  number itself), sum to the number. For example, 6 is a perfect number, because 6 = 1 + 2 + 3. Write a method
  isPerfect that determines whether parameter number is a perfect number. Use this method in an application that
  displays all the perfect numbers between 1 and 1000. Display the factors of each perfect number to confirm that
  the number is indeed perfect. Challenge the computing power of your computer by testing numbers much larger
  than 1000. Display the results. */


import java.util.Scanner;
class PerfectNumbers {

    public static void main(String[] args) {

        int user;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number up to which you would like to look for perfect numbers:");
        user = input.nextInt();

        for (int num = 1; num <= user; num++) {
            if (isPerfect(num)) {
                System.out.println("The number " + num + " is a perfect number");
                System.out.println("It's factors are:" + isPerfect(num));
            }
        }

    }
    public static Boolean isPerfect(int num) {


        int sum = 0;

        for (int factor = 1; factor < num; factor++) {
            if (num % factor == 0) {
                sum += factor;
            }
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }

}