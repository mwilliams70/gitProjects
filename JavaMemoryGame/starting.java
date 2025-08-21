import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public static void main(String[] args) {
        Integer[] list = shuffler(numberSet());
        System.out.println(Arrays.toString(list));
        Integer[][] twoD = new Integer[4][5];
        int index = 0;
        for (int j = 0; j < 4; j++){
            for (int k = 0; k < 5; k++) {
                twoD[j][k] = list[index++];
            }
        }
        
        for (Integer[] row : twoD) {
            System.out.println(Arrays.toString(row));
        }
    }

}
