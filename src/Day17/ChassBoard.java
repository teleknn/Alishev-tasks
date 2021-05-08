package Day17;

public class ChassBoard {
    private ChessPiece[][] board;

    public ChassBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.println();

        }

    }
}
