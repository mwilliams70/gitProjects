public class MemoryGame {
    public static void main(String[] args) {

        Board gameBoard = new Board();
        Functionality.printBoard(gameBoard.set);

        // // Integer[][] board = board(shuffler(numberSet())); 
        // Integer[][] board = board(numberSet());
        // Object[][] emptyBoard = emptyBoard();

        // // testing purpose, don't delete yet
        // printBoard(board);

        // System.out.print(" ");
        // for (int i = 0; i < 5; i++) {
        //     System.out.printf("%-8d", i);
        // }
        // System.out.println();

        // Scanner sc = new Scanner(System.in);
        // boolean finished = false;
        // while (!finished) {
        //     printBoard(emptyBoard);
        //     System.out.print("Enter Position 1: ");
        //     int input1 = sc.nextInt();
        //     int input2 = sc.nextInt();

        //     System.out.println("\n");
        //     System.out.print("Enter Position 2: ");

        //     int input3 = sc.nextInt();
        //     int input4 = sc.nextInt();

        //     System.out.println("P1: " + board[input1][input2]);
        //     System.out.println("P2: " + board[input3][input4]);

        //     // checks if the two position are a match
        //     if (board[input1][input2].equals(board[input3][input4])) {
        //         // if match -> set empty board values for future reference
        //         emptyBoard[input1][input2] = board[input1][input2];
        //         emptyBoard[input3][input4] = board[input3][input4];
        //     } else {
        //         // will show your choices but if no match, reset them
        //         clearScreen();
        //         emptyBoard[input1][input2] = board[input1][input2];
        //         emptyBoard[input3][input4] = board[input3][input4];
        //         printBoard(emptyBoard);
        //         try {
        //             Thread.sleep(3000);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //             Thread.currentThread().interrupt();
        //         }
        //         clearScreen();
        //         emptyBoard[input1][input2] = "[ ]";
        //         emptyBoard[input3][input4] = "[ ]";
        //         continue;
        //     }
        //     clearScreen();

        //     finished = true;
        //     for (Object[] row : emptyBoard) {
        //         for (Object item : row) {
        //             if (item.equals("[ ]")) {
        //                 finished = false;
        //                 break;
        //             }
        //         }
        //         if (!finished) break;
        //     }

        //     if (finished) {
        //         System.out.println("Game Over! All Numbers Matched!");
        //     }
        // }
        // sc.close();      
    }
}
