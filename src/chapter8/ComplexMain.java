package chapter8;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumber newComplex = new ComplexNumber();

        newComplex.printComplexNumber();

        newComplex.addition(7 + 4, 10 + 23, -2);
        newComplex.subtraction(7 + 3, 5 + 6, -2);

    }
}
