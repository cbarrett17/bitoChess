import java.util.List;

public abstract class Piece {
    private String name;
    private String color;
    private Spot currentSpot;
    private boolean hasMoved;
    public Piece(String name, String color, Spot currentSpot) {
        this.name = name;
        this.color = color;
        this.currentSpot = currentSpot;
        this.hasMoved = false;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public Spot getCurrentSpot() {
        return currentSpot;
    }
    public void setCurrentSpot(Spot currentSpot) {
        this.currentSpot = currentSpot;
    }
    public boolean getHasMoved() {
        return hasMoved;
    }
    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
    public abstract List<Spot> getLegalMoves(Board board);
    public abstract boolean move(Spot destinationSpot);
    public abstract boolean capture(Spot destinationSpot);
    // Additional methods specific to each piece type (e.g. castling for King,
    // promotion for Pawn) can be added as needed
}
