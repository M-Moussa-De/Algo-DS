// T_best = O(n)
// T_avg = T_worst = O(n^2) for the selection sort algorithm
// Gaussian => (n + 1) / 2

/*
 * Properties:
 * - Stable sorting algorithm
 * - In-place algorithm (no extra array required)
 * - Simple but inefficient for large datasets
*/

public class BubbleSort {

    void main() {
        int[] array = Utils.randomArr(10);

        Utils.print(array);
        long startTime = System.currentTimeMillis();
        bubbleSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " ms");
        Utils.print(array);

    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

        } while (swapped);
    }
}