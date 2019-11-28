package software.paultest.unittesting;

import java.util.ArrayList;
import java.util.List;

public class Play {

    private NumbersGame numbersGame = new NumbersGame();

    public void playRound( List<Integer> scorePlayerOne,  List<Integer> scorePlayerTwo, int rounds) {
        Integer resultPlayerOne = 0;
        Integer resultPlayerTwo = 0;

        for ( int i = 0; i <= rounds; i++ ){
            List<Integer> playerOne = numbersGame.firstTurn();
            List<Integer> playerTwo = numbersGame.secondTurn();

            resultPlayerOne = playerOne.get(0) + playerOne.get(1) + playerOne.get(2);
            resultPlayerTwo = playerTwo.get(0) + playerTwo.get(1) + playerTwo.get(2);

            if (resultPlayerOne > resultPlayerTwo) {
                System.out.println("Player One is the winner" + resultPlayerOne);
                System.out.println("Player Two is the Loser" + resultPlayerTwo);
                scorePlayerOne.add(resultPlayerOne);
            } else if (resultPlayerOne < resultPlayerTwo) {
                System.out.println("Player Two is the winner" + resultPlayerOne);
                System.out.println("Player One is the Loser" + resultPlayerTwo);
                scorePlayerTwo.add(resultPlayerTwo);
            }
        }
        if (resultPlayerOne < resultPlayerTwo) {
            System.out.println("Player Two is the overall winner" + resultPlayerOne);
            System.out.println("Player One is the overall Loser" + resultPlayerTwo);
            scorePlayerTwo.add(resultPlayerTwo);
        } else if (resultPlayerOne > resultPlayerTwo) {
            System.out.println("Player One is the overall winner" + resultPlayerOne);
            System.out.println("Player Two is the overall Loser" + resultPlayerTwo);
            scorePlayerOne.add(resultPlayerOne);
        } else {
            throw new RuntimeException("It is a Tie!");
        }
    }
}
