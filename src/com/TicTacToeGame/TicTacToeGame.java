package com.TicTacToeGame;
import java.util.Scanner;
/*uc2*/
public class TicTacToeGame {
	public static Scanner sc = new Scanner(System.in);
	public static char player, computer;
	private void createGameBoard()
	{
		char[] board = new char[10];
		for(int idx = 1; idx < board.length ; idx++)
		{
			board[idx]= ' ';
		}
	}
	private void chooseLetter() {
		System.out.println("Enter the Letter 'X' or 'O'");
		while (true) {
			player = sc.next().charAt(0);
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

	public static void main(String[] args) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		ticTacToe.createGameBoard();
		ticTacToe.chooseLetter();

	}
}
