package software.paultest.unittesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersGame {

    private List<Integer> playerOne = new ArrayList<>();
    private List<Integer> playerTwo = new ArrayList<>();

    public Integer throwDice() {
        Random random = new Random();
        Integer randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }

    public List<Integer> firstTurn() {
        for( int i = 0; i<3; i++ ) {
            int j = throwDice();
            playerOne.add( j );
        }
        return playerOne;
    }

    public List<Integer> secondTurn() {
        for( int i = 1; i<4; i++ ) {
            int j = throwDice();
            playerTwo.add( j );
        }
        return playerTwo;
    }


}
