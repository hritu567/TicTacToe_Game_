package com.TicTacToeGame;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createGameBoard();

	}
	private static char[] createGameBoard()
	{
		char[] board = new char[10];
		for(int idx=1 ; i < board.length ; idx++)
		{
			board[i] = ' ';
		}
		return board;
	}

}
