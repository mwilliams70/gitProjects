import java.util.Arrays;

public class Board {
    protected final static int ROWS = 4;
    protected final static int COLS = 5;
    protected final static int TOTAL_NUMBERS = 20;

    private Integer[] set;
    private Integer[][] gameBoard;
    private Object[][] emptyBoard;
    
    public Board() {
        this.set = Functionality.shuffler(numberSet());
        this.gameBoard = board(this.set);
        this.emptyBoard = emptyBoard();
    }

    // gets Board fields
    public Integer[] getSet() {return set;}
    public Integer[][] getGameBoard() {return gameBoard;}
    public Object[][] getEmptyBoard() {return emptyBoard;}

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
