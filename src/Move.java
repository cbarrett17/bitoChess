public class Move {
    private final Spot source;  // the starting spot of the move
    private final Spot target;  // the ending spot of the move
    private final Player player;  // the player who made the move
    // Constructor
    public Move(Spot source, Spot target, Player player) {
        this.source = source;
        this.target = target;
        this.player = player;
    }
    // Getters for source, target, and player
    public Spot getSource() {
        return source;
    }
    public Spot getTarget() {
        return target;
    }
    public Player getPlayer() {
        return player;
    }
    @Override
    public String toString() {
        return player.getColor() + ": " + source.toString() + " -> " + target.toString();
    }
}