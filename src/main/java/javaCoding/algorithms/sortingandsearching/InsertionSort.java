package javaCoding.algorithms.sortingandsearching;

import java.util.Arrays;

public class InsertionSort {

    private static int SHIFT_COUNTER = 0;

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        insertionSort(arr);
        Arrays.stream(arr)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\nSHIFTS: " + SHIFT_COUNTER);
    }

    /**
     *
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        // Traverse through 1 to size of the array
        for (int i = 1; i < arr.length; i++) {
            int elem = arr[i];
            int j = i - 1;
            // shift elements to the right to make space for the elem to be inserted
            while(j >= 0 && arr[j] > elem) {
                SHIFT_COUNTER++;
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = elem;
        }
    }
}
