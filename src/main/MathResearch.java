package main;

// import java.io.FileNotFoundException;
// import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

// import errors.InvalidBoardString;
// import errors.TurnMismatchError;
// import games.ChessKings3x3;
import games.Game;
// import games.TicTacToe3x3;
// import games.TicTacToeNxN;

public class MathResearch {

	public static HashMap<String, Integer> boardToNumber = new HashMap<String, Integer>();
	public static HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();
	public static HashMap<Integer, Game> numberToGame = new HashMap<Integer, Game>();
	public static HashMap<Integer, String> numberToBoard = new HashMap<Integer, String>();
	public static int totalBoards = 0;

	public static void main(String[] args) {
		// Game yo = new TicTacToe3x3();
		//
		//
		// System.out.println(yo);
		//
		//
		// for(String y: yo.possibleMoves('O')) {
		// TicTacToe3x3 o= new TicTacToe3x3(y);
		// System.out.println(o+"\n");
		// }
		//
		// testChessKings3x3();
		// try {
		// PrintStream fileOut = new
		// PrintStream("/Users/TyeKnappenberger/eclipse-workspace/MathResearch/src/main/out.txt");
		// System.setOut(fileOut);
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }

		// Game yo= new ChessKings3x3();

		// Game yo = new TicTacToe3x3();
		// createAdjacencyList(yo, yo.getPlayer1(), 1);
		//
		// // System.out.println(adjacencyList);
		// // System.out.println(boardToNumber.containsKey("eeWeeeeeB"));
		// // System.out.println(totalBoards);
		// // System.out.println(numberToGame);
		// // printBoards();
		// printAdjacencyList();
		// System.out.println(numberToBoard.get(5477));

		// for(int i=0;i<2000;i++) {
		// String s=randString(9);
		// if(countChar('O',s)==countChar('X',s)||countChar('O',s)==countChar('X',s)+1)
		// try {
		// if(!((new TicTacToeNxN(s)).seeVictoryStatus()))
		// System.out.println(s);
		// } catch (InvalidBoardString e) {
		// e.printStackTrace();
		// }
		// }
		// ReconfigurationGraph r4x4;
		// Game g4x4;
		//
		// g4x4 = new TicTacToeNxN();
		// r4x4 = new ReconfigurationGraph(g4x4, g4x4.getPlayer1(), 1);
		//
		// System.out.println("we did it");
	}

	// private static int countChar(char c, String s) {
	// int x = 0;
	// for (int i = 0; i < s.length(); i++) {
	// if (s.charAt(i) == c) {
	// x++;
	// }
	// }
	// return x;
	// }

	// private static String randString(int length) {
	// String k = "";
	// double l;
	// for (int i = 0; i < length; i++) {
	// l = Math.random() * 3;
	// if (l < 1)
	// k += "X";
	// else if (l < 2)
	// k += "O";
	// else
	// k += "e";
	// }
	// return k;
	// }

	// /**
	// * @param game the
	// * @param player thi
	// * @param turn An internally used parameter. Should match the player's number,
	// * either one or two.
	// * @return the number associated
	// * @deprecated Old code from a very
	// */
	// public static int createAdjacencyList(Game game, char player, int turn) {
	// if (!boardToNumber.containsKey(game.getBoard())) {
	// int temp = totalBoards;
	// boardToNumber.put(game.getBoard(), totalBoards);
	// adjacencyList.put(totalBoards, new ArrayList<Integer>());
	// numberToGame.put(totalBoards, game);
	// numberToBoard.put(totalBoards++, game.getBoard());

	// if (!game.checkStalemateStatus() && !game.checkVictory()) {
	// numberToGame.get(temp).setTurnTruth(player);
	// try {
	// for (String b : game.possibleMoves(player)) {
	// if (game instanceof TicTacToe3x3)
	// adjacencyList.get(temp).add(createAdjacencyList(new TicTacToe3x3(b),
	// (turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));
	// else if (game instanceof ChessKings3x3) {
	// adjacencyList.get(temp).add(createAdjacencyList(new ChessKings3x3(b),
	// (turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));

	// }
	// }
	// } catch (TurnMismatchError e) {
	// e.printStackTrace();
	// }
	// }
	// } else if
	// (!numberToGame.get(boardToNumber.get(game.getBoard())).getTurnTruth(player))
	// {
	// int temp = boardToNumber.get(game.getBoard());

	// if (!game.checkStalemateStatus() && !game.checkVictory()) {
	// numberToGame.get(temp).setTurnTruth(player);
	// try {
	// for (String b : game.possibleMoves(player)) {
	// if (game instanceof TicTacToe3x3)
	// adjacencyList.get(temp).add(createAdjacencyList(new TicTacToe3x3(b),
	// (turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));
	// else if (game instanceof ChessKings3x3) {
	// adjacencyList.get(temp).add(createAdjacencyList(new ChessKings3x3(b),
	// (turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));

	// }
	// }
	// } catch (TurnMismatchError e) {
	// e.printStackTrace();
	// }
	// }

	// }

	// return boardToNumber.get(game.getBoard());
	// }

	public static void printBoards() {
		int x = 0;
		for (int i : adjacencyList.keySet()) {
			if (adjacencyList.get(i).isEmpty()) {
				System.out.println("" + numberToGame.get(i) + "\n");
				x++;
			}
		}
		System.out.print(x);
	}

	public static void printAdjacencyList() {
		for (int i : adjacencyList.keySet()) {
			System.out.println("" + i + ": " + adjacencyList.get(i));
		}
	}
}