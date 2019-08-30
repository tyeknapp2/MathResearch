package main;

import java.util.ArrayList;

public class TicTacToe4x4 implements Game {

	private String board;

	private boolean victoryStatus;
	
	private boolean stalemateStatus;
	
	public final char PLAYER_1='O';
	
	public final char PLAYER_2='X';
	
	public TicTacToe4x4() {
		board = "eeeeeeeeeeeeeeee";
		victoryStatus = false;
	}
	
	public TicTacToe4x4(String newBoard) {

		board = newBoard;
		this.checkVictory();
	}

	@Override
	public boolean checkVictory() {
		stalemateStatus=false;
		//horizontal checks
		if(board.charAt(0)==board.charAt(1)&& board.charAt(0)==board.charAt(2)&& board.charAt(0)==board.charAt(3) &&board.charAt(0)!='e') {
			victoryStatus=true;
			return true;
		}
		else if(board.charAt(4)==board.charAt(5)&& board.charAt(4)==board.charAt(6)&& board.charAt(4)==board.charAt(7)&&board.charAt(4)!='e') {
			victoryStatus=true;
			return true;
		}
		else if(board.charAt(6)==board.charAt(7)&& board.charAt(6)==board.charAt(8)&&board.charAt(6)!='e') {
			victoryStatus=true;
			return true;
		}
		//vertical checks
		else if(board.charAt(0)==board.charAt(3)&& board.charAt(0)==board.charAt(6)&&board.charAt(0)!='e') {
			victoryStatus=true;
			return true;
		}
		else if(board.charAt(1)==board.charAt(4)&& board.charAt(1)==board.charAt(7)&&board.charAt(1)!='e') {
			victoryStatus=true;
			return true;
		}
		else if(board.charAt(2)==board.charAt(5)&& board.charAt(8)==board.charAt(2)&&board.charAt(2)!='e') {
			victoryStatus=true;
			return true;
		}
		//diagonal checks
		else if(board.charAt(0)==board.charAt(4)&& board.charAt(0)==board.charAt(8)&&board.charAt(0)!='e') {
			victoryStatus=true;
			return true;
		}
		else if(board.charAt(2)==board.charAt(4)&& board.charAt(2)==board.charAt(6)&&board.charAt(2)!='e') {
			victoryStatus=true;
			return true;
		}
		//no victor
		else {
			victoryStatus=false;
			checkStalemateStatus();
			return false;
		}
	}

	@Override
	public boolean checkStalemateStatus() {
		if(board.contains("e"))
			return false;
		return true;
	}

	@Override
	public boolean seeStalemateStatus() {
		return stalemateStatus;
	}

	@Override
	public boolean seeVictoryStatus() {
		return victoryStatus;
	}

	@Override
	public String getBoard() {
		return board;
	}

	@Override
	public ArrayList<String> possibleMoves(char turn) {
		ArrayList<String> moves = new ArrayList<String>();
		for (int i = 0; i < 16; i++) {
			if (board.charAt(i) == 'e') {
				if (i < 8)
					moves.add(board.substring(0, i) + turn + board.substring(i + 1));
				else
					moves.add(board.substring(0, i) + turn);
			}
		}
		return moves;
	}
	@Override
	public char getPlayer1() {
		return PLAYER_1;
	}

	@Override
	public char getPlayer2() {
		return PLAYER_2;
	}

	@Override
	public void setTurnTruth(char turn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getTurnTruth(char turn) {
		// TODO Auto-generated method stub
		return false;
	}
}

