import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {

        Board gameBoard = new Board();
        Functionality.printBoard(gameBoard.getGameBoard());

        Scanner sc = new Scanner(System.in);
        boolean finished = false;
        while (!finished) {
            Functionality.printBoard(gameBoard.getEmptyBoard());
            System.out.print("Enter Position 1: ");
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();

            System.out.println("\n");
            System.out.print("Enter Position 2: ");

            int input3 = sc.nextInt();
            int input4 = sc.nextInt();

            /**
             * Stores the values of inputted position
             * 
             * Position 1: 0 0 = 1
             * Position 2: 3 2 = 1
             * etc.
             */
            int p1 = gameBoard.getGameBoard()[input1][input2];
            int p2 = gameBoard.getGameBoard()[input3][input4];

            System.out.println("P1: " + p1);
            System.out.println("P2: " + p2);

            // checks if the two position are a match
            if (p1 == p2) {
                // if match -> set empty board values for future reference
                gameBoard.getEmptyBoard()[input1][input2] = p1;
                gameBoard.getEmptyBoard()[input3][input4] = p2;
            } else {
                // will show your choices but if no match, reset them
                Functionality.clearScreen();
                gameBoard.getEmptyBoard()[input1][input2] = p1;
                gameBoard.getEmptyBoard()[input3][input4] = p2;
                Functionality.printBoard(gameBoard.getEmptyBoard());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                Functionality.clearScreen();
                gameBoard.getEmptyBoard()[input1][input2] = "[ ]";
                gameBoard.getEmptyBoard()[input3][input4] = "[ ]";
                continue;
            }
            Functionality.clearScreen();

            finished = true;
            for (Object[] row : gameBoard.getEmptyBoard()) {
                for (Object item : row) {
                    if (item.equals("[ ]")) {
                        finished = false;
                        break;
                    }
                }
                if (!finished) break;
            }

            if (finished) {
                System.out.println("Game Over! All Numbers Matched!");
            }
        }
        sc.close();      
    }
}
