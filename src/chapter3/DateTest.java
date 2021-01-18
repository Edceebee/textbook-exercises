package chapter3;


import javax.swing.*;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Date todayDate = new Date(12, 03, 2020);

        System.out.printf("Month is: %d%nDay is: %d%nYear is: %d%n", todayDate.getDay(),
                todayDate.getMonth(), todayDate.getYear() );


        System.out.println("Enter Month"); 				  // prompt
        todayDate.setMonth(input.nextInt());

        System.out.println("Enter Day");
        todayDate.setDay(input.nextInt());

        System.out.println("Enter Year");
        todayDate.setYear(input.nextInt());

        System.out.print(todayDate.displayDate());


    }



}
