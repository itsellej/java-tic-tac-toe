import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void returnsGrid() {
        var squares = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        var board = new Board(squares);
        assertEquals(board.getSquares(), squares);
    }
}