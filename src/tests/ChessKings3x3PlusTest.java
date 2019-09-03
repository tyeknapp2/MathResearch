/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import errors.InvalidBoardString;
import errors.TurnMismatchError;
import games.ChessKings3x3Plus;
import games.Game;

/**
 * @author TyeKnappenberger
 *
 */
public class ChessKings3x3PlusTest {

	@Test
	public void testConstructors() {
		assertTrue((new ChessKings3x3Plus()).getBoard().equals("WeeeeeeeBW"));
		try {
			assertTrue((new ChessKings3x3Plus("eWeeeeeeBB")).getBoard().equals("eWeeeeeeBB"));
		} catch (InvalidBoardString e) {
			fail();
			e.printStackTrace();
		}
		assertThrows(InvalidBoardString.class,()->{new ChessKings3x3Plus("eWeeeeeeB");});
	}
	
	public void testToString() {
		String s="W\'s turn to move:\nW e e\ne e e\ne e B\n";
		assertTrue(s.equals((new ChessKings3x3Plus()).toString()));
	}
	
	public void testPossibleMoves(){
		Game chess=new ChessKings3x3Plus();
		try {
		assertTrue(chess.possibleMoves(chess.getPlayer1()).size()==2);
		assertTrue(chess.possibleMoves(chess.getPlayer1()).contains("eWeeeeeeBB"));
		assertTrue(chess.possibleMoves(chess.getPlayer1()).contains("eeeWeeeeBB"));
		
		}catch (TurnMismatchError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
