import java.util.List;

public class Board {
    private int numRows;
    private int numCols;
    private Piece[][] squares;
    private List<Piece> whitePieces;
    private List<Piece> blackPieces;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    private boolean isGameOver;
    private boolean isCheck;
    private Spot enPassant;
    private int halfMoveClock;
    private int fullMoveCount;

    public Board(Player whitePlayer, Player blackPlayer) {
        // constructor code
    }

    public boolean movePiece(Piece piece, Spot destination) {
        // code to move a piece to the destination spot
    }

    public void removePiece(Piece piece) {
        // code to remove a piece from the board
    }

    public boolean isLegalMove(Piece piece, Spot destination) {
        // code to check if the given move is legal
    }

    public boolean isKingInCheck(String color) {
        // code to check if a king of the given color is in check
    }

    public boolean isCheckmate(String color) {
        // code to check if the given color is in checkmate
    }

    // additional methods for other functionality related to the game rules and state

}
