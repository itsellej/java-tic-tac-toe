package tictactoe;

import java.util.Random;

public class FakePlayer implements Player {
    private final String mark;
    private final String playerType = "fake";

    public FakePlayer(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    @Override
    public String getPlayerType() {
        return playerType;
    }

    @Override
    public int chooseMove(Board board, String opponentMark) {
        var availableSquares = board.availableSquares(mark, opponentMark);
        Random rand = new Random();
        var move = availableSquares.get(rand.nextInt(availableSquares.size()));

        return Integer.parseInt(move);
    }
}
