package com.TicTacToeGame;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createGameBoard();

	}
	private static char[] createGameBoard()
	{
		char[] board = new char[10];
		for(int i=1;i<board.length ;i++)
		{
			board[i]= ' ';
		}
		return board;
	}

}
