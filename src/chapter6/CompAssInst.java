
package chapter6;

/* As computer costs decline, it becomes feasible for every student, regardless of economic circumstance,
        to have a computer and use it in school. This creates exciting possibilities for improving the
        educational experience of all students worldwide, as suggested by the next five exercises. [Note:
        Check out initiatives such as the One Laptop Per Child Project (www.laptop.org). Also, research
        “green” laptops—what are some key “going green” characteristics of these devices? Look into the
        Electronic Product Environmental Assessment Tool (www.epeat.net), which can help you assess
        the “greenness” of desktops, notebooks and monitors to help you decide which products to purchase.]
        6.35 (Computer-Assisted Instruction) The use of computers in education is referred to as computer-
 assisted instruction (CAI). Write a program that will help an elementary school student learn multiplication.
        Use a SecureRandom object to produce two positive one-digit integers. The program
        should then prompt the user with a question, such as
        How much is 6 times 7?
        The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
        display the message "Very good!" and ask another multiplication question. If the answer is wrong,
        display the message "No. Please try again." and let the student try the same question repeatedly
    until the student finally gets it right. A separate method should be used to generate each new question.
        This method should be called once when the application begins execution and each time the
        user answers the question correctly. */

import java.security.SecureRandom;
import java.util.Scanner;

public class CompAssInst {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter number 1 for Addition, 2 for subtraction, 3 for multiplication, 4 for division ");
        number = input.nextInt();
        if (number > 4)
            System.out.println("Enter valid number");

        while (number > 4) {
            System.out.println("Enter number 1 for Addition, 2 for subtraction, 3 for multiplication, 4 for division ");
            number = input.nextInt();
            if (number > 4)
                System.out.println("Enter valid number mumu");
        }

        while (number == 3) {


            while (true) {
                int num1 = 1 + random.nextInt(9);
                int num2 = 1 + random.nextInt(9);

                System.out.println("What is " + num1 + " times " + num2 + "?");
                int number3 = input.nextInt();

                if (num1 * num2 == number3) {
                    System.out.println("Nice Work");
                } else {
                    System.out.println("Wrong Answer");

                    while (number3 != (num1 * num2)) {

                        System.out.println("Please try again");
                        System.out.println("What is " + num1 + " times " + num2 + "?");
                        number3 = input.nextInt();

                        if (number3 == num1 * num2)
                            System.out.println("Very Good!");
                    }
                }

            }


        }

        while (number == 1) {
            while (true) {
                int num1 = 3 + random.nextInt(100);
                int num2 = 3 + random.nextInt(100);

                System.out.println("What is " + num1 + " + " + num2 + "?");
                int number3 = input.nextInt();

                if (num1 + num2 == number3) {
                    System.out.println("Nice Work");
                } else {
                    System.out.println("Wrong Answer");

                    while (number3 != (num1 + num2)) {

                        System.out.println("Please try again");
                        System.out.println("What is " + num1 + " + " + num2 + "?");
                        number3 = input.nextInt();

                        if (number3 == num1 + num2)
                            System.out.println("Very Good!");
                    }
                }

            }


        }
        while ((number == 2)) {
            while (true) {
                int num1 = 1 + random.nextInt(9);
                int num2 = 1 + random.nextInt(9);

                System.out.println("What is " + num1 + " - " + num2 + "?");
                int number3 = input.nextInt();

                if (num1 - num2 == number3) {
                    System.out.println("Nice Work");
                } else {
                    System.out.println("Wrong Answer");

                    while (number3 != (num1 - num2)) {

                        System.out.println("Please try again");
                        System.out.println("What is " + num1 + " - " + num2 + "?");
                        number3 = input.nextInt();

                        if (number3 == num1 - num2)
                            System.out.println("Very Good!");
                    }
                }

            }


        }
        while ((number == 4)) {
            while (true) {
                int num1 = 1 + random.nextInt(9);
                int num2 = 1 + random.nextInt(9);

                System.out.println("What is " + num1 + " / " + num2 + "?");
                int number3 = input.nextInt();

                if (num1 / num2 == number3) {
                    System.out.println("Correct answer, Nice Work");
                } else {
                    System.out.println("Wrong Answer");

                    while (number3 != (num1 / num2)) {

                        System.out.println("Please try again");
                        System.out.println("What is " + num1 + " - " + num2 + "?");
                        number3 = input.nextInt();

                        if (number3 == num1 / num2)
                            System.out.println("Very Good!");
                    }
                }


            }

        }


    }
}

