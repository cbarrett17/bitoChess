public abstract class Player {
    private String name;
    private String color;
    private boolean isHuman;
    // Additional properties and constructors as needed
    public abstract boolean makeMove(Board board);
    public abstract boolean getForfeitStatus();
    // Additional methods as needed
}