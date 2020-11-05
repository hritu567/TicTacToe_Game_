package com.TicTacToeGame;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = creategameBoard();

	}
	private static char[] creategameBoard()
	{
		char[] board = new char[10];
		for(int i=1;i<board.length ;i++)
		{
			board[i]= ' ';
		}
		return board;
	}

}
