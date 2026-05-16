// T_best = T_avg = T_worst = O(n^2) for the selection sort algorithm
// Gaussian => (n + 1) / 2

/*
 * Properties:
 * - Not stable sorting algorithm
 * - In-place algorithm (no extra array required)
 * - Simple but inefficient for large datasets
 * - Performs (n - 1) + (n - 2) + ... + 1 comparisons
 */

public class SelectionSort {
    void main() {
        int[] array = Utils.randomArr(1000);

        Utils.print(array);
        long startTime = System.currentTimeMillis();
        selectionSort(array);
        long endTime = System.currentTimeMillis();
        Utils.print(array);
        System.out.println("It took " + (endTime - startTime) + " ms");
    }

    void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int curr = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < curr) swap(array, i, j);
            }
        }

    }

    void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}