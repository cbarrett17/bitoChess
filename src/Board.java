import java.util.ArrayList;
import java.util.List;

public class Board {

    // Number of rows and columns
    private final int BOARD_LW = 8;

    //Number of pieces per player
    private final int NUM_PIECES = 16;
    private Spot[][] _spots;
    private List<Piece> _whitePieces;
    private List<Piece> _blackPieces;
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

    public Piece getPiece(int row, int col) {
        return _spots[row][col].getPiece();
    }

    public Spot getSpot(Piece piece) {
        Spot mySpot = null;
        for (int i = 0; i < BOARD_LW; i++) {
            for (int j = 0; j < BOARD_LW; j++) {
                if (_spots[i][j].getPiece().equals(piece)) {
                    mySpot = _spots[i][j];
                }
            }
        }
        return mySpot;
    }

    public boolean movePiece(Piece piece, Spot destination) {
        // code to move a piece to the destination spot
        int destRow = destination.getRow();
        int destCol = destination.getCol();
        int currRow = piece.getRow();
        int currCol = piece.getCol();
        Piece capturedPiece = getPiece(destRow, destCol);

        // Check if the move is valid
        if (!piece.getLegalMoves(this).contains(destination)) {
            throw new IllegalArgumentException("Invalid move for this piece");
        }

        // Move the piece to the destination
        destination.setPiece(piece);
        getSpot(piece).removePiece();

        // Update the position of the piece
        piece.setPosition(destination);

        // Capture the piece if necessary
        if (capturedPiece != null) {
            removePiece(capturedPiece);
        }
        return true;
    }

    public void removePiece(Piece piece) {
        // code to remove a piece from the board
    }

    public boolean isLegalMove(Piece piece, Spot destination) {
        // code to check if the given move is legal
        return true;
    }

    public boolean isKingInCheck(String color) {
        // code to check if a king of the given color is in check
        return true;
    }

    public boolean isCheckmate(String color) {
        // code to check if the given color is in checkmate
        return true;
    }

    private void resetBoard() {
        boolean isWhite = true;
        _spots = new Spot[BOARD_LW][BOARD_LW];

        // initialize pieces
        // isWhite true
        _whitePieces = setPiecesList(isWhite);
        // isWhite false
        _blackPieces = setPiecesList(!isWhite);

        // initialize white spots
        _spots[0][0] = new Spot(0, 0, _whitePieces.get(0));
        _spots[0][1] = new Spot(0, 1, _whitePieces.get(1));
        _spots[0][2] = new Spot(0, 2, _whitePieces.get(2));
        _spots[0][3] = new Spot(0, 3, _whitePieces.get(3));
        _spots[0][4] = new Spot(0, 4, _whitePieces.get(4));
        _spots[0][5] = new Spot(0, 5, _whitePieces.get(5));
        _spots[0][6] = new Spot(0, 6, _whitePieces.get(6));
        _spots[0][7] = new Spot(0, 7, _whitePieces.get(7));
        // initialize white pawn spots
        for (int i = 0; i < 8; i++) {
            for (int j = BOARD_LW; j < NUM_PIECES; j++) {
                _spots[1][i] = new Spot(1, i, _whitePieces.get(j));
            }
        }

        // initialize black spots
        _spots[7][0] = new Spot(7, 0, _blackPieces.get(0));
        _spots[7][1] = new Spot(7, 1, _blackPieces.get(1));
        _spots[7][2] = new Spot(7, 2, _blackPieces.get(2));
        _spots[7][3] = new Spot(7, 3, _blackPieces.get(3));
        _spots[7][4] = new Spot(7, 4, _blackPieces.get(4));
        _spots[7][5] = new Spot(7, 5, _blackPieces.get(5));
        _spots[7][6] = new Spot(7, 6, _blackPieces.get(6));
        _spots[7][7] = new Spot(7, 7, _blackPieces.get(7));
        // initialize black pawn spots
        for (int i = 0; i < 8; i++) {
            for (int j = BOARD_LW; j < NUM_PIECES; j++) {
                _spots[1][i] = new Spot(6, i, _blackPieces.get(j));
            }
        }

        // initialize empty spots
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                _spots[i][j] = new Spot(i, j, null);
            }
        }
    }

    private List<Piece> setPiecesList(boolean color) {
        List<Piece> listPieces;

        listPieces = new ArrayList<>(NUM_PIECES);

        listPieces.add(0, new Rook(color));
        listPieces.add(1, new Knight(color));
        listPieces.add(2, new Bishop(color));
        listPieces.add(3, new King(color));
        listPieces.add(4, new Queen(color));
        listPieces.add(5, new Bishop(color));
        listPieces.add(6, new Knight(color));
        listPieces.add(7, new Rook(color));
        for (int i = BOARD_LW; i < NUM_PIECES; i++) {
            listPieces.add(i, new Pawn(color));
        }
        return listPieces;
    }
    // additional methods for other functionality related to the game rules and state
}
