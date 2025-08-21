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

    public static void main(String[] args) {
        Scanner sc = new Scanner();

        
    }

}
