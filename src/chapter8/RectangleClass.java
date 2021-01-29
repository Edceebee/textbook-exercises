package chapter8;

/* (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
        defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
        methods for both length and width. The set methods should verify that length and width are each
        floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle. */

import javax.swing.*;

public class RectangleClass {
    private float length;
    private int width;


    public void RectangleClass(float length, int width) {


        this.length = length;
        this.width = width;
    }

    public float calculateRectangleArea (float length, float width){
        float area;
        area = length * width;
        return area;
    }


}

class RectangleClassTest{
    public static void main(String[] args) {
        RectangleClass calculate = new RectangleClass();

        float length = Float.parseFloat(JOptionPane.showInputDialog("Enter length of rectangle"));
        float width = Float.parseFloat(JOptionPane.showInputDialog("Enter width of rectangle"));
        if (length < 0.0 || length > 20.0)

        {
            throw new IllegalArgumentException ("length was out of range");
        }

        if (width < 0.0 || width > 20.0 )
        {
            throw new IllegalArgumentException ("width was out of range");
        }


        System.out.println("Area of rectangle is" + " " + calculate.calculateRectangleArea(length, width));
    }
}