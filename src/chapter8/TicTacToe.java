package chapter8;

/* (Tic-Tac-Toe) Create a class TicTacToe that will enable you to write a program to play Tic-
        Tac-Toe. The class contains a private 3-by-3 two-dimensional array. Use an enum type to represent
        the value in each cell of the array. The enum’s constants should be named X, O and EMPTY (for a position
        that does not contain an X or an O). The constructor should initialize the board elements to
        EMPTY. Allow two human players. Wherever the first player moves, place an X in the specified square,
        and place an O wherever the second player moves. Each move must be to an empty square. After
        each move, determine whether the game has been won and whether it’s a draw. If you feel ambitious,
        modify your program so that the computer makes the moves for one of the players. Also, allow
        the player to specify whether he or she wants to go first or second. If you feel exceptionally ambitious,
        develop a program that will play three-dimensional Tic-Tac-Toe on a 4-by-4-by-4 board
        [Note: This is an extremely challenging project!].

         pseudocode

         1. create a 3x3 array
         2. initialize the array to "-"
         3. prompt and ask the players for their names
         4. Create a player1 boolean that is true if it is player 1's turn and false if it is player 2's turn
         5. Create a gameEnded boolean and use it as the condition in the while loop
         */


import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Let's play Tic Tac Toe!\n Player 1, what is your name? ");

        String p1 = input.nextLine();
        System.out.println("Player 2, what is your name? ");
        String p2 = input.nextLine();


        boolean player1 = true;

        boolean gameEnded = false;
        while (!gameEnded) {

            drawBoard(board);


            if (player1) {
                System.out.println(p1 + "'s Turn (x):");
            } else {
                System.out.println(p2 + "'s Turn (o):");
            }

            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }


            int row = 0;
            int col = 0;
            int position;

            while (true) {
                System.out.print("Enter a row number (any number from 1-9 to \n choose a position to play on): ");
                position = input.nextInt();

                switch (position) {
                    case 1 -> board[0][0] = c;
                    case 2 -> board[0][1] = c;
                    case 3 -> board[0][2] = c;
                    case 4 -> board[1][0] = c;
                    case 5 -> board[1][1] = c;
                    case 6 -> board[1][2] = c;
                    case 7 -> board[2][0] = c;
                    case 8 -> board[2][1] = c;
                    case 9 -> board[2][2] = c;
                }
//                System.out.print("Enter a row number (0, 1, or 2): ");
//                row = input.nextInt();
//               System.out.print("Enter a column number (0, 1, or 2): ");
//                col = input.nextInt();

                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("This position is off the bounds of the board! Try again.");


                } else if (board[row][col] != '-') {
                    System.out.println("Someone has already made a move at this position! Try again.");


                } else {
                    break;
                }

            }

            board[row][col] = c;

            if (playerHasWon(board) == 'x') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if (playerHasWon(board) == 'o') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else {

                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    player1 = !player1;
                }

            }

        }

        //Draw the board at the end of the game
        drawBoard(board);

    }


    public static void drawBoard(char[][] board) {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            //This print statement makes a new line so that each row is on a separate line
            System.out.println();
        }
    }

    public static char playerHasWon(char[][] board) {

        //Check each row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

        //Check each column
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        //Check the diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        //Otherwise nobody has not won yet
        return ' ';

    }

    public static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

