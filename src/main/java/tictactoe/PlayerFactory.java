package tictactoe;

public class PlayerFactory {
    private final Display display;
    private final InputValidator inputValidator;
    private final Minimax minimax;

    public PlayerFactory
            (Display display, InputValidator inputValidator, Minimax minimax) {
        this.display = display;
        this.inputValidator = inputValidator;
        this.minimax = minimax;
    }

    public Player createNewPlayer(String playerType, String mark) {
        if (playerType.equals(PlayerTypes.human.toString())) {
            return new HumanPlayer(mark, inputValidator);
        } else if (playerType.equals(PlayerTypes.computer.toString())) {
            return new ComputerPlayer(display, mark);
        } else {
            return new UnbeatableComputerPlayer(display, mark, minimax);
        }
    }
}