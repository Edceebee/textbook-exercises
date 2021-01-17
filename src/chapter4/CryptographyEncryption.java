package chapter4;

/* (Enforcing Privacy with Cryptography) The explosive growth of Internet communications and data storage on
Internet-connected computers has greatly increased privacy concerns. The field of cryptography is concerned with coding
data to make it difficult (and hopefully—with the most advanced schemes—impossible) for unauthorized users to read. In this
 exercise you’ll investigate a simple scheme for encrypting and decrypting data. A company that wants to send data over the
 Internet has asked you to write a program that will encrypt it so that it may be transmitted more securely. All the data
 is transmitted as four-digit integers. Your application should read a four-digit integer entered by the user and encrypt
 it as follows: Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the
 new value by 10. Then swap the first digit with the third, and swap the second digit with the fourth. Then print the
 encrypted integer. Write a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing
 the encryption scheme) to form the original number. [Optional reading project: Research “public key cryptography” in
 general and the PGP (Pretty Good Privacy) specific public key scheme. You may also want to investigate the RSA scheme,
 which is widely used in industrial-strength applications.]  */

import java.util.Scanner;
public class CryptographyEncryption {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double digit1;
        double digit2;
        double digit3;
        double digit4;

        System.out.println("Enter first digit or -1 to cancel");
        digit1 = input.nextDouble();

        System.out.println("Enter second digit or -1 to cancel");
        digit2 = input.nextDouble();

        System.out.println("Enter third digit or -1 to cancel");
        digit3 = input.nextDouble();

        System.out.println("Enter fourth digit or -1 to cancel");
        digit4 = input.nextDouble();

        digit1 = (7 + digit1) / 10;
        digit2 = (7 + digit2) / 10;
        digit3 = (7 + digit3) / 10;
        digit4 = (7 + digit4) / 10;

        digit1 = digit3;
        digit2 = digit4;

        System.out.printf("digit1 is %.2f, digit2 is %.2f, digit3 is %.2f, digit 4 is %.2f%n", digit1, digit2, digit3, digit4);


        while (digit1 != -1) {

                digit1 = (7 + digit1) / 10;
                digit2 = (7 + digit2) / 10;
                digit3 = (7 + digit3) / 10;
                digit4 = (7 + digit4) / 10;

                digit1 = digit3;
                digit2 = digit4;

                System.out.println("Enter first digit or -1 to cancel");
                digit1 = input.nextDouble();

                System.out.println("Enter second digit or -1 to cancel");
                digit2 = input.nextDouble();

                System.out.println("Enter third digit or -1 to cancel");
                digit3 = input.nextDouble();

                System.out.println("Enter fourth digit or -1 to cancel");
                digit4 = input.nextDouble();

                System.out.printf("digit1 is %.2f, digit2 is %.2f, digit3 is %.2f, digit 4 is %.2f\n", digit1, digit2, digit3, digit4);
            }

    }
}
