package chapter8;

/* (Rational Numbers) Create a class called Rational for performing arithmetic with fractions.
        Write a program to test your class. Use integer variables to represent the private instance variables
        of the class—the numerator and the denominator. Provide a constructor that enables an object of
        this class to be initialized when it’s declared. The constructor should store the fraction in reduced
form. The fraction
2/4
is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator.
Provide a no-argument constructor with default values in case no initializers are provided. Provide
public methods that perform each of the following operations:
a) Add two Rational numbers: The result of the addition should be stored in reduced
form. Implement this as a static method.
b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced
form. Implement this as a static method.
c) Multiply two Rational numbers: The result of the multiplication should be stored in
reduced form. Implement this as a static method.
d) Divide two Rational numbers: The result of the division should be stored in reduced
form. Implement this as a static method.
e) Return a String representation of a Rational number in the form a/b, where a is the
numerator and b is the denominator.
f) Return a String representation of a Rational number in floating-point format. (Consider
providing formatting capabilities that enable the user of the class to specify the
number of digits of precision to the right of the decimal point.) */


public class RationalNumbers {
    private int numerator;
    private int denominator;

    public RationalNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumbers() {
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String convertToRationalNumber(int numerator, int denominator) {
        String rational = numerator + "/" + denominator;
        //System.out.println("Rational number is: " + rational);
        return rational;
    }


    public  int findLCMOfDenominator( int denominator1, int denominator2, int numerator1, int numerator2) {

        int max;
        int step;
        int lcm = 0;

        if (denominator1 > denominator2) {
            max = step = denominator1;
        } else {
            max = step = denominator2;
        }

        while (denominator1 != 0) {
            if (max % denominator1 == 0 && max % denominator2 == 0) {
                lcm = max;

                break;
            }
           // int total = (lcm / denominator1 * numerator1) + (lcm / denominator2 * numerator2);
            max += step;
        }
        int total = (lcm / denominator1 * numerator1) + (lcm / denominator2 * numerator2);

        return total;
    }

}
