public class Move {
    private String playerColor;
    private Spot source;
    private Spot target;
    public Move(String playerColor, Spot source, Spot target) {
        this.playerColor = playerColor;
        this.source = source;
        this.target = target;
    }
    public String getPlayerColor() {
        return playerColor;
    }
    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }
    public Spot getSource() {
        return source;
    }
    public void setSource(Spot source) {
        this.source = source;
    }
    public Spot getTarget() {
        return target;
    }
    public void setTarget(Spot target) {
        this.target = target;
    }
    @Override
    public String toString() {
        return playerColor + ": " + source.toString() + " -> " + target.toString();
    }
}