package com.TicTacToeGame;
import java.util.Scanner;
/*uc3*/
public class TicTacToeGame {
	static char[] board = new char[10];
	public static Scanner s = new Scanner(System.in);
	public static char player, computer;
	
	private char[] createGameBoard()
	{
		char[] board = new char[10];
		for(int idx = 1; idx < board.length ; idx++)
		{
			board[idx]= ' ';
		}
		return board;
	}	
	/* choosing letter for player and computer */	
	private void chooseLetter() {
		System.out.println("Enter the Letter 'X' or 'O'");
			player = s.next().charAt(0);
			if (player == 'X' || player == 'x') {
				computer = 'O';
			} else if (player == '0' || player == 'o') {
				computer = 'X';
			} else {
				System.out.println("Invalid Choice, Please enter letter 'X' or 'O'");
				player = s.next().charAt(0);
			}
		}
	/* Printing out the game Board */
	private static void showBoard() {
		for (int idx = 1; idx < board.length; idx = idx + 3) {
			System.out.println( " | " + board[idx] +" | "  + board[idx+1]  + " | "  + board[idx+2] );
		}
	}
	
/* calling other functions into main function*/
	public static void main(String[] args) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		char[] board = ticTacToe.createGameBoard();
		ticTacToe.chooseLetter();
		showBoard();
	}
}
