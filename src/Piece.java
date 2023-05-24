import java.util.List;

public abstract class Piece {
    private final boolean _isWhite;
    private boolean _hasMoved;
    public Piece(boolean isWhite) {
        this._isWhite = isWhite;
        this._hasMoved = false;
    }

    public boolean getIsWhite() {
        return _isWhite;
    }
    public boolean getHasMoved() {
        return _hasMoved;
    }
    public void setHasMoved(boolean hasMoved) {
        this._hasMoved = hasMoved;
    }
    public abstract List<Spot> getLegalMoves(Board board);
    public abstract boolean move(Spot destinationSpot);
    public abstract boolean capture(Spot destinationSpot);
    // Additional methods specific to each piece type (e.g. castling for King,
    // promotion for Pawn) can be added as needed
}

class King extends Piece {

    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Spot> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean move(Spot destinationSpot) {
        return false;
    }

    @Override
    public boolean capture(Spot destinationSpot) {
        return false;
    }
}

class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Spot> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean move(Spot destinationSpot) {
        return false;
    }

    @Override
    public boolean capture(Spot destinationSpot) {
        return false;
    }
}

class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Spot> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean move(Spot destinationSpot) {
        return false;
    }

    @Override
    public boolean capture(Spot destinationSpot) {
        return false;
    }
}

class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Spot> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean move(Spot destinationSpot) {
        return false;
    }

    @Override
    public boolean capture(Spot destinationSpot) {
        return false;
    }
}

class Knight extends Piece {

    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Spot> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean move(Spot destinationSpot) {
        return false;
    }

    @Override
    public boolean capture(Spot destinationSpot) {
        return false;
    }
}

class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Spot> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean move(Spot destinationSpot) {
        return false;
    }

    @Override
    public boolean capture(Spot destinationSpot) {
        return false;
    }
}
