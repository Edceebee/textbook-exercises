package chapter5;

public class Shapes2 {

        public static void main(String[] args) {
            int row;
            int column;
            for (column = 0; column < 10; column++) {
                for (row = 0; row < column; row++) {
                    System.out.print("*");
                }
                System.out.println("  ");
            }
            for (column = 10; column > 0; column--) {
                for (row = 1; row < column; row++) {
                    System.out.print("*");

                }
                System.out.println("  ");
            }
            for (column = 0; column < 10; column++) {

                for (row = 0; row < column; row++) {
                    System.out.print("*");

                }
                System.out.println("  ");
            }
        }
    }


