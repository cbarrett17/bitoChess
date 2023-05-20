public abstract class Player {
    private final String _name;
    private final String _color;
    private final boolean _isHuman;

    public Player(String name, String color, boolean isHuman) {
        _name = name;
        _color = color;
        _isHuman = isHuman;
    }

    public String getName() {
        return _name;
    }

    public String getColor() {
        return _color;
    }

    public boolean getHuman() {
        return _isHuman;
    }
}