package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import errors.*;
import games.Game;
import games.TicTacToeNxN;

public class TicTacToeNxNTest {

	@Test
	public void testBoardSize() {
		assertThrows(InvalidBoardString.class, () -> {
			new TicTacToeNxN(1);
		}, "Must have a board size >= 3");
		assertThrows(InvalidBoardString.class, () -> {
			new TicTacToeNxN("eeeXOXeeee");
		});
	}

	@Test
	public void testCheckVictoryAndStalemate() {
		try {
			Game test3x3 = new TicTacToeNxN();
			assertTrue(!test3x3.seeStalemateStatus() && !test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eOXeOXeOe");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("XOXOOXXXO");
			assertTrue(test3x3.seeStalemateStatus() && !test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("OeeeOeeeO");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("XeeeXeeeX");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeOeOeOee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeXeXeXee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("OOOeeeeee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("XXXeeeeee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeeOOOeee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeeXXXeee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeeeeeOOO");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeeeeeXXX");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("OeeOeeOee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("XeeXeeXee");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eOeeOeeOe");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eXeeXeeXe");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeOeeOeeO");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("eeXeeXeeX");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			test3x3 = new TicTacToeNxN("OOXOOXXXX");
			assertTrue(!test3x3.seeStalemateStatus() && test3x3.seeVictoryStatus());
			Game test4x4 = new TicTacToeNxN(4);
			assertTrue(!test4x4.seeStalemateStatus() && !test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("OeeOeeeeeeeeOeeO");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("OOOOeeeeeeeeeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeeeOOOOeeeeeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeeeeeeeOOOOeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeeeeeeeeeeeOOOO");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("OeeeOeeeOeeeOeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eOeeeOeeeOeeeOee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeOeeeOeeeOeeeOe");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeeOeeeOeeeOeeeO");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeOOeeOOeeeeeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eOOeeOOeeeeeeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("OOeeOOeeeeeeeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeeeeeeeeeOOeeOO");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("eeeeeeOOeeOOeeee");
			assertTrue(!test4x4.seeStalemateStatus() && test4x4.seeVictoryStatus());
			test4x4 = new TicTacToeNxN("OXXOXOOXOXXOXOXO");
			assertTrue(test4x4.seeStalemateStatus() && !test4x4.seeVictoryStatus());
			Game test5x5 = new TicTacToeNxN(5);
			assertTrue(!test5x5.seeStalemateStatus() && !test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("OeeeOeeeeeeeeeeeeeeeOeeeO");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("OOOOOeeeeeeeeeeeeeeeeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeeeOOOOOeeeeeeeeeeeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeeeeeeeeeeeeeOOOOOeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeeeeeeeeeeeeeeeeeeOOOOO");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("OeeeeOeeeeOeeeeOeeeeOeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eOeeeeOeeeeOeeeeOeeeeOeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeOeeeeOeeeeOeeeeOeeeeOe");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeeOeeeeOeeeeOeeeeOeeeeO");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeOOeeeOOeeeeeeeeeeeeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eOOeeeOOeeeeeeeeeeeeeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("OOeeeOOeeeeeeeeeeeeeeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeeeeeeeeeeeeeeeeOOeeeOO");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("eeeeeeeeeeeeeOOeeeOOeeeee");
			assertTrue(!test5x5.seeStalemateStatus() && test5x5.seeVictoryStatus());
			test5x5 = new TicTacToeNxN("OOOXOOXOOXOXOXXXXXOOXOOXX");
			assertTrue(test5x5.seeStalemateStatus() && !test5x5.seeVictoryStatus());
		} catch (InvalidBoardString e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void testPossibleMovesIntense() {
		try {
			Game testNxN = new TicTacToeNxN(4);
			assertTrue(testNxN.possibleMoves('O').size() == 16);
			assertTrue(testNxN.possibleMoves('X').size() == 16);
			testNxN = new TicTacToeNxN(5);
			assertTrue(testNxN.possibleMoves('O').size() == 25);
			assertTrue(testNxN.possibleMoves('X').size() == 25);
			testNxN = new TicTacToeNxN(6);
			assertTrue(testNxN.possibleMoves('O').size() == 36);
			assertTrue(testNxN.possibleMoves('X').size() == 36);
			testNxN = new TicTacToeNxN("XeeeOeeeXeeeOeee");
			assertTrue(testNxN.possibleMoves('O').size() == 12);
			assertTrue(testNxN.possibleMoves('X').size() == 12);
			testNxN = new TicTacToeNxN("OXXOXOOXOXXOXOXO");
			assertTrue(testNxN.possibleMoves('O').isEmpty());
			assertTrue(testNxN.possibleMoves('X').isEmpty());
			testNxN = new TicTacToeNxN("eeeeeeOOeeOOeeee");
			assertTrue(testNxN.possibleMoves('O').isEmpty());
			assertTrue(testNxN.possibleMoves('X').isEmpty());

			testNxN = new TicTacToeNxN();
			assertTrue(testNxN.possibleMoves('O').size() == 9);
			assertTrue(testNxN.possibleMoves('O').contains("Oeeeeeeee"));
			assertTrue(testNxN.possibleMoves('O').contains("eOeeeeeee"));
			assertTrue(testNxN.possibleMoves('O').contains("eeOeeeeee"));
			assertTrue(testNxN.possibleMoves('O').contains("eeeOeeeee"));
			assertTrue(testNxN.possibleMoves('O').contains("eeeeOeeee"));
			assertTrue(testNxN.possibleMoves('O').contains("eeeeeOeee"));
			assertTrue(testNxN.possibleMoves('O').contains("eeeeeeOee"));
			assertTrue(testNxN.possibleMoves('O').contains("eeeeeeeOe"));
			assertTrue(testNxN.possibleMoves('O').contains("eeeeeeeeO"));
			assertTrue(testNxN.possibleMoves('X').size() == 9);
			assertTrue(testNxN.possibleMoves('X').contains("Xeeeeeeee"));
			assertTrue(testNxN.possibleMoves('X').contains("eXeeeeeee"));
			assertTrue(testNxN.possibleMoves('X').contains("eeXeeeeee"));
			assertTrue(testNxN.possibleMoves('X').contains("eeeXeeeee"));
			assertTrue(testNxN.possibleMoves('X').contains("eeeeXeeee"));
			assertTrue(testNxN.possibleMoves('X').contains("eeeeeXeee"));
			assertTrue(testNxN.possibleMoves('X').contains("eeeeeeXee"));
			assertTrue(testNxN.possibleMoves('X').contains("eeeeeeeXe"));
			assertTrue(testNxN.possibleMoves('X').contains("eeeeeeeeX"));

			testNxN = new TicTacToeNxN("OXeXeOOXe");
			assertTrue(testNxN.possibleMoves('O').size() == 3);
			assertTrue(testNxN.possibleMoves('O').contains("OXOXeOOXe"));
			assertTrue(testNxN.possibleMoves('O').contains("OXeXOOOXe"));
			assertTrue(testNxN.possibleMoves('O').contains("OXeXeOOXO"));
		} catch (InvalidBoardString | TurnMismatchError e) {
			e.printStackTrace();
			fail();
		}
	}

	@ParameterizedTest(name = "{index} => board= {0} number= {1}")
	@CsvFileSource(resources = "./NxNTests.csv")
	public void testPossibleMovesQuick(String str, int num) {
		Game tictactoe;
		try {
			tictactoe = new TicTacToeNxN(str);
			if(!tictactoe.seeVictoryStatus()&&!tictactoe.seeStalemateStatus())
				assertTrue(tictactoe.possibleMoves(tictactoe.getPlayer1()).size() == num);
			else
				assertTrue(tictactoe.possibleMoves(tictactoe.getPlayer1()).size() == 0);

		} catch (InvalidBoardString | TurnMismatchError e) {
			e.printStackTrace();
			fail();
		}
	}

}