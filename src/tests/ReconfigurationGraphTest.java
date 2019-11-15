package tests;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import main.ReconfigurationGraph;
//import errors.*;
//import games.Game;
import games.TicTacToeNxN;

public class ReconfigurationGraphTest 
{
	public ReconfigurationGraph r3x3 = new ReconfigurationGraph((new TicTacToeNxN()), (new TicTacToeNxN()).getPlayer1(), 1);


	@ParameterizedTest
	@CsvFileSource(resources = "./TicTacToeBoards.csv")
	public void testGraphContains(String str) {

		if(str.length()==9)
			assertTrue(r3x3.contains(str));
		//else if(str.length()== 16)
			
	}

}
