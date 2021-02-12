package chapter8;

/*(Complex Numbers) Create a class called Complex for performing arithmetic with complex
        numbers. Complex numbers have the form
        realPart + imaginaryPart * i
        where i is -1
Write a program to test your class. Use floating-point variables to represent the private data of the
class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
Provide a no-argument constructor with default values in case no initializers are provided. Provide
public methods that perform the following operations:
a) Add two Complex numbers: The real parts are added together and the imaginary parts
are added together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from
the real part of the left operand, and the imaginary part of the right operand is subtracted
from the imaginary part of the left operand.
c) Print Complex numbers in the form (realPart, imaginaryPart). */


public class ComplexNumber {
    private final float complex1 = 3 + 5;
    private final float complex2 = 5 + 23;
    private final float value = -1;

    public ComplexNumber(float realNumber, float imaginaryNumber, float value) {

//        this.complex1 = imaginaryNumber;
//        this.complex2 = realNumber;
        //this.value = -1;

    }

    public ComplexNumber() {
    }

    public void setComplex1(float complex1) {

    }

    public float getComplex1() {
        return complex1;
    }

    public void setComplex2(float complex2) {
        //this.realNumber = realNumber;
    }

    public float getComplex2() {
        return complex2;
    }

    public void setValue(float value) {
    }

    public float getValue() {
        return value;
    }


    public float addition(float complex2, float complex1, float value) {
        float addition = (complex1 * value) + (complex2 * value);
        System.out.println("addition of complex value is: " + addition);
        return addition;
    }


    public float subtraction(float complex1, float complex2, float value) {
        float subtraction = (complex1 * value) - (complex2 * value);
        System.out.println("Subtraction of complex value is: " + subtraction);
        return subtraction;
    }

    public String printComplexNumber() {
        System.out.printf("complex1 is: %f complex2 is: %f value is: %f", complex1, complex2, value);
      //  return 0;
        return null;
    }
}

