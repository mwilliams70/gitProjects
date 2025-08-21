import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Functionality {
    public static Integer[] shuffler(Integer[] array) {
        Integer[] arr = array;
        List<Integer> numberList = Arrays.asList(arr);
        Collections.shuffle(numberList);
        Integer[] shuffled = numberList.toArray(new Integer[0]);
        return shuffled;
    }

    public static void printBoard(Object[][] board) {
        
        System.out.print("   ");
        for (int i = 0; i < board[0].length; i++) {
            System.out.printf("%-8d", i);
        }
        System.out.println();

        
        for (int i = 0; i < board.length; i++) {
            System.out.printf("%-2d", i); 
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%-8s", board[i][j]);
            }
            System.out.println();
        }
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
