package main;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

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
		try {
			PrintStream fileOut = new PrintStream("/Users/TyeKnappenberger/eclipse-workspace/MathResearch/src/main/out.txt");
			System.setOut(fileOut);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Game yo= new ChessKings3x3();

		Game yo = new TicTacToe3x3();
		createAdjacencyList(yo, yo.getPlayer1(), 1);

		// System.out.println(adjacencyList);
		// System.out.println(boardToNumber.containsKey("eeWeeeeeB"));
		// System.out.println(totalBoards);
		// System.out.println(numberToGame);
		// printBoards();
		printAdjacencyList();
		System.out.println(numberToBoard.get(5477));

	}

	public static int createAdjacencyList(Game game, char player, int turn) {
		if (!boardToNumber.containsKey(game.getBoard())) {
			int temp = totalBoards;
			boardToNumber.put(game.getBoard(), totalBoards);
			adjacencyList.put(totalBoards, new ArrayList<Integer>());
			numberToGame.put(totalBoards, game);
			numberToBoard.put(totalBoards++, game.getBoard());

			if (!game.checkStalemateStatus() && !game.checkVictory()) {
				numberToGame.get(temp).setTurnTruth(player);
				for (String b : game.possibleMoves(player)) {
					if (game instanceof TicTacToe3x3)
						adjacencyList.get(temp).add(createAdjacencyList(new TicTacToe3x3(b),
								(turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));
					else if (game instanceof ChessKings3x3) {
						adjacencyList.get(temp).add(createAdjacencyList(new ChessKings3x3(b),
								(turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));

					}
				}
			}
		} else if (!numberToGame.get(boardToNumber.get(game.getBoard())).getTurnTruth(player)) {
			int temp = boardToNumber.get(game.getBoard());

			if (!game.checkStalemateStatus() && !game.checkVictory()) {
				numberToGame.get(temp).setTurnTruth(player);
				for (String b : game.possibleMoves(player)) {
					if (game instanceof TicTacToe3x3)
						adjacencyList.get(temp).add(createAdjacencyList(new TicTacToe3x3(b),
								(turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));
					else if (game instanceof ChessKings3x3) {
						adjacencyList.get(temp).add(createAdjacencyList(new ChessKings3x3(b),
								(turn == 1 ? game.getPlayer2() : game.getPlayer1()), (turn == 1 ? 2 : 1)));

					}
				}
			}

		}

		return boardToNumber.get(game.getBoard());
	}

	public static void testChessKings3x3() {

		//// System.out.println("Keeeeeeek: "+((new
		//// ChessKings3x3()).possibleMoves(ChessKings3x3.PLAYER_1)));
		//// System.out.println("Keeeeeeek: "+((new
		//// ChessKings3x3()).possibleMoves(ChessKings3x3.PLAYER_2)));
		// System.out.println("eeWeeeeBe: "+((new
		//// ChessKings3x3("eeWeeeeBe")).possibleMoves(ChessKings3x3.PLAYER_1)));
		// System.out.println("eeWeeeeBe: "+((new
		//// ChessKings3x3("eeWeeeeBe")).possibleMoves(ChessKings3x3.PLAYER_2)));
		//// System.out.println("WeeeeeBee: "+((new
		//// ChessKings3x3("eWeeeeBee")).possibleMoves(ChessKings3x3.PLAYER_1)));
		//// System.out.println("WeeeeeBee: "+((new
		//// ChessKings3x3("eWeeeeBee")).possibleMoves(ChessKings3x3.PLAYER_2)));
	}

	public static void test3x3() {
		// JOptionPane pane= new JOptionPane();
		TicTacToe3x3 testBoard = new TicTacToe3x3();
		while (JOptionPane.showConfirmDialog(null,
				testBoard.toString() + "\n\nVICTORY:" + testBoard.seeVictoryStatus() + "\nSTALEMATE:"
						+ testBoard.seeStalemateStatus(),
				"Board Check", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
			String s = "";
			for (int i = 0; i < 9; i++) {
				int x = (int) (Math.random() * 3);
				if (x == 0)
					s += "X";
				else if (x == 1) {
					s += "O";
				} else {
					s += "e";
				}
			}
			testBoard = new TicTacToe3x3(s);
		}
		while (JOptionPane.showConfirmDialog(null,
				testBoard.toString() + "\n\nVICTORY:" + testBoard.seeVictoryStatus() + "\nSTALEMATE:"
						+ testBoard.seeStalemateStatus(),
				"Board Check", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
			String s = "";
			for (int i = 0; i < 9; i++) {
				int x = (int) (Math.random() * 2);
				if (x == 0)
					s += "X";
				else if (x == 1) {
					s += "O";
				} else {
					s += "e";
				}
			}
			testBoard = new TicTacToe3x3(s);
		}
	}

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