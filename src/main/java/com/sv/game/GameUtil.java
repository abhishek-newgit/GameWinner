package com.sv.game;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameUtil {

    public static int findWinner(int numberOfPlayers, int chosenNumber) throws Exception{

        try {
            ValidationUtil.validateGameInputs(numberOfPlayers, chosenNumber);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        int temp = chosenNumber - 1;
        int[] players = new int[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = i + 1;
        }

        int position = numberOfPlayers - 1;

        List<Integer> list = IntStream.of(players).boxed().collect(Collectors.toList());

        while (position > 0) {
            list.remove(temp);
            temp += chosenNumber - 1;
            if (temp > list.size() - 1) {
                temp = temp % list.size();
            }
            position--;
        }
        return list.get(0);

    }







}
