package com.sv.game;

public class ValidationUtil {

    public static void validateGameInputs(int numberOfPlayers, int chosenNumber) throws Exception {
        if (numberOfPlayers < 1 || numberOfPlayers > 1000) {
            throw new Exception("Invalid number of players");
        }
        if (chosenNumber < 1) {
            throw new Exception("Invalid number chosen");
        }
        if ((numberOfPlayers > 0 && numberOfPlayers < 1001) && (chosenNumber > numberOfPlayers)) {
            throw new Exception("chosen number cannot be greater than the number of players");
        }
    }
}
