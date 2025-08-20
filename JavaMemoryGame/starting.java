import java.util.Arrays;

public class starting {
    public static int[] numberSet() {
        int number;
        int [] array = new int[20];
        for (number = 0; number<10; number++) {
            array[number] = number+1;
            array[number+10] = number+1;
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] arr = numberSet();

        
        System.out.println("     1    2    3    4");
        for (int i = 0; i < 5; i++) {
            String[] blank = {i + ":  " + "[ ]", "[ ]","[ ]","[ ]","[ ]"};
            for (int j = 0; j < 4; j++) {
                System.out.print(blank[j] + "  ");
            }
            System.out.println("\n");
        }
    }

}
