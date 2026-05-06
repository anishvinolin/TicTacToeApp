import java.util.Random;

class TicTacToe {
    private char[][] board;

    // Constructor to initialize board
    public TicTacToe() {
        board = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-'; // empty cell
            }
        }
    }

    // Display board
    public void displayBoard() {
        System.out.println("\nBoard:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC6: Place Move on Board
    public boolean placeMove(int row, int col, char symbol) {

        // Check valid index
        if(row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid position!");
            return false;
        }

        // Check if cell is empty
        if(board[row][col] != '-') {
            System.out.println("Cell already occupied!");
            return false;
        }

        // Place symbol
        board[row][col] = symbol;
        return true;
    }
}