package ticTacToe;

import javax.sound.midi.VoiceStatus;

public class TicTacToe {
	
	private static char[][] playingField = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

	public static void main(String[] args) {
		//Building the Tic-Tac-Toe board
		refereshBoard(playingField);
		
		System.out.println("First move play");
		playMove(playingField, 5, "player");
	}

	private static void refereshBoard(char [][] board) {
		System.out.println("===== TicTacToe =====");
		for (char[] cs : board) {
			System.out.print(cs);
			System.out.print("\n");
		}
		System.out.println("== by: Jean-Yves.K == \n"
				+ "----------------------------------------- \n");
	}
	
	public static void playMove(char[][] playingField, int pos, String player) {
		int position = 1;
		char playerSymbol = 'Y';
		
		if(player.equals("player")) {
			playerSymbol = 'O';
		}else if(player.equals("cpu")) {
			playerSymbol = 'X';
		}		
		
		switch (pos) {
		case 1: 
			playingField[0][0] = playerSymbol;
			break;
		case 2:
			playingField[0][2] = playerSymbol;
		case 3: 
			playingField[0][4] = playerSymbol;
			break;
		case 4:
			playingField[2][0] = playerSymbol;
		case 5: 
			playingField[2][2] = playerSymbol;
			break;
		case 6:
			playingField[2][4] = playerSymbol;
		case 7: 
			playingField[4][0] = playerSymbol;
			break;
		case 8:
			playingField[4][2] = playerSymbol;
		case 9:
			playingField[4][4] = playerSymbol;
		default:
			break;
		}
		
		refereshBoard(playingField);
		
	}

}
