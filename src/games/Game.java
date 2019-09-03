package games;

import java.util.ArrayList;

import errors.TurnMismatchError;

/*
 * 
 */
public interface Game {

	/**
	 * checks whether a game has been won by either player if neither player has won
	 * then a check for a stalemate is initiated
	 * @return boolean victoryStatus
	 */
	public boolean checkVictory();

	/**
	 * A sub-method of checkVictoryStatus that checks and updates the stalemate
	 * status of a game if a game does not yet have a winner it is possible the game
	 * is in a stalemate and no one won it does not check for impossibility of a
	 * winner so a game in which a winner cannot be attained will proceed till all
	 * nine squares are full
	 */
	public boolean checkStalemateStatus();

	// returns whether or not the board is full and no player is the victor
	public boolean seeStalemateStatus();

	// returns the victory status of the board in question
	public boolean seeVictoryStatus();

	// returns the raw board string used for behind the scenes code
	public String getBoard();

	/*
	 * returns an ArrayList of strings that can be used to make boards for the next
	 * turn Throws an error if the character is not an X or O
	 */
	public ArrayList<String> possibleMoves(char turn) throws TurnMismatchError;

	public char getPlayer1();

	public char getPlayer2();

	public void setTurnTruth(char turn);

	public boolean getTurnTruth(char turn);
}
