package software.paultest.unittesting;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private Play playGame = new Play();
    private List<Integer> scorePlayerOne = new ArrayList<>();
    private List<Integer> scorePlayerTwo = new ArrayList<>();

    public void playShortGame() {
        playGame.playRound( scorePlayerOne, scorePlayerTwo, 6);
    }

    public void playLongGame() {
        playGame.playRound( scorePlayerOne, scorePlayerTwo, 12);
    }


    public void clear() {
        scorePlayerOne.clear();
        scorePlayerTwo.clear();
    }
}
