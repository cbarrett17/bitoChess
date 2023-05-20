import java.awt.*;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, Color color) {
        super(name, color, true);
        this.scanner = new Scanner(System.in);
    }
}