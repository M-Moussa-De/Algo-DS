// T_best = T_avg = T_worst = O(n^2) for the selection sort algorithm
// Gaussian => (n + 1) / 2

void main() {
  int[] array = randomArr(1000);

    print(array);
    long startTime = System.currentTimeMillis();
    selectionSort(array);
    long endTime = System.currentTimeMillis();
    print(array);
    System.out.println("It took " + (endTime - startTime) + " ms");}

void selectionSort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
        int curr = array[i];

        for (int j = i + 1; j < array.length; j++) {
            if(array[j] < curr) swap(array, i ,j);
        }
    }

}

void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}

public static int[] randomArr(int size) {
    Random random = new Random();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(size);
    }

    return arr;
}

void print(int[] array) {
    Arrays.stream(array).forEach(x -> System.out.print(x + ", " ));
    System.out.println();
}