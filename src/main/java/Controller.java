public class Controller {
    private Game game;
    private Display display;

    public Controller(Game game, Display display) {
        this.game = game;
        this.display = display;
    }

    public void playGame() {
        while (!game.over()) {
            game.playMove();
        }
        endOfGame();
    }

    private void endOfGame() {
        display.showGrid(game.board.getGrid());
        var outcome = game.outcome();
        display.outcomeMessage(outcome);
    }
}
