# bitoChess
Chess project aided by Bito

# Project Design

1. Introduction:
   - The game of chess is a two-player strategy board game that has been played for centuries
   - The goal of chess is to checkmate the opponent's king, which means that the king is under attack and cannot escape capture
   - In this project, we will be creating a one person chess game in Java that allows the player to play against the computer

2. Objectives:
   - Create a graphical user interface (GUI) that displays the chess board and pieces
   - Implement the basic rules of chess, including legal moves for each type of piece and checkmate conditions
   - Create an algorithm for the computer player to make moves based on a simple strategy
   - Allow the player to undo moves and save and load games

3. Design:
   - The GUI will be designed using Java Swing components, including JFrames, JPanels, and JLabels
   - The chess board will be represented using a two-dimensional array of ChessPiece objects, with each piece having a specific type (e.g. king, queen, etc.) and color (black or white)
   - The rules of chess will be implemented using a combination of if-else statements and switch statements that check the legality of each move based on the type of piece being moved and the current state of the board
   - The computer player will use a simple algorithm that randomly selects a legal move from a list of all possible moves
   - The program will use file I/O to save and load games in a text file format

4. Implementation:
   - The GUI will be implemented using Java Swing components, and event listeners will be used to detect user input and update the board accordingly
   - The chess board will be represented using a two-dimensional array of ChessPiece objects, with each piece having a specific type (e.g. king, queen, etc.) and color (black or white)
   - The rules of chess will be implemented using a combination of if-else statements and switch statements that check the legality of each move based on the type of piece being moved and the current state of the board
   - The computer player will use a simple algorithm that randomly selects a legal move from a list of all possible moves
   - The program will use file I/O to save and load games in a text file format

5. Testing:
   - The program will be thoroughly tested using a combination of unit tests and user testing to ensure that all features are working as expected and that the game is fun and engaging to play

6. Conclusion:
   - In this project, we have created a one person chess game in Java that allows the player to play against the computer
   - The game implements the basic rules of chess and includes a simple computer player that uses a random move algorithm
   - By allowing players to save and load games, the program offers a convenient way to enjoy the game of chess on a computer.

# Class Design

1. Game Class:
   - This class will be the main driver class that contains the main method to start the game
   - It will handle the initialization of the chess board and the creation of the GUI
   - It will also be responsible for updating the GUI based on user input and the state of the game

2. Board Class:
   - This class will contain an 8x8 array of ChessSquare objects
   - It will be responsible for initializing the board and updating the squares based on the state of the game
   - It will also check for checkmate and stalemate conditions
       ##### Disclaimer:
     - The  *halfMoveClock*  variable is a field in the  Board  class that keeps track of the number of half-moves since the last pawn move or capture. 
       - In chess, a "half-move" refers to one player making a move followed by their opponent making a move. 
       - Counting half-moves is a way of keeping track of how long it has been since any progress has been made in the game, which is important for certain rules, such as the 50-move rule. 
       - The 50-move rule states that a player can claim a draw if 50 consecutive moves are made where neither player makes a capture or moves a pawn. 
       - The  *halfMoveClock*  variable is used to keep track of the number of consecutive moves where no pawn move or capture has been made, so that a draw can be claimed when this number reaches 50. 
       - The variable is reset to 0 whenever a pawn is moved or a capture is made.
     - The  *fullMoveCount*  variable is a field in the  Board  class that keeps track of the number of full moves made in the game. 
       - In chess, a "full move" refers to one player making a move followed by their opponent making a move. 
       - It is used to keep track of how many full moves have been made in the game so far, which is important for certain chess notation systems such as the Forsyth-Edwards Notation (FEN). 
       - The variable is incremented by 1 after each move made by the black player, so that it accurately reflects the total number of full moves made in the game at any given time. 
       - The  *fullMoveCount*  is used in FEN to represent the number of full moves made in the game so far.

3. Spot Class:
   - This class will represent a single square on the chess board
   - It will contain information about its location, its color, and whether it contains a piece
   - It will also be responsible for updating its appearance on the GUI

4. Piece Class:
   - This abstract class will define the basic properties and methods of a chess piece
   - It will include information about its color, location, and type (e.g. pawn, knight, etc.)
   - It will also include methods for checking the legality of moves and updating the board when a move is made
   - Implementations 
     - Pawn, Rook, Bishop, Knight, Queen, and King Classes:
       * These classes will extend the ChessPiece class and define the specific properties and methods of each type of piece
       * They will be responsible for checking the legality of moves and updating the board when a move is made

6. ComputerPlayer Class:
   - This class will be responsible for generating moves for the computer player
   - It will use a simple algorithm to select a random legal move from a list of possible moves
   - It will also be responsible for updating the board and triggering the appropriate events on the GUI

7. ChessGUI Class:
   - This class will create the graphical user interface for the game
   - It will display the chess board and pieces, and allow the user to make moves by clicking on the appropriate squares
   - It will also include buttons for undoing moves and saving and loading games

These classes will work together to create a fully functioning one person chess game in Java.

# Project Diagram

src/
├── ChessPiece.java
│   ├── King.java
│   ├── Queen.java
│   ├── Rook.java
│   ├── Bishop.java
│   ├── Knight.java
│   └── Pawn.java
├── Board.java
├── Player.java
│   ├── CompPlayer.java
│   └── HumanPlayer.java
├── Game.java
├── Spot.java
├── gui/
│   ├── BoardGUI.java
│   ├── PieceGUI.java
│   └── SquareGUI.java
├── test/
│   ├── BoardTest.java
│   ├── KingTest.java
│   ├── QueenTest.java
│   ├── RookTest.java
│   ├── BishopTest.java
│   ├── KnightTest.java
│   ├── PawnTest.java
│   ├── BoardGUITest.java
│   ├── PlayerTest.java
│   └── GameTest.java

# Design Decisions

Q: Should `Move` be an object or should a `makeMove` method be added to the `Player` class?

A: It depends on your design requirements and preferences. Both options can be valid, but they have different trade-offs.

If you choose to make  `Move`  an object, you can encapsulate the move data (such as source, target, and player) and pass it around as a parameter, 
making it easier to work with and test the move separately from other player logic. It also allows you to store a history of moves, 
which may be useful for things like undo/redo functionality. However, it requires an additional class and abstraction layer, which may add some overhead and complexity to your design.

On the other hand, if you choose to add a  `makeMove`  method to the  `Player`  class, you can keep your design simpler and more focused on the player logic. 
The move data is directly managed and executed by the player, which can simplify the code and reduce the number of objects needed. 
However, it may be more difficult to test the move as a separate entity and can make it harder to implement additional features like undo/redo functionality.

Ultimately, the decision depends on your specific needs and preferences. 
If you think that the move data encapsulation and historical tracking benefits of having a  `Move`  object outweigh the additional overhead and complexity, 
then you should choose that option. Conversely, if you prefer a simpler and more direct approach that keeps the player logic focused on the move execution, 
then adding a  `makeMove`  method to the  `Player`  class may be the better choice.