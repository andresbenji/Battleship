package ch6;

import java.util.ArrayList;

public class BattleshipGame {
    private ArrayList<Battleship> battleships;
    private GameHelper gameHelper;

    public BattleshipGame() {
        battleships = new ArrayList<>();
        gameHelper = new GameHelper();
    }

    public void setupGame() {
        Battleship battleship1 = new Battleship("Battleship 1", gameHelper.placeStartup(3).get(0));
        Battleship battleship2 = new Battleship("Battleship 2", gameHelper.placeStartup(3).get(0));
        Battleship battleship3 = new Battleship("Battleship 3", gameHelper.placeStartup(3).get(0));

        battleships.add(battleship1);
        battleships.add(battleship2);
        battleships.add(battleship3);
    }

    public void playGame() {
        int numGuesses = 0;

        while (!battleships.isEmpty()) {
            String userGuess = gameHelper.getUserInput("Enter a guess");
            numGuesses++;

            for (Battleship battleship : battleships) {
                if (battleship.checkGuess(userGuess)) {
                    System.out.println("Hit!");
                    battleships.remove(battleship);
                    break;
                }
            }
        }

        System.out.println("Congratulations! You sunk all battleships in " + numGuesses + " guesses.");
    }

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame();
        game.setupGame();
        game.playGame();
    }
}