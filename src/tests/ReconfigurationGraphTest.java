package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import main.ReconfigurationGraph;
import errors.*;
import games.Game;
import games.TicTacToeNxN;

public class ReconfigurationGraphTest 
{
	public ReconfigurationGraph r3x3;
	public ReconfigurationGraph r4x4;
	public ReconfigurationGraphTest() {

		Game g = (new TicTacToeNxN());
		r3x3 = new ReconfigurationGraph(g, g.getPlayer1(), 1);



		Game g4x4;
		try {
			g4x4 = new TicTacToeNxN(4);
			r4x4 = new ReconfigurationGraph(g4x4, g4x4.getPlayer1(), 1);
		} catch (InvalidBoardString e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(1);

	}

	@ParameterizedTest
	@CsvFileSource(resources = "./TicTacToeBoards.csv")
	public void testGraphContains(String str) {

		if(str.length()==9)
			assertTrue(r3x3.contains(str));
		else if(str.length()== 16)
			assertTrue(r4x4.contains(str));
	}

}
