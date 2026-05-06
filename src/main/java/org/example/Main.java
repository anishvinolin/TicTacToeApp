import java.util.Random;

public static void gameLoop() {

    boolean gameOver = false;

    while (!gameOver) {

        printBoard();

        // Player Turn
        playerMove();
        if (checkWin('X')) {
            printBoard();
            System.out.println("Player wins!");
            gameOver = true;
            break;
        }

        if (isDraw()) {
            printBoard();
            System.out.println("Game is a draw!");
            break;
        }

        // Computer Turn
        computerMove();
        if (checkWin('O')) {
            printBoard();
            System.out.println("Computer wins!");
            gameOver = true;
            break;
        }

        if (isDraw()) {
            printBoard();
            System.out.println("Game is a draw!");
            break;
        }
    }
}

public static void main(String[] args) {
    gameLoop();
}
}