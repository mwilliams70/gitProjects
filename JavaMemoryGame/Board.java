import java.util.Arrays;

public class Board {
    private final static int ROWS = 4;
    private final static int COLS = 5;
    private final static int TOTAL_NUMBERS = 20;
    
    public Board() {
        Integer[] set = Functionality.shuffler(numberSet());
        Integer[][] gameBoard = board(set);
        Object[][] emptyBoard = emptyBoard();
    }

    // Creates a pairs of numbers 1-10. 1,1,2,2, etc.
    public Integer[] numberSet() {
        int number;
        Integer [] array = new Integer[TOTAL_NUMBERS];
        for (number = 0; number<10; number++) {
            array[number] = number+1;
            array[number+10] = number+1;
        }
        Arrays.sort(array);
        return array;
    }

    public Integer[][] board(Integer[] shuffledList) {
        Integer[][] twoD = new Integer[ROWS][COLS];
        int index = 0; // keeps track of shuffledList index
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                twoD[i][j] = shuffledList[index++];
            }
        }
        return twoD;
    }

    

    public Object[][] emptyBoard() {
        Object[][] empty = new Object[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                empty[i][j] = "[ ]";
            }
        }
        return empty;
    }
}
