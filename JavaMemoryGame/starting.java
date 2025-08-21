import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class starting {

    // Creates a pairs of numbers 1-10. 1,1,2,2, etc.
    public static Integer[] numberSet() {
        int number;
        Integer [] array = new Integer[20];
        for (number = 0; number<10; number++) {
            array[number] = number+1;
            array[number+10] = number+1;
        }
        Arrays.sort(array);
        return array;
    }

    public static Integer[] shuffler(Integer[] array) {
        Integer[] arr = array;
        List<Integer> numberList = Arrays.asList(arr);
        Collections.shuffle(numberList);
        Integer[] shuffled = numberList.toArray(new Integer[0]);
        return shuffled;
    }

    public static Integer[][] board(Integer[] shuffledList) {
        Integer[][] twoD = new Integer[4][5];
        int index = 0; // keeps track of shuffledList index
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = shuffledList[index++];
            }
        }
        return twoD;
    }

    public static void printBoard(Object[][] board) {
        for (Object[] row : board) {
            for (Object item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    public static Object[][] emptyBoard() {
        Object[][] empty = new Object[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                empty[i][j] = "[ ]";
            }
        }
        return empty;
    }

    public static void main(String[] args) {
        Integer[][] board = board(shuffler(numberSet()));
        Object[][] emptyBoard = emptyBoard();

        // testing purpose, don't delete yet
        printBoard(board);
        printBoard(emptyBoard);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Position 1: ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println("\n");
        System.out.print("Enter Position 2: ");

        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        System.out.println("P1: " + board[input1][input2]);
        System.out.println("P2: " + board[input3][input4]);

        // checks if the two position are a match
        if (board[input1][input2].equals(board[input3][input4])) {
            // if match -> set empty board values for future reference
            emptyBoard[input1][input2] = board[input1][input2];
            emptyBoard[input3][input4] = board[input3][input4];
        }

        printBoard(emptyBoard);

        sc.close();
        
    }

}
