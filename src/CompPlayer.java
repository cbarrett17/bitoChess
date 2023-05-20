public class CompPlayer extends Player {
    private String algorithm;
    private int depth;
    public CompPlayer(String name, String color, String algorithm, int depth) {
        super(name, color, false);
        this.algorithm = algorithm;
        this.depth = depth;
    }
    public String getAlgorithm() {
        return algorithm;
    }
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public Move getMove(Board board) {
        // TODO: Implement the algorithm to calculate the computer player's move
        // The algorithm should take into account the current state of the board, the computer player's color, and the depth of the search
        return null;
    }
}