public class Spot {
    private final int _row;
    private final int _col;
    private Piece _piece;
    public Spot(int row, int col) {
        this._row = row;
        this._col = col;
        this._piece = null;
    }

    public Spot(int row, int col, Piece piece) {
        this._row = row;
        this._col = col;
        this._piece = piece;
    }
    public int getRow() {
        return _row;
    }
    public int getCol() {
        return _col;
    }
    public Piece getPiece() {
        return _piece;
    }
    public void setPiece(Piece piece) {
        this._piece = piece;
    }
    public void removePiece() {
        this._piece = null;
    }
}
