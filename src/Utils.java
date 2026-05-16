import java.util.Arrays;
import java.util.Random;

public class Utils {

    public static int[] randomArr(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    public static void print(int[] array) {
        Arrays.stream(array).forEach(x -> System.out.print(x + ", "));
        System.out.println();
    }
}
