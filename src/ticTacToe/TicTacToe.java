package ticTacToe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class TicTacToe {
	
	private static char[][] playingField = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};
	
	private static ArrayList<String> players = new ArrayList<String>();
	private static ArrayList<Integer> movesPlayed = new ArrayList<>();

	public static void main(String[] args) {
		//Building the Tic-Tac-Toe board
		loadGameboard(playingField);
		
		//set players of the game
		players.add("cpu");
		players.add("player");
		
		playGame();
		
	}
	
	
	/**
	 * playGame(): all game logic resides here
	 */
	public static void playGame() {
		//get a random player to start the game
		String player = players.get(new Random().nextInt(2));
		//need to run game continuously until a winner is found
		while(true) {
			if(player.equals("player") && !isGameTied(playingField)) {
				Scanner userInput = new Scanner(System.in); 
				System.out.println("Please enter a position " + player);
				int pPosition = userInput.nextInt();
				//check that position isn't taken and if so, get player to select another//
				while(movesPlayed.contains(pPosition)) {
					System.out.println("Sorry that position is has already been played! Pick another");
					userInput = new Scanner(System.in);
					pPosition = userInput.nextInt();
				}
				//Add played position in list once found not to be there already
				movesPlayed.add(pPosition);
				
				placePiece(playingField, pPosition, "player");
				//Player should now be set to cpu next for next time
				player = players.get(0).toString();
				loadGameboard(playingField);
				
				
			}else if(player.equals("cpu") && !isGameTied(playingField)){
				int cPosition = new Random().nextInt(9)+1;
				//need to check that position isn't taken before placing piece or generate another
				while(movesPlayed.contains(cPosition)) {
					System.out.println("CPU played: "+cPosition+" but it was taken!");
					cPosition = new Random().nextInt(9)+1;
				}
				//Add played position in list once found not to be there already
				movesPlayed.add(cPosition);
				
				System.out.println(player + " played: " + cPosition);
				placePiece(playingField, cPosition, player);
				//Player should now be set to player next for next time
				player = players.get(1).toString();
				loadGameboard(playingField);
				
			}else
				System.out.println("No Winner Found!");
				//break;
		}
	}
	
	private static boolean isWinnerFound(char [][] board) {
		boolean winnerFound = false;
		//arraylist containing all played positions will be traversed for all possible winning combination for either player or cpu
		
		return winnerFound;
	}
	
	private static boolean isGameTied(char [][] board) {
		boolean isTied = false;
		//need to note down each position played - arralist
		
		//ONLY if board is full && !winnerFound (if arraylist has 9)
			//return true -- meaning game is tied
		
		
		return isTied;
	}
	

	/**
	 * loadGameboard(): redraws the Tic-Tac-Toe board on the screen
	 * @param board: the board being drawn
	 */
	private static void loadGameboard(char [][] board) {
		System.out.println("");
		System.out.println("===== TicTacToe =====");
		System.out.println("");
		System.out.println("CPU = X");
		System.out.println("YOU = O");
		System.out.println("");
		System.out.println("To play use No.s [1 - 9]");
		System.out.println("");
		for (char[] cs : board) {
			System.out.print(cs);
			System.out.print("\n");
		}
		System.out.println("");
		System.out.println("== by: Jean-Yves.K == \n"
				+ "----------------------------------------- \n");
	}
	
		
	/**
	 * placePiece(): places a piece on the board and shows us the board again
	 * @param playingField: the Tic-Tac-Toe board
	 * @param pos: the position of move being played
	 * @param player: which player's turn it is
	 */
	public static void placePiece(char[][] playingField, int pos, String player) {
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
	}
}
