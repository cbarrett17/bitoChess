import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, String color) {
        super(name, color);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("It's " + getName() + "'s turn (" + getColor() + " pieces).");
        System.out.println(board.toString());

        while (true) {
            System.out.print("Enter your move (e.g. 'e2 e4'): ");
            String input = scanner.nextLine();

            try {
                String[] tokens = input.split(" ");
                Spot source = new Spot(tokens[0]);
                Spot target = new Spot(tokens[1]);
                Move move = new Move(getColor(), source, target);
                if (board.isValidMove(move, this)) {
                    return move;
                } else {
                    System.out.println("Invalid move: " + input);
                }
            } catch (Exception e) {
                System.out.println("Invalid input: " + input);
            }
        }
    }
}