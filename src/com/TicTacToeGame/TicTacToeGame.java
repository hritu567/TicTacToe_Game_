package com.TicTacToeGame;
import java.util.Scanner;
/*uc2*/
public class TicTacToeGame {
	public static Scanner s = new Scanner(System.in);
	public static char player, computer;
	private void createGameBoard()
	{
		char[] board = new char[10];
		for(int idx = 1; idx < board.length ; idx++)
		{
			board[idx]= ' ';
		}
	}
	/* choosing letter for player and computer */
	private void chooseLetter() {
		System.out.println("Enter the Letter 'X' or 'O'");
		while (true) {
			player = s.next().charAt(0);
			if (player == 'X' || player == 'x') {
				computer = 'O';
			} else if (player == '0' || player == 'o') {
				computer = 'X';
			} else {
				System.out.println("Invalid Choice, Please enter letter 'X' or 'O'");
				continue;
			}
		}
	}
/* calling other functions into main function*/
	public static void main(String[] args) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		ticTacToe.createGameBoard();
		ticTacToe.chooseLetter();

	}
}
