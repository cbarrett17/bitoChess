import java.util.List;

public abstract class Piece {
    private final String _name;
    private final String _color;
    private Spot _currentSpot;
    private boolean _hasMoved;
    public Piece(String name, String color, Spot currentSpot) {
        this._name = name;
        this._color = color;
        this._currentSpot = currentSpot;
        this._hasMoved = false;
    }
    public String getName() {
        return _name;
    }
    public String getColor() {
        return _color;
    }
    public Spot getCurrentSpot() {
        return _currentSpot;
    }
    public void setCurrentSpot(Spot currentSpot) {
        this._currentSpot = currentSpot;
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

    public King(String name, String color, Spot currentSpot) {
        super(name, color, currentSpot);
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

    public Queen(String name, String color, Spot currentSpot) {
        super(name, color, currentSpot);
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

    public Rook(String name, String color, Spot currentSpot) {
        super(name, color, currentSpot);
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

    public Bishop(String name, String color, Spot currentSpot) {
        super(name, color, currentSpot);
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

    public Knight(String name, String color, Spot currentSpot) {
        super(name, color, currentSpot);
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

    public Pawn(String name, String color, Spot currentSpot) {
        super(name, color, currentSpot);
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
