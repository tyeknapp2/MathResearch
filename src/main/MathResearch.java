package main;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.google.gson.*;

import games.Game;
import games.TicTacToeNxN;

public class MathResearch {

	public static void main(String[] args) {

		Game yo = new TicTacToeNxN();
		Gson gsonBuilder = new GsonBuilder().create();

		System.out.println(gsonBuilder.toJson(yo).toString());

		ReconfigurationGraph graph = new ReconfigurationGraph(new TicTacToeNxN());

		try {
			PrintStream fileOut = new PrintStream("/Users/TyeKnappenberger/eclipse-workspace/MathResearch/src/main/out2.txt");
			System.setOut(fileOut);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String jsonString = gsonBuilder.toJson(graph);
		JsonObject json = JsonParser.parseString(jsonString).getAsJsonObject();
		System.out.println(json.getClass());
		System.out.println(json.keySet());
		System.out.println(json);
	}
}