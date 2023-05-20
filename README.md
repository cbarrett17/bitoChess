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
├── King.java
├── Queen.java
├── Rook.java
├── Bishop.java
├── Knight.java
├── Pawn.java
├── Board.java
├── Player.java
├── Game.java
├── Spot.java
└── ComputerPlayer.java
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