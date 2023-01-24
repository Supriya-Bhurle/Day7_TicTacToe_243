package com.bridgelabz.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}};
        printBOARD(gameBoard);
        
    }

    private static void printBOARD(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");

            }
            System.out.println();
        }
    }
}