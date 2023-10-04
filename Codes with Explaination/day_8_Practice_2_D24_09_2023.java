/*Hard Question------------------------------
7.	Multi-Dimensional Array in Java
Implement a Java program that creates a 2D array representing a tic-tac-toe board. Allow two players to take turns and update the board until one of them wins or the game ends in a draw. Implement a function to check the game's outcome.*/


/*--------------------------REMOVE THIS LINE and LINE NO. 183
import java.util.Random;
import java.util.Scanner;

// Class declaration and a brief description of the program
public class day_8_Practice_2_D24_09_2023 {
    // Declaration of a 3x3 tic-tac-toe board represented by a 2D array
    private static final char[][] board = new char[3][3];
    // Variable to keep track of the current player ('X' or 'O')
    private static char currentPlayer = 'X';

    // The main method where the game execution begins
    public static void main(String[] args) {
        // Initialize the game board
        initializeBoard();
        // Display the initial empty board
        displayBoard();

        // Variables to track the game state
        boolean gameOver = false; // Flag to indicate if the game is over
        int moves = 0; // Counter for the number of moves made

        // Ask the player if they want to play against the computer (AI)
        boolean playWithAI = chooseGameMode();

        // Main game loop that continues until the game is over
        while (!gameOver) {
            int[] move;
            if (playWithAI && currentPlayer == 'O') {
                // Computer's turn (AI)
                move = getComputerMove();
            } else {
                // Human player's turn
                move = getPlayerMove();
            }

            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) {
                // Update the board with the current player's move
                board[row][col] = currentPlayer;
                moves++;
                // Display the updated board
                displayBoard();

                // Check if the current player has won
                if (checkWin(row, col)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true;
                } else if (moves == 9) {
                    // Check if the game ends in a draw
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    // Switch to the next player for the next turn
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        // Ask if the players want to play again and restart the game if chosen
        if (playAgain()) {
            initializeBoard();
            main(args); // Start a new game
        }
        
    }
    
    // Function to initialize the game board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Initialize all cells as empty spaces
            }
        }
    }

    // Function to display the current state of the game board
    private static void displayBoard() {
        System.out.println("----------------");
        System.out.println("| A1 | B1 | C1 |");
        System.out.println("----------------");
        System.out.println("| A2 | B2 | C2 |");
        System.out.println("----------------");
        System.out.println("| A3 | B3 | C3 |");
        System.out.println("----------------");
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | "); // Display the current state of the board
            }
            System.out.println("\n-------------");
        }
    }

    // Function to get a player's move from user input
    private static int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];
        System.out.print("Player " + currentPlayer + ", enter your move (e.g., A1, B2): ");
        String input = scanner.next().toUpperCase();
        if (input.length() == 2) {
            char colChar = input.charAt(0);
            char rowChar = input.charAt(1);

            if (colChar >= 'A' && colChar <= 'C' && rowChar >= '1' && rowChar <= '3') {
                move[0] = rowChar - '1'; // Convert the row character to an index (0-2)
                move[1] = colChar - 'A'; // Convert the column character to an index (0-2)
                return move;
                
            }
        }
        
        System.out.println("Invalid move. Please enter a valid move (e.g., A1, B2).");
        return getPlayerMove(); // Recursively ask for a valid move if input is invalid
    }

    // Function to check if a move is valid (within bounds and the cell is empty)
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Function to check if the current player has won the game
    private static boolean checkWin(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkDiagonals(row, col);
    }

    // Function to check if the current player has won in a row
    private static boolean checkRow(int row) {
        return board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer;
    }

    // Function to check if the current player has won in a column
    private static boolean checkColumn(int col) {
        return board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer;
    }

    // Function to check if the current player has won in diagonals
    private static boolean checkDiagonals(int row, int col) {
        return (row == col && board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
                || (row + col == 2 && board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    // Function to choose the game mode (1 for 1v1, 2 for playing with AI)
    private static boolean chooseGameMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a game mode (1 for 1v1, 2 for playing with AI): ");
        int mode = scanner.nextInt();
        return mode == 2; // Return true if playing with AI
    }

    // Function to ask if the players want to play again
    private static boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Play again? (1 for yes, 0 for no): ");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    // Function to implement the computer AI logic (currently random moves)
    private static int[] getComputerMove() {
        // Implement your AI strategy here
        // For simplicity, you can generate random moves for the computer
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!isValidMove(row, col));
        System.out.println("Computer chose: " + (char) ('A' + col) + (row + 1));
        return new int[]{row, col};
    }
}
--------------------------REMOVE THIS LINE and LINE NO. 6*/

/*

Algorithm: Tic-Tac-Toe Game

Objective: Implement a tic-tac-toe game that allows two players to take turns until one of them wins or the game ends in a draw.

Initialization

Create a 3x3 game board represented as a 2D character array board[3][3].
Initialize all cells on the board to empty spaces (' ').
Initialize a variable currentPlayer to keep track of the current player, starting with 'X'.
Initialize a variable moves to count the number of moves, starting at 0.
Ask the player if they want to play with AI (computer).
Game Loop

Enter a loop that continues until the game is over:

a. Player's Turn

If the current player is 'X' or the player has chosen to play with AI, get the player's move using the getPlayerMove function:
Prompt the player for their move (e.g., "Player X, enter your move (e.g., A1, B2): ").
Validate the move to ensure it's within bounds and the cell is empty.
Update the game board with the player's symbol ('X' or 'O').
Increment the moves counter.
Display the updated game board.
Check if the current player has won:
Call checkWin with the player's move to check for a win.
If the player has won, display a message and set gameOver to true.
Check if the game has ended in a draw:
If moves reaches 9 (maximum possible moves), declare a draw and set gameOver to true.
Switch to the next player.
b. AI's Turn

If the current player is 'O' and the player has chosen to play with AI:
Get the computer's move using the getComputerMove function:
Implement AI logic (e.g., generate random valid moves).
Update the game board with the computer's symbol ('O').
Increment the moves counter.
Display the updated game board.
Check if the AI has won:
Call checkWin with the computer's move to check for a win.
If the AI has won, display a message and set gameOver to true.
Game Over

When the game is over (either a player wins or it's a draw), ask if the players want to play again.
If they choose to play again:
Reset the game board and variables.
Start a new game by calling the main method recursively.
If they choose not to play again, exit the program.
Winning Conditions

To check if a player has won:
Check each row for three matching symbols ('X' or 'O').
Check each column for three matching symbols.
Check both diagonals for three matching symbols.
If any of these conditions are met, declare the current player as the winner.
Time Complexity Analysis:

In the worst case, the game loop runs for a maximum of 9 moves (3x3 grid).
For each move, checking for a win involves examining rows, columns, and diagonals, which takes constant time (O(1)).
The total time complexity is O(1) per move, and the game can have up to 9 moves.
Therefore, the overall time complexity is O(9) or simply O(1), as it's a constant number of moves.
Space Complexity Analysis:

The space complexity is determined by the game board (2D character array board), which is constant (3x3).
Therefore, the space complexity is O(1), as the amount of memory used does not depend on the input size.
This algorithm provides an efficient implementation for playing tic-tac-toe with either another player or an AI opponent, with minimal memory and computation requirements.
*/