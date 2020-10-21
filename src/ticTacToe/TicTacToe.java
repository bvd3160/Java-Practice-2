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
		//set players of the game
		players.add("cpu");
		players.add("player");
		loadGameboard(playingField);
		playGame(playingField);
	}
	
	
	/**
	 * playGame(): all game logic resides here
	 */
	public static void playGame(char [][] board) {
		//get a random player to start the game
		String player = players.get(new Random().nextInt(2));
		//need to run game continuously until a winner is found
		while(!isGameTied(board) && !isWinnerFound(board)) {
			if(player.equals("player")) {
				Scanner userInput = new Scanner(System.in); 
				System.out.println("Please enter a position " + player);
				int pPosition = userInput.nextInt();
				//check that position isn't taken and if so, get player to select another//
				while(movesPlayed.contains(pPosition) && isPosValid(pPosition, player)) {
					System.out.println("Sorry that position is has already been played! Pick another");
					userInput = new Scanner(System.in);
					pPosition = userInput.nextInt();
				}
				//Add played position in list once found not to be there already
				movesPlayed.add(pPosition);
				
				placePiece(board, pPosition, "player");
				//Player should now be set to cpu next for next time
				player = players.get(0).toString();
				loadGameboard(board);				
			}else if(player.equals("cpu")){
				int cPosition = new Random().nextInt(9)+1;
				//need to check that position isn't taken before placing piece or generate another
				while(movesPlayed.contains(cPosition)) {
					System.out.println("CPU played: "+cPosition+" but it was taken!");
					cPosition = new Random().nextInt(9)+1;
				}
				//Add played position in list once found not to be there already
				movesPlayed.add(cPosition);
				
				System.out.println(player + " played: " + cPosition);
				placePiece(board, cPosition, player);
				//Player should now be set to player next for next time
				player = players.get(1).toString();
				loadGameboard(board);		
			}
		}
	}
	
	//check that the position played is valid
	private static boolean isPosValid(int pos, String player) {
		boolean valid = false;
		if(pos >= 1 && pos <= 9) {
			valid = true;
		}else {
			System.out.println("Position "+pos+" made by "+player+" is invalid! ");
		}
		return valid;
	}


	private static boolean isWinnerFound(char [][] board) {
		boolean winnerFound = false;
		char playerSymbol = 'O';
		char cpuSymbol = 'X';
		
		//NOT THE MOST ELEGANT WAY OF DOING THIS - I ADMIT ^_^
		
		//Lets Start with CPU winning
		if(board[0][0] == cpuSymbol && board[0][2] == cpuSymbol && board[0][4] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - on row 1");
		}else if(board[2][0] == cpuSymbol && board[2][2] == cpuSymbol && board[2][4] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - on row 2");
		}else if(board[4][0] == cpuSymbol && board[4][2] == cpuSymbol && board[4][4] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - on row 3");
		}else if(board[4][0] == cpuSymbol && board[4][2] == cpuSymbol && board[4][4] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - on column 1");
		}else if(board[0][0] == cpuSymbol && board[2][0] == cpuSymbol && board[4][0] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - on column 2");
		}else if(board[0][2] == cpuSymbol && board[2][2] == cpuSymbol && board[4][2] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - on column 3");
		}else if(board[0][4] == cpuSymbol && board[2][4] == cpuSymbol && board[4][4] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - diagonally 1");
		}else if(board[4][0] == cpuSymbol && board[2][2] == cpuSymbol && board[0][4] == cpuSymbol) {
			winnerFound = true;
			System.out.println("CPU Won - diagonally 2");
		}
		
		//Now for player
		if(board[0][0] == playerSymbol && board[0][2] == playerSymbol && board[0][4] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - on row 1");
		}else if(board[2][0] == playerSymbol && board[2][2] == playerSymbol && board[2][4] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - on row 2");
		}else if(board[4][0] == playerSymbol && board[4][2] == playerSymbol && board[4][4] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - on row 3");
		}else if(board[0][0] == playerSymbol && board[2][2] == playerSymbol && board[4][4] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - diagonally 1");
		}else if(board[4][0] == playerSymbol && board[4][2] == playerSymbol && board[4][4] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - on column 1");
		}else if(board[0][0] == playerSymbol && board[2][0] == playerSymbol && board[4][0] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - on column 2");
		}else if(board[0][2] == playerSymbol && board[2][2] == playerSymbol && board[4][2] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - on column 3");
		}else if(board[4][0] == playerSymbol && board[2][2] == playerSymbol && board[0][4] == playerSymbol) {
			winnerFound = true;
			System.out.println("YOU Won - diagonally 2");
		}
		
		return winnerFound;
	}
	
	private static boolean isGameTied(char [][] board) {
		boolean isTied = false;
		if(movesPlayed.size() == 9 && !isWinnerFound(board)) {
			isTied = true;
			System.out.println("THE GAME IS TIED! v_v");
		}
		
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
	public static void placePiece(char[][] board, int pos, String player) {
		char playerSymbol = 'Y';
		
		if(player.equals("player")) {
			playerSymbol = 'O';
		}else if(player.equals("cpu")) {
			playerSymbol = 'X';
		}		
		switch (pos) {
		case 1: 
			board[0][0] = playerSymbol;
			break;
		case 2:
			board[0][2] = playerSymbol;
			break;
		case 3: 
			board[0][4] = playerSymbol;
			break;
		case 4:
			board[2][0] = playerSymbol;
			break;
		case 5: 
			board[2][2] = playerSymbol;
			break;
		case 6:
			board[2][4] = playerSymbol;
			break;
		case 7: 
			board[4][0] = playerSymbol;
			break;
		case 8:
			board[4][2] = playerSymbol;
			break;
		case 9:
			board[4][4] = playerSymbol;
			break;
		default:
			isPosValid(pos, player);
			movesPlayed.remove(movesPlayed.size()-1);
			break;
		}
	}
}
